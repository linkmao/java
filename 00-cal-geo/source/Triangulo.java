//package mundo;

/**
 * Representa un Trinángulo. <br>
 * <b>inv: </b> <br>
 * lado1 >=0 <br>
 * lado2 >=0 <br>
 * lado3 >=0 <br>
 * 
 */

public class  Triangulo {
	/*Declaracion de las variables de instancia o atributos */
	
	private double lado1;
	private double lado2;
	private double lado3;
	private double perimetro;
	private double area;
	
	/*
	 * constructor de la clase Triángulo
	 */
	
	/**
     * Construye el objeto triángulo de lado 1: lado1, lado 2: lado2 y lado 3:lado3
     * <b>post: <b> Se inicializaron los atributos con los valores dados.
     * @param plado1: Valor del lado 1 del triágulo. plado1 != "" && plado2 is numeric.
     * @param plado1: Valor del lado 2 del triágulo. plado2 != "" && plado2 is numeric.
     * @param plado1: Valor del lado 3 del triágulo. plado3 != "" && plado2 is numeric.
     */
	public Triangulo(double plado1, double plado2, double plado3) {
		lado1 = plado1;
		lado2 = plado2;
		lado3 = plado3;
		verificarInvariante();
	}
	
	
	/*
	 * METODOS ACCESIRES: No seran utiles para el usuario pero como parctica me parece conveniente tenerlos
	 */
	
	  /**
     * Retorna el lado 1 del triángulo. <br>
     * @return El lado 1 del triángulo.
     */
	public double getLado1() {
		return lado1;
	}
	
	  /**
     * Retorna el lado 2 del triángulo. <br>
     * @return El lado 2 del triángulo.
     */
	public double getLado2() {
		return lado2;
	}
	
	
	  /**
     * Retorna el lado 3 del triángulo. <br>
     * @return El lado 3 del triángulo.
     */
	public double getLado3() {
		return lado3;
	}

	
	/**
     * Asigna los valores de los tres lados del triangulo
     * <b>post: Se asignará un nuevo valor de la base del triángulo <b> 
     * @param plado1: Valor del primer lado del triángulo. plado1 is numeric && plado1 >=0
     * @param plado2: Valor del primer lado del triángulo. plado2 is numeric && plado2 >=0
     * @param plado3: Valor del primer lado del triángulo. plado3 is numeric && plado3 >=0
     * Si el valor especificado es 0, significa que no se cambia el valor inicial del lado del triangulo
     */
	public void setLados(double plado1, double plado2, double plado3) {
		if (plado1 !=0 ) {
			lado1= plado1;
			} 
		if (plado2 !=0 ) {
			lado2= plado2;
			} 
		if (plado3 !=0 ) {
			lado3= plado3;
			} 
		}


	
	/*
	 * METODOS EJECUTORES
	 */
	

	 /**
     * Retorna el perimetro del triángulo
     * @return el perimetro del triángulo
     */
	public double perimetro() {
		perimetro= lado1+lado2+lado3;
		return perimetro;
	}
	
	
	 /**
     * Retorna el area del rectangulo.
     * @return el valor del area del rectangulo
     */
	public double area() {
	    double sp;  // Semiperimetro del triángulo
	    sp = (lado1+lado2+lado3)/2;
	    area = Math.pow(sp*(sp-lado1)*(sp-lado2)*(sp-lado3), 0.5);
		return area;
	}
	
	
     /**
     * Retorna una cadena que representa al triángulo.
     * @return Una cadena de caracteres con la informacion del trinángulo, en este caso su nombre y el valor de sus tres lados.
     */
	public String toString() {
		return String.format("%s\n%s%.2f\n%s%.2f\n%s%.2f","Este es un triangulo","El valor de su lado 1 es: ", lado1, "El valor de su lado 2 es: ", lado2, "El valor de su lado 3 es: ", lado3);
	}
	
	
	 /**
     * Verifica que el invariante de la clase se cumpla. Si algo falla, lanza un AssertionError. <br>
     * <b>inv: </b> El lado no puede adquirir valores negativos
     */
	private void verificarInvariante() {
		assert lado1 >=0 && lado2>=0 && lado3>=0 :"los valores proporcionados no permiten la construccion del objeto triangulo";
	}
	
}
