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
		assert(valoracion<=0 && valoracion >= 10):"La valoracion debe estar entre 0 y 10";
		this.valoracion = valoracion;
		this.ip = ip;
		this.estudios = estudios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public String toString(){
		return "Valoracion: "+valoracion+" \nIP: "+ip+" \nEstudios: "+estudios;
	}
	
	
	

}
