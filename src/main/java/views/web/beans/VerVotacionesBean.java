package views.web.beans;

import java.util.List;

import controllers.ControllerFactoryEJB;
import controllers.VerVotacionesController;
import modelos.entities.Tema;
import modelos.entities.Voto;

public class VerVotacionesBean extends ViewBean{
	
	private Tema tema;
	
	private int cantidad;
	
	private int nivelBajo;
	
	private int nivelMedio;
	
	private int nivelAlto;

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getNivelBajo() {
		return nivelBajo;
	}

	public void setNivelBajo(int nivelBajo) {
		this.nivelBajo = nivelBajo;
	}

	public int getNivelMedio() {
		return nivelMedio;
	}

	public void setNivelMedio(int nivelMedio) {
		this.nivelMedio = nivelMedio;
	}

	public int getNivelAlto() {
		return nivelAlto;
	}

	public void setNivelAlto(int nivelAlto) {
		this.nivelAlto = nivelAlto;
	}
	
	public void findTema(int id){
		this.setFactory(new ControllerFactoryEJB());
		VerVotacionesController votacionesController = this.getFactory().getVotacionesController();
		tema = votacionesController.findTema(id);
		calcularParametros(tema.getVotos());
	}
	
	public void calcularParametros(List<Voto> votos){
		this.cantidad = 0;
		int valoracionNivelBajo = 0;
		int cantidadNivelBajo = 0;
		int valoracionNivelMedio = 0;
		int cantidadNivelMedio = 0;
		int valoracionNivelAlto = 0;
		int cantidadNivelAlto = 0;
		for(Voto voto: votos){
			this.cantidad++;
			switch(voto.getEstudios()){
			case NIVEL_BAJO:
				cantidadNivelBajo++;
				valoracionNivelBajo +=voto.getValoracion();
				break;
			case NIVEL_MEDIO:
				cantidadNivelMedio++;
				valoracionNivelMedio +=voto.getValoracion();
				break;
			case NIVEL_ALTO:
				cantidadNivelAlto++;
				valoracionNivelAlto +=voto.getValoracion();
				break;
			}
		}
		if(cantidadNivelBajo != 0)
			this.nivelBajo = valoracionNivelBajo/cantidadNivelBajo;
		else
			this.nivelBajo = 0;
		
		if(cantidadNivelMedio != 0)
			this.nivelMedio = valoracionNivelMedio/cantidadNivelMedio;
		else
			this.nivelMedio = 0;
		
		if(cantidadNivelAlto != 0)
			this.nivelAlto = valoracionNivelAlto/cantidadNivelAlto;
		else
			this.nivelAlto = 0;
	}

}
