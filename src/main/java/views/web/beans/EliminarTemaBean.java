package views.web.beans;

import controllers.EliminarTemaController;

public class EliminarTemaBean extends ViewBean{
	
	private int id;
	
	private EliminarTemaController eliminarTemaController;
	
	public static final int IDENTIFICADOR = 666;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void eliminarTema(){
		eliminarTemaController.eliminarTema(this.id);
	}

	public void process() {
		eliminarTemaController = this.getFactory().getEliminarTemaController();
		this.eliminarTema();
	}

}
