package views.web.beans;

import java.util.List;

import controllers.ControllerFactoryEJB;
import controllers.MostrarTemaController;
import modelos.entities.Tema;

public class ListaTemasBean extends ViewBean{
	
	private List<Tema> temas;

	public List<Tema> getTemas() {
		return temas;
	}

	public void setTemas(List<Tema> temas) {
		this.temas = temas;
	}
	
	public void findTemas(){
		this.setFactory(new ControllerFactoryEJB());
		MostrarTemaController mostrarController = this.getFactory().getMostrarTemaController();
		temas = mostrarController.findTemas();

		
	}

}
