package views.web.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import controllers.VotarController;
import modelos.entities.Tema;
import modelos.entities.Voto;
import modelos.utils.Estudios;

@ManagedBean
public class VotarBean extends ViewBean{
	
	@ManagedProperty(value = "#{param.id}")
	private int id;
	
	private Tema tema;

	private Voto voto;
	
	private VotarController votarController;
	
	private Estudios[] estudios;
	
	public VotarBean(){
		voto = new Voto();
	}

	public Voto getVoto() {
		return voto;
	}

	public void setVoto(Voto voto) {
		this.voto = voto;
	}

    public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Estudios[] getEstudios() {
		return estudios;
	}

	public void setEstudios(Estudios[] estudios) {
		this.estudios = estudios;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@PostConstruct
	public void update(){
		votarController = this.getFactory().getVotarController();
		this.estudios = Estudios.values();
		this.findTema();
	}
	
	public String process(){
		votarController = this.getFactory().getVotarController();
		this.findTema();
		this.añadirVoto();
		return "listaTemas";
	}

	public void findTema() {
		tema = votarController.findTema(this.id);
	}

	public void añadirVoto() {
		tema.putVoto(voto);
		votarController.votar(tema);
	}
	
	

}
