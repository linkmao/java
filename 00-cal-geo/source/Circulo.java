//package mundo;

/**
 * Representa un circulo. <br>
 * <b>inv: </b> <br>
 * radio >=0 <br>
 * 
 */

public class Circulo {
	/*Declaracion de las variables de instancia o atributos */
	
	private double radio;
	private double circunferencia;
	private double area;

	
	/*
	 * constructor de la clase circulo
	 */
	
	/**
     * Construye el objeto circulo de un radio determinado
     * <b>post: <b> Se inicializaron los atributos con los valores dados.
     * @param pradio: Valor del radio del circulo. pradio != "" && pradio is numeric.
     */
	public Circulo(double pradio) {
		radio = pradio;
		verificarInvariante();
	}
	
	
	/*
	 * METODOS ACCESORES: No seran utiles para el usuario pero como parctica me parece conveniente tenerlos
	 */
	
	  /**
     * Retorna el radio del circulo. <br>
     * @return El radio del circulo.
     */
	public double getRadio() {
		return radio;
	}
	
	
	/**
     * Asigna un nuevo valor al radio del circulo ya intanciado
     * <b>post: Se asignará un nuevo valor radio del criculo <b> 
     * @param pradio: Valor del radio del circulo. prario  != "" && pradio  is numeric.
     */
	public void setRadio(double pradio) {
		radio=pradio;
	}
	
	
	/*
	 * METODOS EJECUTORES
	 */
	

	 /**
     * Retorna la circunferencia o perrimetro del circulo
     * @return la circunferencia
     */
	public double circunferencia() {
		circunferencia= 2*Math.PI*radio;
		return circunferencia;
	}
	
	
	 /**
     * Retorna el area del circulo
     * @return el area del circulo
     */
	public double area() {
		area = Math.PI*Math.pow(radio, 2);
		return area;
	}
	
	
     /**
     * Retorna una cadena que representa al circulo.
     * @return Una cadena de caracteres con la informacion del circulo, en este caso su nombre y el radio
     */
	public String toString() {
		return String.format("%s\n%s%.2f","Este es un circulo","El valor de su radio es: ", radio);
	}
	
	
	 /**
     * Verifica que el invariante de la clase se cumpla. Si algo falla, lanza un AssertionError. <br>
     * <b>inv: </b> El lado no puede adquirir valores negativos
     */
	private void verificarInvariante() {
		assert radio >=0  :"El valor no es valido para la construccion del objeto circulo";
	}
	
}
