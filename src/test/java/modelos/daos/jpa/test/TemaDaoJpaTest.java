package modelos.daos.jpa.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import modelos.daos.jpa.DaoJpaFactory;
import modelos.daos.jpa.TemaDaoJpa;
import modelos.entities.Tema;
import modelos.entities.Voto;
import modelos.utils.Estudios;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TemaDaoJpaTest {
	
	private TemaDaoJpa temaDao;
	private static DaoJpaFactory factory;
	private Tema tema;
	
	@BeforeClass
	public static void init(){
		factory = new DaoJpaFactory();
	}
	
	@Before
	public void prepare(){
		temaDao = factory.getTemaDao();
		tema = new Tema("Clima", "¿Que nivel de nubes hay?");
		List<Voto> votos = new ArrayList<Voto>();
		votos.add(new Voto(6, "123.123", Estudios.NIVEL_ALTO));
		votos.add(new Voto(3, "124.124", Estudios.NIVEL_BAJO));
		votos.add(new Voto(9, "125.125", Estudios.NIVEL_MEDIO));
		temaDao.create(tema);
	}
	
	@After
	public void fin(){
		temaDao.deleteById(tema.getId());
	}

	@Test
	public void testReadandCreate() {
		Tema tema2 = temaDao.read(tema.getId());
		assertEquals(tema, tema2);
	}

	@Test
	public void testUpdate() {
		Tema tema2 = new Tema("Deportes", "¿Te gusta el baloncesto?");
		tema2.setId(tema.getId());
		temaDao.update(tema2);
		assertEquals(tema2, temaDao.read(tema.getId()));
	}

	@Test
	public void testDeleteById() {
		temaDao.deleteById(tema.getId());
		assertNull(temaDao.read(tema.getId()));
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

}
