/**
 * @author David Lázaro Viguera
 * @version 1.0.1
 * @since 14/06/2022
 */



public class Utilidad {
	
	
	private int atributo;
	private String atributo2;
	private boolean atributo3;
	/**
	 * Te devuelve el factorial del numero que le pasamos
	 * @param a Es el valor que le metemos al metodo
	 * @return Nos devuelve el factorial
	 */
	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	
	/**
	 * Te devuelve el factorial por el numero que le pasamos
	 * @param n Numero que le pasamos
	 * @return Nos devuelve el factorial por el numero que le hemos pasado anteriormente
	 */
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}

	/**
	 * Este metodo es el atributo
	 * @return Nos devuelve el atributo
	 */
	public int getAtributo() {
		return atributo;
	}

	/**
	 * Este metodo le pasamos el atributo
	 * @param atributo Atributo que le pasamos en formato de numero
	 */
	public void setAtributo(int atributo) {
		this.atributo = atributo;
	}

	/**
	 * Este metodo es el segundo atributo
	 * @return Nos devuelve el segundo atributo
	 */
	public String getAtributo2() {
		return atributo2;
	}

	/**
	 * Este metodo le pasamos el segundo atributo
	 * @param atributo2 Le metemos el segundo atributo en formato de String
	 */
	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}

	/**
	 * Este metodo es el tercer atributo
	 * @return Nos devuelve el tercer atributo
	 */
	public boolean isAtributo3() {
		return atributo3;
	}

	/**
	 * Este metodo le pasamos el tercer atributo
	 * @param atributo3 Le pasamos el tercer atributo en formato booleano
	 */
	public void setAtributo3(boolean atributo3) {
		this.atributo3 = atributo3;
	}
	
}