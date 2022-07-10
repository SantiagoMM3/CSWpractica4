package practica4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;

public class TestJUnit {
	
	String[] asignaturas1 = {"Programacion 2", "Base de datos 2", "Algoritmia"};
	String[] asignaturas2 = {"Programacion 1", "Fundamentos de los computadores"};
	Estudiante estudiante1 = new Estudiante("Juan", "Rodriguez", 2000, 2, asignaturas1) ;
	Estudiante estudiante2 = new Estudiante("Patricia", "Garcia", 2002, 1, asignaturas2);
	
	@Test
	public void testAssertion1() {
		assertEquals(estudiante1.calcularEdad(), 22);
	}
	
	@Test
	public void testAssertion2() {
		assertTrue(estudiante1.getNumeroAsignaturasPendientes() == 3);
	}
	
	@Test
	public void testAssertion3() {
		assertFalse(estudiante2.getNumeroAsignaturasPendientes() == 2);
	}
	
	@Test
	public void testAssertion4() {
		assertNotNull(estudiante1);
	}
	
	@Test
	public void testAssertion5() {
		assertNull(estudiante2);
	}
	
	@Test 
	public void testAssertion6() {
		assertSame(estudiante1, estudiante2);
	}
	
	@Test
	public void testAssertion7() {
		assertNotSame(estudiante1, estudiante2);
	}
	
	@Test
	public void testAssertion8() {
		assertArrayEquals(estudiante1.getAsignaturasPendientes(), estudiante2.getAsignaturasPendientes());
	}
	
	/*
	@Ignore
	public void testAssertion6() {
		assertSame(estudiante1, estudiante2);
	}
	
	@Ignore
	public void testAssertion7() {
		assertNotSame(estudiante1, estudiante2);
	}
	
	@Before
	public void testAssertion8() {
		estudiante1.setFechaNacimiento(1993);
	}
	*/
		
}
