package views.web.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import controllers.MostrarTemaController;
import modelos.entities.Tema;

@ManagedBean
public class ListaTemasBean extends ViewBean{
	private List<Tema> temas;
	
	private MostrarTemaController mostrarTemaController;
	
	public ListaTemasBean(){
		
	}

	public List<Tema> getTemas() {
		return temas;
	}

	public void setTemas(List<Tema> temas) {
		this.temas = temas;
	}
	@PostConstruct
	public void update(){		
		mostrarTemaController = this.getFactory().getMostrarTemaController();
		this.findTemas();
	}
	
	
	public void findTemas(){
		temas = mostrarTemaController.findTemas();	
	}

}
