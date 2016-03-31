import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calc;
	
	@Before
	public void crearCalculadora() {
		calc = new Calculadora();
	}
	
	@Test
	public void deberianSumarDiez() {
		int sum1 = 5;
		int sum2 = 5;
		assertEquals(10, calc.suma(sum1,sum2));
	}
	
	@Test
	public void deberianRestar5() {
		int min = 10;
		int sus = 5;
		assertEquals(5, calc.resta(min, sus));
	}
	
	@Test
	public void deberianMultiplicar10() {
		int num1 = 5;
		int num2 = 2;
		assertEquals(10, calc.multiplica(num1, num2));
	}
	
	@Test
	public void deberianDividir5() {
		int num1 = 10;
		int num2 = 2;
		assertEquals(5, calc.divide(num1, num2));
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void deberiaDevolverIllegalArgumentExceptionAlDividirPorCero() {
		int num1 = 10;
		int num2 = 0;
		calc.divide(num1, num2);
	}
	
}
