//package mundo;

/**
 * Representa una esfera. <br>
 * <b>inv: </b> <br>
 * radio >=0 <br>
 * 
 */

public class Esfera {
	/*Declaracion de las variables de instancia o atributos */
	
	private double radio;
	private double superficie;
	private double volumen;

	
	/*
	 * constructor de la clase Esfera
	 */
	
	/**
     * Construye el objeto esfera de un radio determinado
     * <b>post: <b> Se inicializaron los atributos con los valores dados.
     * @param pradio: Valor del radio de la esfera. pradio != "" && pradio is numeric.
     */
	public Esfera(double pradio) {
		radio = pradio;
		verificarInvariante();
	}
	
	
	/*
	 * METODOS ACCESORES: No seran utiles para el usuario pero como parctica me parece conveniente tenerlos
	 */
	
	  /**
     * Retorna el radio de la esfera. <br>
     * @return El radio de la esfera.
     */
	public double getRadio() {
		return radio;
	}
	
	
	/**
     * Asigna un nuevo valor al radio de la esfera ya intanciada
     * <b>post: Se asignará un nuevo valor radio de la esfera <b> 
     * @param pradio: Valor del radio de la esfera. prario  != "" && pradio  is numeric.
     */
	public void setRadio(double pradio) {
		radio=pradio;
	}
	
	
	/*
	 * METODOS EJECUTORES
	 */
	

	 /**
     * Retorna el area de la superficie de la esfera
     * @return area de la superficie de la esfera
     */
	public double superfice() {
		superficie= 4*Math.PI*Math.pow(radio, 2);
		return superficie;
	}
	
	
	 /**
     * Retorna el volumen de una esfera
     * @return el volumen de una esfera
     */
	public double volumen() {
		volumen = (4/3)*Math.PI*Math.pow(radio, 3);
		return volumen;
	}
	
	
     /**
     * Retorna una cadena que representa el volumen de una esfera.
     * @return Una cadena de caracteres con la informacion de la esfera, en este caso su nombre y el radio
     */
	public String toString() {
		return String.format("%s\n%s%.2f","Este es una esfera","El valor de su radio es: ", radio);
	}
	
	
	 /**
     * Verifica que el invariante de la clase se cumpla. Si algo falla, lanza un AssertionError. <br>
     * <b>inv: </b> El radio no puede tener valores negativos ni ser cero
     */
	private void verificarInvariante() {
		assert radio >=0  :"El valor no es valido para la construccion del objeto esfera";
	}
	
}
