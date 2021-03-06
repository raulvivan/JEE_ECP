package controllers;

import modelos.daos.DaoFactory;
import modelos.daos.TemaDao;
import modelos.daos.jpa.DaoJpaFactory;
import modelos.entities.Tema;

public class VotarController{
	
	private TemaDao temaDao;
	
	public VotarController(){
		DaoFactory.setFactory(new DaoJpaFactory());
		temaDao = DaoFactory.getFactory().getTemaDao();
	}

	public void votar(Tema tema) {
		temaDao.update(tema);
	}
	
	public Tema findTema(int id) {
		return temaDao.read(id);
	} 

}
