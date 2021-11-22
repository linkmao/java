//package mundo;

/**
 * Representa un rectangulo. <br>
 * <b>inv: </b> <br>
 * base >=0 <br>
 * altura >=0 <br>
 * 
 */

public class  Rectangulo {
	/*Declaracion de las variables de instancia o atributos */
	
	private double base;
	private double altura;
	private double perimetro;
	private double area;
	
	/*
	 * constructor de la clase Rectangulo
	 */
	
	/**
     * Construye el objeto rectangulo de base: base y altura:altura
     * <b>post: <b> Se inicializaron los atributos con los valores dados.
     * @param pbase: Valor de la base del rectanguloo. base != "" && base is numeric.
     * @param paltura: Valor de la altura del rectangulo. altura != "" && altura is numeric.
     */
	public Rectangulo(double pbase, double paltura) {
		base = pbase;
		altura= paltura;
		verificarInvariante();
	}
	
	
	/*
	 * Metodos accesores: No seran utiles para el usuario pero como parctica me parece conveniente tenerlos
	 */
	
	  /**
     * Retorna la base del rectángulo. <br>
     * @return El lado del rectángulo.
     */
	public double getBase() {
		return base;
	}
	
	  /**
     * Retorna la altura del rectángulo. <br>
     * @return La altura del rectángulo.
     */
	public double getAltura() {
		return altura;
	}
	

	
	/**
     * Asigna un valor a la base del rectángulo instanciado
     * <b>post: Se asignará un nuevo valor de la base del rectángulo <b> 
     * @param pbase: Valor de la base del rectangulo. base != "" && base is numeric.
     */
	public void setBase(double pbase) {
		base=pbase;
	}
	

	/**
     * Asigna un valor a la altura  del rectángulo instanciado
     * <b>post: Se asignará un nuevo valor de la altura del rectángulo <b> 
     * @param pbase: Valor de la altura del rectangulo. altura != "" && altura is numeric.
     */
	public void setAltura(double paltura) {
		base=paltura;
	}
	
	
	/*
	 * METODOS EJECUTORES
	 */
	

	 /**
     * Retorna el perimetro del rectangulo
     * @return el perimetro del rectangulo
     */
	public double perimetro() {
		perimetro= 2*base+2*altura;
		return perimetro;
	}
	
	
	 /**
     * Retorna el area del rectangulo.
     * @return el valor del area del rectangulo
     */
	public double area() {
		area = base*altura;
		return area;
	}
	
	
     /**
     * Retorna una cadena que representa al rectangulo.
     * @return Una cadena de caracteres con la informacion del rectangulo, en este caso su nombre y el valor de su base y altura.
     */
	public String toString() {
		return String.format("%s\n%s%.2f\n%s%.2f","Este es un rectangulo","El valor de su base es: ", base, "El valor de su altura es: ", altura);
	}
	
	
	 /**
     * Verifica que el invariante de la clase se cumpla. Si algo falla, lanza un AssertionError. <br>
     * <b>inv: </b> El lado no puede adquirir valores negativos
     */
	private void verificarInvariante() {
		assert base >0 && altura>0  :"los valores proporcionados no permiten la construccion del objeto rectangulo";
	}
	
}
