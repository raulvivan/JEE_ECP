package views.web.beans;

import controllers.A�adirTemaController;
import modelos.entities.Tema;

public class A�adirTemaBean extends ViewBean{
	
	private Tema tema;
	
	private A�adirTemaController a�adirTemaController;
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	public void a�adirTema(){
		a�adirTemaController.a�adirTema(tema);
	}

	public void process() {
		a�adirTemaController = this.getFactory().getA�adirTemaController();
		this.a�adirTema();
	}

}
