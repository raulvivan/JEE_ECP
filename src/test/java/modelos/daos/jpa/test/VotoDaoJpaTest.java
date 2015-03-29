package modelos.daos.jpa.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import modelos.daos.DaoFactory;
import modelos.daos.VotoDao;
import modelos.daos.jpa.DaoJpaFactory;
import modelos.entities.Tema;
import modelos.entities.Voto;
import modelos.utils.Estudios;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VotoDaoJpaTest {
	
	VotoDao votoDao;
	Voto voto;
	
	@Before
	public void before(){
		DaoFactory.setFactory(new DaoJpaFactory());
		votoDao = DaoFactory.getFactory().getVotoDao();
		voto = new Voto(10, "123.123", Estudios.NIVEL_ALTO);
		votoDao.create(voto);
	}
	
	@After
	public void after(){
		votoDao.deleteById(voto.getId());
	}

	@Test
	public void testReadandCreate() {
		Voto voto2 = votoDao.read(voto.getId());
		assertEquals(voto, voto2);
	}

	@Test
	public void testUpdate() {
		Voto voto2 = new Voto(5, "127.0.0.1", Estudios.NIVEL_ALTO);
		voto2.setId(voto.getId());
		votoDao.update(voto2);
		assertEquals(voto2, votoDao.read(voto.getId()));	
	}

	@Test
	public void testDeleteById() {
		votoDao.deleteById(voto.getId());
		assertNull(votoDao.read(voto.getId()));
	}

	@Test
	public void testFindAll() {
		List<Voto> votos = new ArrayList<Voto>();
		votos.add(voto);
		Voto voto2= new Voto(7, "127.2.2.1", Estudios.NIVEL_BAJO);
		votos.add(voto2);
		votoDao.create(voto2);
		
		assertEquals(votoDao.findAll(), votos);
	}

}
