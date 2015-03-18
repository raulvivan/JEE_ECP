package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.daos.DaoFactory;
import modelos.daos.TemaDao;
import modelos.daos.jpa.DaoJpaFactory;
import modelos.entities.Tema;
import modelos.entities.Voto;

public class VerVotacionesController {
	TemaDao temaDao;
	
	public VerVotacionesController(){
		DaoFactory.setFactory(new DaoJpaFactory());
		temaDao = DaoFactory.getFactory().getTemaDao();
	}

	public Tema findTema(int id) {
		return temaDao.read(id);
	}
	
	public Map<String, Integer> calcularParametros(List<Voto> votos){
		Map<String, Integer> parametros = new HashMap<String, Integer>();
		parametros.put("Cantidad", 0);
		parametros.put("Media_Nivel_Bajo", 0);
		parametros.put("Media_Nivel_Medio", 0);
		parametros.put("Media_Nivel_Alto", 0);
		
		int cantidadNivelBajo = 0;
		int cantidadNivelMedio = 0;
		int cantidadNivelAlto = 0;
		
		for(Voto voto: votos){
			parametros.put("Cantidad", parametros.get("Cantidad")+1);
			switch(voto.getEstudios()){
			case NIVEL_BAJO:
				cantidadNivelBajo++;
				parametros.put("Media_Nivel_Bajo", parametros.get("Media_Nivel_Bajo")+voto.getValoracion());
				break;
			case NIVEL_MEDIO:
				cantidadNivelMedio++;
				parametros.put("Media_Nivel_Medio", parametros.get("Media_Nivel_Medio")+voto.getValoracion());
				break;
			case NIVEL_ALTO:
				cantidadNivelAlto++;
				parametros.put("Media_Nivel_Alto", parametros.get("Media_Nivel_Alto")+voto.getValoracion());
				break;
			}
		}
		if(cantidadNivelBajo != 0)
			parametros.put("Media_Nivel_Bajo", parametros.get("Media_Nivel_Bajo")/cantidadNivelBajo);
		
		if(cantidadNivelMedio != 0)
			parametros.put("Media_Nivel_Medio", parametros.get("Media_Nivel_Medio")/cantidadNivelMedio);
		
		if(cantidadNivelAlto != 0)
			parametros.put("Media_Nivel_Alto", parametros.get("Media_Nivel_Alto")/cantidadNivelAlto);
		
		return parametros;
	}
}
