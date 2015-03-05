package modelos.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tema {

	public static final String TABLE = "Tema";
	
	public static final String ID = "id";
	
	@Id
	@GeneratedValue
	private int id;

	public static final String NOMBRE = "nombre";
	
	private String nombre;
	
	public static final String PREGUNTA = "pregunta";
	private String pregunta;
	
	public static final String VOTO = "voto";
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Voto> votos;
	
	

	public Tema() {
		super();
	}


	public Tema(String nombre, String pregunta, List<Voto> votos) {
		super();
		this.nombre = nombre;
		this.pregunta = pregunta;
		this.votos = votos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPregunta() {
		return pregunta;
	}


	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}


	public List<Voto> getVotos() {
		return votos;
	}


	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	
	
	
}
