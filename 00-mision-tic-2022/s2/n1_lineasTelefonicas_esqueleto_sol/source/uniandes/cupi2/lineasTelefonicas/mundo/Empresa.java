/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot? - Colombia)
 * Departamento de Ingenier?a de Sistemas y Computaci?n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_lineasTelefonicas
 * Autor: Equipo Cupi2
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.lineasTelefonicas.mundo;

/**
 * Clase que representa la empresa.
 */
public class Empresa
{

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * L?nea telef?nica n?mero 1.
     */
    private LineaTelefonica linea1;

    /**
     * L?nea telef?nica n?mero 2.
     */
    private LineaTelefonica linea2;

    /**
     * L?nea telef?nica n?mero 3.
     */
    private LineaTelefonica linea3;
    
    private double presupuesto;

    //-----------------------------------------------------------------
    // M?todos
    //-----------------------------------------------------------------

    /**
     * Inicializa las l?neas telef?nicas de la empresa. <br>
     * <b>post: </b> Se inicializaron las 3 l?neas telef?nicas.
     */
    public Empresa( )
    {
        linea1 = new LineaTelefonica( );


        // TODO Parte3 PuntoA: Construir linea2 y linea3.
        linea2 = new LineaTelefonica();
        
        linea3 = new LineaTelefonica();
        
        presupuesto = Double.MAX_VALUE;
        
    }

    /**
     * Retorna la l?nea 1.
     * @return L?nea 1.
     */
    public LineaTelefonica darLinea1( )
    {
        // TODO Parte3 PuntoB: Completar el m?todo seg?n la documentaci?n dada.
    	return linea1;
    }

    /**
     * Retorna la l?nea 2.
     * @return L?nea 2.
     */
    public LineaTelefonica darLinea2( )
    {
        // TODO Parte3 PuntoC: Completar el m?todo seg?n la documentaci?n dada.
    	return linea2;
    }

    /**
     * Retorna la l?nea 3.
     * @return L?nea 3.
     */
    public LineaTelefonica darLinea3( )
    {
        // TODO Parte3 PuntoD: Completar el m?todo seg?n la documentaci?n dada.
    	return linea3;
    }

    /**
	 * Retorna el n?mero total de llamadas realizadas.
	 * @return Total de llamadas de las tres l?neas.
	 */
	public int darTotalNumeroLlamadas( )
	{
        // TODO Parte3 PuntoE: Completar el m?todo seg?n la documentaci?n dada.
		return linea1.darNumeroLlamadas() + linea2.darNumeroLlamadas() + linea3.darNumeroLlamadas();
	}

	/**
	 * Retorna el total de minutos consumidos.
	 * @return Total de minutos de las tres l?neas.
	 */
	public int darTotalMinutos( )
	{
        // TODO Parte3 PuntoF: Completar el m?todo seg?n la documentaci?n dada.
		return linea1.darNumeroMinutos() + linea2.darNumeroMinutos() + linea3.darNumeroMinutos();
	}

	/**
	 * Retorna el costo total de las llamadas realizadas.
	 * @return Costo total de las tres l?neas.
	 */
	public double darTotalCostoLlamadas( )
	{        
        // TODO Parte3 PuntoG: Completar el m?todo seg?n la documentaci?n dada.
		return linea1.darCostoLlamadas() + linea2.darCostoLlamadas() + linea3.darCostoLlamadas();
	}

	/**
	 * Retorna el costo promedio de un minuto, seg?n los minutos consumidos. <br>
	 * @return Costo promedio por minuto.
	 */
	public double darCostoPromedioMinuto( )
	{
        // TODO Parte3 PuntoH: Completar el m?todo seg?n la documentaci?n dada.
		return darTotalCostoLlamadas() / darTotalMinutos();
	}

