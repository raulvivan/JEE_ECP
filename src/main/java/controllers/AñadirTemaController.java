package controllers;

import modelos.daos.DaoFactory;
import modelos.daos.TemaDao;
import modelos.daos.jpa.DaoJpaFactory;
import modelos.entities.Tema;

public class AñadirTemaController {
	
	private TemaDao temaDao;
	
	public AñadirTemaController(){
		DaoFactory.setFactory(new DaoJpaFactory());
		temaDao = DaoFactory.getFactory().getTemaDao();
	}

	public void añadirTema(Tema tema) {
		temaDao.create(tema);
		
	}

}
