package views.web.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import controllers.A�adirTemaController;
import modelos.entities.Tema;

@ManagedBean
public class A�adirTemaBean extends ViewBean{
	
	private Tema tema;
	
	private A�adirTemaController a�adirTemaController;
	
	public A�adirTemaBean(){
		this.tema = new Tema();
	}
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	public void a�adirTema(){
		a�adirTemaController.a�adirTema(tema);
	}
	@PostConstruct
	public void process() {
		a�adirTemaController = this.getFactory().getA�adirTemaController();
		this.a�adirTema();
	}

}