	/**
     * Agrega una llamada local a la l?nea telef?nica 1 <br>
     * <b>post: </b> Se agreg? la llamada a la l?nea 1.
     * @param pMinutos N?mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLocalLinea1( int pMinutos )
    {
    	if (darTotalCostoLlamadas() + pMinutos*LineaTelefonica.TARIFA_LOCAL < presupuesto) {
    		linea1.agregarLlamadaLocal( pMinutos );
    	}
        
    }

    /**
     * Agrega una llamada local a la l?nea telef?nica 2. <br>
     * <b>post: </b> Se agreg? la llamada a la l?nea 2.
     * @param pMinutos N?mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLocalLinea2( int pMinutos )
    {
        // TODO Parte3 PuntoI: Completar el m?todo seg?n la documentaci?n dada.
    	linea2.agregarLlamadaLocal(pMinutos);
    }

    /**
     * Agrega una llamada local a la l?nea telef?nica 3. <br>
     * <b>post: </b> Se agrega la llamada a la l?nea 3.
     * @param pMinutos N?mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLocalLinea3( int pMinutos )
    {
        // TODO Parte3 PuntoJ: Completar el m?todo seg?n la documentaci?n dada.
    	linea3.agregarLlamadaLocal(pMinutos);
    }

    /**
     * Agrega una llamada de larga distancia a la l?nea telef?nica 1. <br>
     * <b>post: </b> Se agrega la llamada a la l?nea 1.
     * @param pMinutos N?mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLargaDistanciaLinea1( int pMinutos )
    {
    	linea1.agregarLlamadaLargaDistancia( pMinutos );
    }

    /**
     * Agrega una llamada de larga distancia a la l?nea telef?nica 2. <br>
     * <b>post: </b> Se agrega la llamada a la l?nea 2.
     * @param pMinutos N?mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLargaDistanciaLinea2( int pMinutos )
    {
        // TODO Parte3 PuntoK: Completar el m?todo seg?n la documentaci?n dada.
    	linea2.agregarLlamadaLargaDistancia(pMinutos);
    }

    /**
     * Agrega una llamada de larga distancia a la l?nea telef?nica 3. <br>
     * <b>post: </b> Se agrega la llamada a la l?nea 3.
     * @param pMinutos N?mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLargaDistanciaLinea3( int pMinutos )
    {
        // TODO Parte3 PuntoL: Completar el m?todo seg?n la documentaci?n dada.
    	linea3.agregarLlamadaLargaDistancia(pMinutos);
    }

    /**
     * Agrega una llamada a celular a la l?nea telef?nica 1. <br>
     * <b>post: </b> Se agrega la llamada a la l?nea 1.
     * @param pMinutos N?mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaCelularLinea1( int pMinutos )
    {
    	linea1.agregarLlamadaCelular( pMinutos );
    }

    /**
     * Agrega una llamada a celular a la l?nea telef?nica 2. <br>
     * <b>post: </b> Se agrega la llamada a la l?nea 2.
     * @param pMinutos N?mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaCelularLinea2( int pMinutos )
    {
        // TODO Parte3 PuntoM: Completar el m?todo seg?n la documentaci?n dada.
    	linea2.agregarLlamadaCelular(pMinutos);
    }

    /**
     * Agrega una llamada a celular a la l?nea telef?nica 3. <br>
     * <b>post: </b> Se agrega la llamada a la l?nea 3.
     * @param pMinutos N?mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaCelularLinea3( int pMinutos )
    {
        // TODO Parte3 PuntoN: Completar el m?todo seg?n la documentaci?n dada.
    	linea3.agregarLlamadaCelular(pMinutos);
    }

    /**
     * Reinicia todas las l?neas telef?nicas.
     * <b>post: </b> Se reinici? la llamada a la l?nea 1, 2 y 3.
     */
    public void reiniciar( )
    {
        linea1.reiniciar( );
        // TODO Parte3 PuntoB: Completar el m?todo para reiniciar las lineas 2 y 3.
        linea2.reiniciar();
        linea3.reiniciar();
    }

    //-----------------------------------------------------------------
    // Puntos de Extensi?n
    //-----------------------------------------------------------------

    /**
     * M?todo para la extensi?n 1.
     * @return Respuesta 1.
     */
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    /**
     * Metodo para alocar un presupuesto m?ximo.
     * Recibe el presupuesto por par?metro e informa al usuario cuantas llamadas de cada tipo podr?a hacer hasta llegar a este costo m?ximo
     * @return Respuesta 2.
     */
    public String metodo2( double pCostoObj )
    {
    	
    	presupuesto = pCostoObj;
    	
    	double costoActual = darTotalCostoLlamadas();
    	
    	if (costoActual > pCostoObj) {
    		return "Ya se paso!!";
    	}
    	else
    	{
    		
    	double saldoRestante = pCostoObj - costoActual; 
    		
    	int minutosRestantesLocal = (int) saldoRestante / LineaTelefonica.TARIFA_LOCAL;
    	int minutosRestantesLarga = (int) saldoRestante / LineaTelefonica.TARIFA_LARGA_DISTANCIA;
    	int minutosRestantesCelular = (int) saldoRestante / LineaTelefonica.TARIFA_CELULAR;
    	
    	String respuesta = "Los minutos restantes son " + Integer.toString(minutosRestantesLocal) + " locales, ";
    	respuesta += Integer.toString(minutosRestantesLarga) + " de larga distancia, ?";
    	respuesta += Integer.toString(minutosRestantesCelular) + " a celular.";
    			
    	
        return respuesta;
    	}
    }

}
