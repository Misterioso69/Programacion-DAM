package RecuperaciónTRABAJOEXCEPCIONES;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class BibliotecaFuncionesTest {
	private void assertTimeout(int i, LocalDate verFechaDesouesDia) {
		// TODO Auto-generated method stub
		
	}
	private void assertAll(String string, DayOfWeek diaDelaSemana) {
		// TODO Auto-generated method stub
		
	}
	@Test
	void testFechaValida() {
		assertEquals(true,BibliotecaFunciones.fechaValida());
	}

	@Test
	void testVerFechaDesouesDia() {
		assertTimeout(2010-03-22, BibliotecaFunciones.verFechaDesouesDia());
	}
	
	@Test
	void testVerFechaDesouesMes() {
		assertTimeout(2010-01-15, BibliotecaFunciones.verFechaDesouesMes());
	}

	@Test
	void testSumarPeriodo() {
		assertTimeout(2023-01-11, BibliotecaFunciones.sumarPeriodo());
	}

	@Test
	void testDiaDelaSemana() {
		assertAll("FRIDAY",BibliotecaFunciones.diaDelaSemana() );
	}

	
	@Test
	void testDiaHace3Dias() {
		assertAll("MONDAY",BibliotecaFunciones.diaHace3Dias() );
	}

	@Test
	void testPrimerDiaOctubre() {
		assertAll("TUESDAY",BibliotecaFunciones.primerDiaOctubre() );
	}

	@Test
	void testSegundos() {
		assertEquals(6300, BibliotecaFunciones.segundos());
	}

}
