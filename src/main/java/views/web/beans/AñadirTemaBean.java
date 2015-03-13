package views.web.beans;

import controllers.AņadirTemaController;
import modelos.entities.Tema;

public class AņadirTemaBean extends ViewBean{
	
	private Tema tema;
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	public void aņadirTema(){
		AņadirTemaController aņadirTemaController = this.getFactory().getAņadirTemaController();
		aņadirTemaController.aņadirTema(tema);
	}

}
