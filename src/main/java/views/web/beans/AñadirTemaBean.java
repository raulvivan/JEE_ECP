package views.web.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import controllers.AņadirTemaController;
import modelos.entities.Tema;

@ManagedBean
public class AņadirTemaBean extends ViewBean{
	
	private Tema tema;
	
	private AņadirTemaController aņadirTemaController;
	
	public AņadirTemaBean(){
		this.tema = new Tema();
	}
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	public void aņadirTema(){
		aņadirTemaController.aņadirTema(tema);
	}
	@PostConstruct
	public void process() {
		aņadirTemaController = this.getFactory().getAņadirTemaController();
		this.aņadirTema();
	}

}
