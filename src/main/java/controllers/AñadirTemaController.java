package controllers;

import modelos.daos.DaoFactory;
import modelos.daos.TemaDao;
import modelos.daos.jpa.DaoJpaFactory;
import modelos.entities.Tema;

public class A�adirTemaController {
	
	private TemaDao temaDao;
	
	public A�adirTemaController(){
		DaoFactory.setFactory(new DaoJpaFactory());
		temaDao = DaoFactory.getFactory().getTemaDao();
	}

	public void a�adirTema(Tema tema) {
		temaDao.create(tema);
		
	}

}
