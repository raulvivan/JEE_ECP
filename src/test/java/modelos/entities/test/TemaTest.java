package modelos.entities.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import modelos.entities.Tema;
import modelos.entities.Voto;
import modelos.utils.Estudios;

import org.junit.Before;
import org.junit.Test;

public class TemaTest {
	
	Tema tema;
	Tema tema2;
	Tema tema3;
	
	@Before
	public void before(){
		tema = new Tema("Clima", "¿Que nivel de nubes hay?");
		tema2 = new Tema("Clima", "¿Que nivel de baloncesto tienes?");
		tema3 = new Tema("Cosa", "¿Que nivel de algo hay?");
		
		List<Voto> votos = new ArrayList<Voto>();
		List<Voto> votos2 = new ArrayList<Voto>();
		votos.add(new Voto(6, "123.123", Estudios.NIVEL_ALTO));
		votos2.add(new Voto(3, "124.124", Estudios.NIVEL_BAJO));
		votos2.add(new Voto(9, "125.125", Estudios.NIVEL_MEDIO));
		
		tema2.setVotos(votos);
		tema3.setVotos(votos2);
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsTemaIguales() {
		assertEquals(tema, tema2);
	}
	
	@Test
	public void testEqualsTemaDiferentes() {
		assertNotEquals(tema, tema3);
	}

}
