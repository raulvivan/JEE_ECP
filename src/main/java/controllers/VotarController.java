package controllers;

import modelos.daos.DaoFactory;
import modelos.daos.TemaDao;
import modelos.daos.VotoDao;
import modelos.daos.jpa.DaoJpaFactory;
import modelos.entities.Tema;
import modelos.entities.Voto;

public class VotarController {
	
	private VotoDao votoDao;
	private TemaDao temaDao;
	
	public VotarController(){
		DaoFactory.setFactory(new DaoJpaFactory());
		votoDao = DaoFactory.getFactory().getVotoDao();
		temaDao = DaoFactory.getFactory().getTemaDao();
	}

	public void votar(Voto voto) {
		votoDao.create(voto);
	}

	public Tema findTema(int id) {
		return temaDao.read(id);
	}

}
