package views.web.beans;

import controllers.AņadirTemaController;
import modelos.entities.Tema;

public class AņadirTemaBean extends ViewBean{
	
	private Tema tema;
	
	private AņadirTemaController aņadirTemaController;
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	public void aņadirTema(){
		aņadirTemaController.aņadirTema(tema);
	}

	public void process() {
		aņadirTemaController = this.getFactory().getAņadirTemaController();
		this.aņadirTema();
	}

}
