package views.web.beans;

import javax.faces.bean.ManagedBean;

import modelos.entities.Tema;

@ManagedBean
public class A�adirTemaBean extends ViewBean{
	
	private Tema tema;
		
	public A�adirTemaBean(){
		this.tema = new Tema();
	}
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	public String process() {
		this.getFactory().getA�adirTemaController().a�adirTema(tema);
		return "listaTemas";
	}

}
