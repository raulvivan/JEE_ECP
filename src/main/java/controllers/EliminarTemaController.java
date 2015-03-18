package controllers;

import modelos.daos.DaoFactory;
import modelos.daos.TemaDao;
import modelos.daos.VotoDao;
import modelos.daos.jpa.DaoJpaFactory;
import modelos.entities.Tema;
import modelos.entities.Voto;

public class EliminarTemaController {
	
	private TemaDao temaDao;
	
	private VotoDao votoDao;
	
	public EliminarTemaController(){
		DaoFactory.setFactory(new DaoJpaFactory());
		temaDao = DaoFactory.getFactory().getTemaDao();
		votoDao = DaoFactory.getFactory().getVotoDao();
	}

	public void eliminarTema(Tema tema) {
		temaDao.deleteById(tema.getId());
		for(Voto voto: tema.getVotos()){
			votoDao.deleteById(voto.getId());
		}
	}

	public Tema findTema(int id) {
		return temaDao.read(id);
	}

}
