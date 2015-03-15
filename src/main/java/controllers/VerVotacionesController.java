package controllers;

import modelos.daos.DaoFactory;
import modelos.daos.TemaDao;
import modelos.daos.jpa.DaoJpaFactory;
import modelos.entities.Tema;

public class VerVotacionesController {
	TemaDao temaDao;
	
	public VerVotacionesController(){
		DaoFactory.setFactory(new DaoJpaFactory());
		temaDao = DaoFactory.getFactory().getTemaDao();
	}

	public Tema findTema(int id) {
		return temaDao.read(id);
	}
}
