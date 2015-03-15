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
		List<Voto> votos = new ArrayList<Voto>();
		votos.add(new Voto(6, "123.123", Estudios.NIVEL_ALTO));
		votos.add(new Voto(3, "124.124", Estudios.NIVEL_BAJO));
		votos.add(new Voto(9, "125.125", Estudios.NIVEL_MEDIO));
		tema.setVotos(votos);
		temaDao.create(tema);
	}

}
