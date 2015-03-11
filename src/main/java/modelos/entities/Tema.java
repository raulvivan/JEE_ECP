package modelos.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
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
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Voto> votos;
	
	

	public Tema() {
		super();
	}


	public Tema(String nombre, String pregunta) {
		super();
		this.nombre = nombre;
		this.pregunta = pregunta;
		this.votos = new ArrayList<Voto>();
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
	
	public void putVoto(Voto voto){
		this.votos.add(voto);
	}
	
	public String toString(){
		return "Tema: "+nombre+" \nPregunta: "+pregunta+" \n"+votos.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.nombre.equals(((Tema) obj).getNombre());
	}
	
	public static void main(String[] args) {
        JpaFactory.dropAndCreateTables();
        EntityManager em = JpaFactory.getEntityManagerFactory().createEntityManager();

        em.getTransaction().begin();

        em.getTransaction().commit();
        
    }
	
	
}
