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
	
	@BeforeClass
	public static void beforeClass(){
		
	}
	
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
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

}
