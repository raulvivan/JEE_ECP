package views.web.beans;

import controllers.A�adirTemaController;
import controllers.ControllerFactoryEJB;
import modelos.entities.Tema;

public class A�adirTemaBean extends ViewBean{
	
	private Tema tema;
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	public void a�adirTema(){
		this.setFactory(new ControllerFactoryEJB());
		A�adirTemaController a�adirTemaController = this.getFactory().getA�adirTemaController();
		a�adirTemaController.a�adirTema(tema);
	}

}
