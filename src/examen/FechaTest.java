package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {

	Fecha a = new Fecha();
	
	@Test
	void CP1() {
		assertFalse(a.validarFecha(2015,2,-5));
	}
	
	@Test
	void CP2() {
		assertFalse(a.validarFecha(2020,-10,10));
	}
	
	@Test
	void CP3() {
		assertFalse(a.validarFecha(0,5,25));
	}
	
	@Test
	void CP4() {
		assertFalse(a.validarFecha(2023,15,17));
	}

}
