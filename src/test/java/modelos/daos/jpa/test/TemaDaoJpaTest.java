package modelos.daos.jpa.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import modelos.daos.DaoFactory;
import modelos.daos.TemaDao;
import modelos.daos.jpa.DaoJpaFactory;
import modelos.entities.Tema;
import modelos.entities.Voto;
import modelos.utils.Estudios;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TemaDaoJpaTest {
	
	private TemaDao temaDao;
	private Tema tema;
	
	@BeforeClass
	public static void beforeClass(){
		
	}
	
	@Before
	public void before(){
		DaoFactory.setFactory(new DaoJpaFactory());
		temaDao = DaoFactory.getFactory().getTemaDao();
		tema = new Tema("Clima", "¿Que nivel de nubes hay?");
		List<Voto> votos = new ArrayList<Voto>();
		votos.add(new Voto(6, "123.123", Estudios.NIVEL_ALTO));
		votos.add(new Voto(3, "124.124", Estudios.NIVEL_BAJO));
		votos.add(new Voto(9, "125.125", Estudios.NIVEL_MEDIO));
		tema.setVotos(votos);
		temaDao.create(tema);
	}
	
	@After
	public void after(){
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
		List<Tema> temas = new ArrayList<Tema>();
		temas.add(tema);
		Tema tema2 = new Tema("Deportes", "sjhlfbadfgb?");
		temas.add(tema2);
		temaDao.create(tema2);
		
		assertEquals(temaDao.findAll(), temas);
	}

}
