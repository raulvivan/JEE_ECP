package modelos.entities.test;

import static org.junit.Assert.*;
import modelos.entities.Voto;
import modelos.utils.Estudios;

import org.junit.Before;
import org.junit.Test;

public class VotoTest {
	
	Voto voto;
	Voto voto2;
	Voto voto3;
	
	@Before
	public void before(){
		voto = new Voto(10, "123.123", Estudios.NIVEL_ALTO);
		voto2 = new Voto(10, "123.123", Estudios.NIVEL_ALTO);
		voto3 = new Voto(9, "123.123", Estudios.NIVEL_ALTO);
	}

	@Test
	public void testToString() {
		assertEquals("Valoracion: 10 \nIP: 123.123 \nEstudios: NIVEL_ALTO", voto.toString());
	}

	@Test
	public void testEqualsVoto() {
		assert(voto.equals(voto2));
	}

}
