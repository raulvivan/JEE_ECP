package modelos.daos.jpa;

import modelos.daos.TemaDao;
import modelos.entities.Tema;

public class TemaDaoJpa extends GenericDaoJpa<Tema, Integer> implements TemaDao{

	public TemaDaoJpa() {
		super(Tema.class);
	}

}
