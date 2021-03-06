package controllers;

import modelos.daos.DaoFactory;
import modelos.daos.TemaDao;
import modelos.daos.jpa.DaoJpaFactory;
import modelos.entities.Tema;

public class AņadirTemaController {
	
	private TemaDao temaDao;
	
	public AņadirTemaController(){
		DaoFactory.setFactory(new DaoJpaFactory());
		temaDao = DaoFactory.getFactory().getTemaDao();
	}

	public void aņadirTema(Tema tema) {
		temaDao.create(tema);
		
	}

}
