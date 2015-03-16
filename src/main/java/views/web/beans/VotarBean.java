package views.web.beans;

import org.apache.logging.log4j.LogManager;

import controllers.ControllerFactoryEJB;
import controllers.VotarController;
import modelos.entities.Tema;
import modelos.entities.Voto;

public class VotarBean extends ViewBean{
	
	private String errorMsg;
	
	private Tema tema;

	private Voto voto;

	public Voto getVoto() {
		return voto;
	}

	public void setVoto(Voto voto) {
		this.voto = voto;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

    public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public String process() {
        if (voto.getValoracion()< 0 || voto.getValoracion() > 10) {
            LogManager.getLogger(VotarBean.class).debug(
                    "Los datos introducidos al votar no son correctos o faltan");
            return "home";
        }else{
        	return "votar";
        }
    }

	public void findTema(int id) {
		this.setFactory(new ControllerFactoryEJB());
		VotarController votarController = this.getFactory().getVotarController();
		tema = votarController.findTema(id);
	}

	public void añadirVoto() {
		this.setFactory(new ControllerFactoryEJB());
		VotarController votarController = this.getFactory().getVotarController();
		tema.putVoto(voto);
		votarController.votar(tema);
	}
	
	

}
