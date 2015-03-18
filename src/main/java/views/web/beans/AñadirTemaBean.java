package views.web.beans;

import javax.faces.bean.ManagedBean;

import modelos.entities.Tema;

@ManagedBean
public class AñadirTemaBean extends ViewBean{
	
	private Tema tema;
		
	public AñadirTemaBean(){
		this.tema = new Tema();
	}
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	public String process() {
		this.getFactory().getAñadirTemaController().añadirTema(tema);
		return "listaTemas";
	}

}
