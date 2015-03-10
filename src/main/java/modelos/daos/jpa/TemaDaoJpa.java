package modelos.daos.jpa;

import java.util.ArrayList;
import java.util.List;

import modelos.daos.DaoFactory;
import modelos.daos.TemaDao;
import modelos.entities.Tema;
import modelos.entities.Voto;
import modelos.utils.Estudios;

public class TemaDaoJpa extends GenericDaoJpa<Tema, Integer> implements TemaDao{

	public TemaDaoJpa() {
		super(Tema.class);
	}
	
	public static void main(String[] args){
		DaoFactory.setFactory(new DaoJpaFactory());
		TemaDao temaDao = DaoFactory.getFactory().getTemaDao();
		Tema tema = new Tema("Clima", "¿Que nivel de nubes hay?");
		temaDao.create(tema);
	}

}
