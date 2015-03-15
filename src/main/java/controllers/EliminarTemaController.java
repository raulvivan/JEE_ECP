package controllers;

import modelos.daos.DaoFactory;
import modelos.daos.TemaDao;
import modelos.daos.jpa.DaoJpaFactory;

public class EliminarTemaController {
	
	private TemaDao temaDao;
	
	public EliminarTemaController(){
		DaoFactory.setFactory(new DaoJpaFactory());
		temaDao = DaoFactory.getFactory().getTemaDao();
	}

	public void eliminarTema(int id) {
		temaDao.deleteById(id);
	}

}
