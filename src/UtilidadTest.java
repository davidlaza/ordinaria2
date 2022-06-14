import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadTest {

	@Test
	public int CP1(int a) {
		int esperado = 0;
		int resultado = 0;
		resultado = (a==0) ? 0: a+factorial(a);
		assertEquals(esperado,0);
		return resultado;
	}

	@Test
	public int CP2(int a) {
		int esperado = 4;
		int resultado = 0;
		resultado = (a==0) ? 0: a+factorial(a);
		assertEquals(esperado,2);
		return resultado;
	}
	@Test
	public int CP3(int a) {
		int esperado = 9;
		int resultado = 0;
		resultado = (a==0) ? 0: a+factorial(a);
		assertEquals(esperado,3);
		return resultado;
	}
	@Test
	public int CP4(int a) {
		int esperado = 28;
		int resultado = 0;
		resultado = (a==0) ? 0: a+factorial(a);
		assertEquals(esperado,4);
		return resultado;
	}
	@Test
	public int CP5(int a) {
		int esperado = 125;
		int resultado = 0;
		resultado = (a==0) ? 0: a+factorial(a);
		assertEquals(esperado,5);
		return resultado;
	}
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}

}
