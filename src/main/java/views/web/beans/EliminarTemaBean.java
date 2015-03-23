package views.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import controllers.EliminarTemaController;

@ManagedBean
public class EliminarTemaBean extends ViewBean{
	
	@ManagedProperty(value = "#{param.id}")
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

	public String process() {
		if(this.identificacion == IDENTIFICADOR){
			eliminarTemaController = this.getFactory().getEliminarTemaController();
			eliminarTemaController.eliminarTema(eliminarTemaController.findTema(this.id));
			return "listaTemas";
		}else{
			return "pantallaError";
		}
		
	}

}
