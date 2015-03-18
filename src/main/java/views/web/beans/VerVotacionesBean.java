package views.web.beans;

import java.util.Map;

import controllers.VerVotacionesController;
import modelos.entities.Tema;

public class VerVotacionesBean extends ViewBean{
	
	private Tema tema;
	
	private int id;
	
	private Map<String, Integer> parametros;
	
	private VerVotacionesController verVotacionesController;

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	public Map<String, Integer> getParametros() {
		return parametros;
	}

	public void setParametros(Map<String, Integer> parametros) {
		this.parametros = parametros;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void update() {
		verVotacionesController = this.getFactory().getVotacionesController();
		tema = verVotacionesController.findTema(id);
		this.parametros = verVotacionesController.calcularParametros(tema.getVotos());
	}

}
