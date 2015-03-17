package views.web.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import controllers.MostrarTemaController;
import modelos.entities.Tema;

@ManagedBean
public class ListaTemasBean extends ViewBean{
	
	private List<Tema> temas;
	
	private MostrarTemaController mostrarController;
	
	public ListaTemasBean(){
		
	}

	public List<Tema> getTemas() {
		return temas;
	}

	public void setTemas(List<Tema> temas) {
		this.temas = temas;
	}
	
	public void update(){		
		mostrarController = this.getFactory().getMostrarTemaController();
		this.findTemas();
	}
	
	@PostConstruct
	public void findTemas(){
		temas = mostrarController.findTemas();	
	}

}
