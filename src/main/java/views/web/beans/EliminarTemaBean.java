package views.web.beans;

import modelos.entities.Tema;
import controllers.EliminarTemaController;

public class EliminarTemaBean extends ViewBean{
	
	private int id;
	
	private int identificacion;
	
	private EliminarTemaController eliminarTemaController;
	
	public static final int IDENTIFICADOR = 666;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public Tema findTema(){
		return eliminarTemaController.findTema(this.id);
	}
	
	public void eliminarTema(){
		eliminarTemaController.eliminarTema(this.findTema());
	}

	public String process() {
		if(this.identificacion == IDENTIFICADOR){
			eliminarTemaController = this.getFactory().getEliminarTemaController();
			this.eliminarTema();
			return "listaTemas";
		}else{
			return "pantallaError";
		}
		
	}

}
