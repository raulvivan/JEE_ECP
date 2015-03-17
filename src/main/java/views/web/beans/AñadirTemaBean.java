package views.web.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import controllers.AñadirTemaController;
import modelos.entities.Tema;

@ManagedBean
public class AñadirTemaBean extends ViewBean{
	
	private Tema tema;
	
	private AñadirTemaController añadirTemaController;
	
	public AñadirTemaBean(){
		this.tema = new Tema();
	}
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	public void añadirTema(){
		añadirTemaController.añadirTema(tema);
	}
	@PostConstruct
	public void process() {
		añadirTemaController = this.getFactory().getAñadirTemaController();
		this.añadirTema();
	}

}
