package modelos.daos.jpa;

import java.util.List;

import modelos.daos.DaoFactory;
import modelos.daos.TemaDao;
import modelos.daos.VotoDao;
import modelos.entities.Tema;
import modelos.entities.Voto;
import modelos.utils.Estudios;

public class VotoDaoJpa extends GenericDaoJpa<Voto, Integer> implements VotoDao{

	public VotoDaoJpa() {
		super(Voto.class);
	}
	
	public static void main(String[] args){
		DaoFactory.setFactory(new DaoJpaFactory());
		TemaDao temaDao = DaoFactory.getFactory().getTemaDao();
		Tema tema = temaDao.read(101);
		System.out.println(tema);
	}
	
	public void crearVoto(){
		DaoFactory.setFactory(new DaoJpaFactory());
		TemaDao temaDao = DaoFactory.getFactory().getTemaDao();
		Tema tema = temaDao.read(101);
		List<Voto> votos = tema.getVotos();
		votos.add(new Voto(10, "123.123", Estudios.NIVEL_ALTO));
		tema.setVotos(votos);
		temaDao.update(tema);
	}
	
	public void borrar(){
		DaoFactory.setFactory(new DaoJpaFactory());
		TemaDao temaDao = DaoFactory.getFactory().getTemaDao();
		temaDao.deleteById(101);
	}

}
