package modelos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import modelos.utils.Estudios;


@Entity
public class Voto {

	public static final String TABLE = "Voto";
	
	public static final String ID = "id";
	
	@Id
	@GeneratedValue
	private int id;
	
	public static final String VALORACION = "valoracion";
	private int valoracion;
	
	public static final String IP = "ip";
	private String ip;
	
	public static final String ESTUDIOS = "estudios";
	private Estudios estudios;
	
	public Voto() {
		super();
	}

	public Voto(int valoracion, String ip, Estudios estudios) {
		super();
		this.valoracion = valoracion;
		this.ip = ip;
		this.estudios = estudios;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Estudios getEstudios() {
		return estudios;
	}

	public void setEstudios(Estudios estudios) {
		this.estudios = estudios;
	}
	
	
	

}
