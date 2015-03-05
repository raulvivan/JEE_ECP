package modelos.daos.jpa;

import modelos.daos.VotoDao;
import modelos.entities.Voto;

public class VotoDaoJpa extends GenericDaoJpa<Voto, Integer> implements VotoDao{

	public VotoDaoJpa() {
		super(Voto.class);
	}

}
