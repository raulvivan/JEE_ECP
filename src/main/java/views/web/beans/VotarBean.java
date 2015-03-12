package views.web.beans;

import org.apache.logging.log4j.LogManager;

import modelos.entities.Tema;
import modelos.utils.Estudios;

public class VotarBean {
	
	private String errorMsg;
	
	public static final Estudios[] estudios = Estudios.values();
	
	private Tema tema;
	
	private int valoracion;
	
	private int nivelEstudios;

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public int getNivelEstudios() {
		return nivelEstudios;
	}

	public void setNivelEstudios(int nivelEstudios) {
		this.nivelEstudios = nivelEstudios;
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
        if (valoracion < 0 || valoracion > 10 || nivelEstudios < 0 || nivelEstudios > 2) {
            LogManager.getLogger(VotarBean.class).debug(
                    "Los datos introducidos al votar no son correctos o faltan");
            return "home";
        }else{
        	return "votar";
        }
    }
	
	

}
