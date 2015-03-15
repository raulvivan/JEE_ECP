package views.web.beans;

import controllers.ControllerFactoryEJB;
import controllers.EliminarTemaController;

public class EliminarTemaBean extends ViewBean{
	
	private int id;
	
	public static final int IDENTIFICADOR = 666;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void eliminarTema(){
		this.setFactory(new ControllerFactoryEJB());
		EliminarTemaController eliminarTemaController = this.getFactory().getEliminarTemaController();
		eliminarTemaController.eliminarTema(this.id);
	}

}
