package views.web.beans;

import controllers.AñadirTemaController;
import controllers.ControllerFactoryEJB;
import modelos.entities.Tema;

public class AñadirTemaBean extends ViewBean{
	
	private Tema tema;
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	public void añadirTema(){
		this.setFactory(new ControllerFactoryEJB());
		AñadirTemaController añadirTemaController = this.getFactory().getAñadirTemaController();
		añadirTemaController.añadirTema(tema);
	}

}
