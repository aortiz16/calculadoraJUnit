/**
 * 
 */
package calculadoraJUnit;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;


/**
 * @author aortiz16
 * @version 1.1
 * {@code 15/02/18}
 */
public class calculadoraTest {

	/**
	 * Método de prueba para {@link calculadoraJUnit.Calculadora#Calculadora(int, int)}.
	 */
// 2ª paso añadir los parametros que ahora SON mienbros de la clase
	private Calculadora cal;
	private int res;
	
	@Before
	public void inicioPruebas() {
		cal = new Calculadora(30,10);
	}
	
	@After
	public void finPruebas() {
		cal = null;  // eliminamos el objeto
	}
	
 	/**
	 * Método de prueba para {@link calculadoraJUnit.Calculadora#suma()}.
	 */
	@Test
	public void testSuma() {
		Calculadora cal = new Calculadora(30,10);
		int resul = cal.suma();
		assertEquals(40,resul);  // Valor esperado y el Valor devuelto << SI no coinciden la pruieba falla   >>>

	}

	/**
	 * Método de prueba para {@link calculadoraJUnit.Calculadora#resta()}.
	 */
	@Test
	public void testResta() {
		Calculadora cal = new Calculadora(30,10);
		int resul = cal.resta();
		assertEquals(20,resul);  // Valor esperado y el Valor devuelto << SI no coinciden la pruieba falla   >>>

	}

	/**
	 * Método de prueba para {@link calculadoraJUnit.Calculadora#multiplica()}.
	 */
	@Test
	public void testMultiplica() {
		Calculadora cal = new Calculadora(30,10);
		int resul = cal.multiplica();
		assertEquals(300,resul);  // Valor esperado y el Valor devuelto << SI no coinciden la pruieba falla   >>>

	}

	/**
	 * Método de prueba para {@link calculadoraJUnit.Calculadora#divide()}.
	 */
	@Test
	public void testDivide() {
		Calculadora cal = new Calculadora(20,10);
		int resul = cal.divide();
		assertEquals(3,resul);  // Valor esperado y el Valor devuelto << SI no coinciden la pruieba falla   >>>

	}
	// Calculadora cal = new Calculadora(30,10); el test espera 1 excepcion
	// y sino fallara
	// "Test (expected = java.lang.ArithmeticException.class)
	
	
	/**
	 * creando un CODIGO metodo para probar el METODO suma() con nº real
	 */
	@Test (expected = java.lang.ArithmeticException.class)
	public void testDivideException() {
		Calculadora cal2 = new Calculadora(30,0);
		int resul2 = cal2.divide();
	}
	
}
