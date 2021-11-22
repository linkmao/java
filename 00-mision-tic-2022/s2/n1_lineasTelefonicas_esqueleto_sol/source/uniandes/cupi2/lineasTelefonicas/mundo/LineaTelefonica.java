/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_lineasTelefonicas
 * Autor: Equipo Cupi2
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.lineasTelefonicas.mundo;

/**
 * Clase que representa una l�nea telef�nica.
 */
public class LineaTelefonica
{
	//-----------------------------------------------------------------
    // Constantes
    //-----------------------------------------------------------------
	public final static int TARIFA_LOCAL = 35;
	public final static int TARIFA_LARGA_DISTANCIA = 380;
	public final static int TARIFA_CELULAR = 600;
	
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * N�mero de llamadas realizadas.
     */
    private int numeroLlamadas;

    /**
     * N�mero de minutos consumidos.
     */
    private int numeroMinutos;

    /**
     * Costo total de las llamadas.
     */
    private double costoLlamadas;

    //-----------------------------------------------------------------
    // M�todos
    //-----------------------------------------------------------------

    /**
     * Inicializa la l�nea telef�nica. <br>
     * <b>post: </b> La l�nea se inicializ� con valores en cero.
     */
    public LineaTelefonica( )
    {
    	// TODO Parte2 PuntoA: Inicializar el n�mero de llamadas, n�mero de minutos y costo de llamadas en 0.
    	numeroLlamadas = 0;
    	numeroMinutos = 0;
    	costoLlamadas = 0;

    }
    

    /**
     * Retorna el costo total de las llamadas realizadas.
     * @return Costo total de las llamadas realizadas.
     */
    public double darCostoLlamadas( )
    {
        // TODO Parte2 PuntoB: Completar el m�todo seg�n la documentaci�n dada.
    	return costoLlamadas;
    }

    /**
     * Retorna el n�mero de llamadas realizadas por esta l�nea.
     * @return N�mero de llamadas realizadas por esta l�nea.
     */
    public int darNumeroLlamadas( )
    {
        // TODO Parte2 PuntoC: Completar el m�todo seg�n la documentaci�n dada.
    	return numeroLlamadas;
    }

    /**
     * Retorna el n�mero de minutos consumidos.
     * @return N�mero de minutos consumidos.
     */
    public int darNumeroMinutos( )
    {
        // TODO Parte2 PuntoD: Completar el m�todo seg�n la documentaci�n dada.
    	return numeroMinutos;
    }

    /**
	 * Reinicia la l�nea telef�nica, dejando todos sus valores en cero.<br>
	 * <b> post: </b> El n�mero de llamadas, n�mero de minutos y costo de llamadas son 0.
	 */
	public void reiniciar( )
	{
        // TODO Parte2 PuntoE: Reiniciar el n�mero de llamadas, n�mero de minutos y costo de llamadas en 0.
		numeroLlamadas = 0;
		numeroMinutos = 0;
		costoLlamadas = 0;
	}

	/**
     * Agrega una llamada local a la l�nea telef�nica <br>
     * <b>post: </b> Se increment� en 1 numeroDeLlamadas, se incremento numeroDeMinutos en minutos, costoLlamadas aument� en ( minutos * 35 ).
     * @param pMinutos N�mero de minutos de la llamada. pMinutos >0.
     */
    public void agregarLlamadaLocal( int pMinutos )
    {
        //Una llamada m�s
        numeroLlamadas ++;
        //
        //Suma los minutos consumidos
        numeroMinutos = numeroMinutos + pMinutos;
        //
        //Suma el costo (costo por minuto: 35 pesos)
        costoLlamadas = costoLlamadas + ( pMinutos * TARIFA_LOCAL );
    }

    /**
     * Agrega una llamada de larga distancia a la l�nea telef�nica <br>
     * <b>post: </b> Se increment� en 1 numeroDeLlamadas, se incremento numeroDeMinutos en minutos, costoLlamadas aument� en ( minutos * 380 )
     * @param pMinutos N�mero de minutos de la llamada. pMinutos >0.
     */
    public void agregarLlamadaLargaDistancia( int pMinutos )
    {
        // TODO Parte2 PuntoF: Completar el m�todo seg�n la documentaci�n dada.
    	numeroLlamadas++;
    	numeroMinutos += pMinutos;
    	costoLlamadas += pMinutos * TARIFA_LARGA_DISTANCIA ;
    }

    /**
     * Agrega una llamada a celular a la l�nea telef�nica <br>
     * <b>post: </b> Se increment� en 1 numeroDeLlamadas, se incremento numeroDeMinutos en minutos, costoLlamadas aument� en ( minutos * 999 )
     * @param pMinutos N�mero de minutos de la llamada. pMinutos >0.
     */
    public void agregarLlamadaCelular( int pMinutos )
    {
        // TODO Parte2 PuntoG: Completar el m�todo seg�n la documentaci�n dada.
    	numeroLlamadas++;
    	numeroMinutos += pMinutos;
    	costoLlamadas += pMinutos * TARIFA_CELULAR;
    }

}