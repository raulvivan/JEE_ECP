package views.web.beans;

import org.apache.logging.log4j.LogManager;

import controllers.VotarController;
import modelos.entities.Tema;
import modelos.entities.Voto;
import modelos.utils.Estudios;

public class VotarBean extends ViewBean{
	
	private String errorMsg;
	
	public static final Estudios[] estudios = Estudios.values();
	
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
		
	}

	public void añadirVoto() {
		VotarController votarController = this.getFactory().getVotarController();
		votarController.votar(voto);
	}
	
	

}
