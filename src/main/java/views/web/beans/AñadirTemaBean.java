package views.web.beans;

import controllers.AñadirTemaController;
import modelos.entities.Tema;

public class AñadirTemaBean extends ViewBean{
	
	private Tema tema;
	
	private AñadirTemaController añadirTemaController;
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	public void añadirTema(){
		añadirTemaController.añadirTema(tema);
	}

	public void process() {
		añadirTemaController = this.getFactory().getAñadirTemaController();
		this.añadirTema();
	}

}
