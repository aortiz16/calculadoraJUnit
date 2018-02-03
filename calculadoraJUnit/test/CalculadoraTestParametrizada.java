package calculadoraJUnit;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTestParametrizada {
	private int num1;  //tantas propiedades como paramentros
	private int num2;
	private int res; //RESULTADO
	
// Constructor  -- necesario p la prueba --
	public CalculadoraTestParametrizada(int n1, int n2 , int n3) {
		num1 = n1;
		num2 = n2;
		res = n3;
	}
	
	@Parameters  // metodo con bateria de pruebas a realizar
	public static Collection<Object[]> numeros() {
	    return Arrays.asList(new Object[][]{
		{10,10,100} , {2,5,10} , {-3, -4, -12} , {-2 , -7,  -14} }) ;
	}	
	
	
	@Test
	public void testMultiplica() {
		Calculadora cal = new Calculadora(num1 , num2);
		int resultado = cal.multiplica() ;
		assertEquals(res, resultado) ; // Valor Esperado y Devuelto
	}

}
