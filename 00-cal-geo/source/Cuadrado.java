//package mundo;

/**
 * Representa un cuadrado. <br>
 * <b>inv: </b> <br>
 * lado >=0 <br>
 * 
 */

public class Cuadrado {
	/*Declaracion de las variables de instancia o atributos */
	
	private double lado;
	private double perimetro;
	private double area;
	
	/*
	 * constructor de la clase cuadrado
	 */
	
	/**
     * Construye el objeto cuadrado de un lado determinado
     * <b>post: <b> Se inicializaron los atributos con los valores dados.
     * @param l: Valor del lado del cuadrado. l != "" && l is numeric.
     */
	public Cuadrado(double l) {
		lado = l;
		verificarInvariante();
	}
	
	
	/*
	 * Metodos accesores: No seran utiles para el usuario pero como parctica me parece conveniente tenerlos
	 */
	
	  /**
     * Retorna el lado del cuadrado. <br>
     * @return El lado del cuadrado.
     */
	public double getLado() {
		return lado;
	}
	
	
	/**
     * Asigna un valor al lado del cuadrado luego de instanciado
     * <b>post: Se asignó un nuevo valor del lado al cuadrado <b> 
     * @param l: Valor del lado del cuadrado. l != "" && l is numeric.
     */
	public void setLado(double l) {
		lado=l;
	}
	
	
	/*
	 * METODOS EJECUTORES
	 */
	

	 /**
     * Retorna el perimetro del cuadrado
     * @return el perimetro del cuadrado
     */
	public double perimetro() {
		perimetro= 4*lado;
		return perimetro;
	}
	
	
	 /**
     * Retorna el area del cuadrado.
     * @return el valor del area del cuadrado
     */
	public double area() {
		area = lado*lado;
		return area;
	}
	
	
     /**
     * Retorna una cadena que representa al cuadrado.
     * @return Una cadena de caracteres con la informacion del cuadrado, en este caso su nombre y el lado.
     */
	public String toString() {
		return String.format("%s\n%s%.2f","Este es un cuadrado","El valor de su lado es: ", lado);
	}
	
	
	 /**
     * Verifica que el invariante de la clase se cumpla. Si algo falla, lanza un AssertionError. <br>
     * <b>inv: </b> El lado no puede adquirir valores negativos
     */
	private void verificarInvariante() {
		assert lado >0  :"El valor no es valido para la construccion del objeto cuadrado";
	}
	
}
