package controllers;

import java.util.List;

import modelos.daos.DaoFactory;
import modelos.daos.TemaDao;
import modelos.daos.jpa.DaoJpaFactory;
import modelos.entities.Tema;

public class MostrarTemaController {

	private TemaDao temaDao;
	
	public MostrarTemaController(){
		DaoFactory.setFactory(new DaoJpaFactory());
		temaDao = DaoFactory.getFactory().getTemaDao();
	}
	
	public List<Tema> findTemas() {
		return temaDao.findAll();
	}
}
