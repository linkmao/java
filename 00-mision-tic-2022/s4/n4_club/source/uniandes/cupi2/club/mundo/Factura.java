/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n4_club
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.club.mundo;

/**
 * Clase que modela una factura en el club.
 */
public class Factura
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * Es la descripción del consumo que generó esta factura.
     */
    private String concepto;

    /**
     * Es el valor del consumo que generó la factura.
     */
    private double valor;

    /**
     * Nombre de la persona que hizo el consumo que generó la factura.
     */
    private String nombre;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un objeto factura asociado a un consumo de un socio o de un autorizado.
     * <b>post: <b> Se inicializaron los atributos con los valores dados.
     * @param pNombre Nombre de la persona que hizo el consumo. pNombre != null && pNombre != "".
     * @param pConcepto Concepto del consumo. pConcepto != null && pConcepto != "".
     * @param pValor Valor del consumo. pValor >0.
     */
    public Factura( String pNombre, String pConcepto, double pValor )
    {
        nombre = pNombre;
        concepto = pConcepto;
        valor = pValor;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    /**
     * Retorna el concepto de la factura. <br>
     * @return El concepto de la factura.
     */
    public String darConcepto( )
    {
        return concepto;
    }

    /**
     * Retorna el valor de la factura. <br>
     * @return El valor de la factura.
     */
    public double darValor( )
    {
        return valor;
    }

    /**
     * Retorna la nombre que realizó el consumo que generó la factura. <br>
     * @return El nombre en la factura.
     */
    public String darNombre( )
    {
        return nombre;
    }
    

    /**
     * Retorna una cadena que representa a la factura.
     * @return Una cadena de caracteres con la información de la factura con el siguiente formato <concepto> $<valor> (<nombre>).
     */
    public String toString( )
    {
        String factura = concepto + "    $" + valor + "    (" + nombre + ")";
        return factura;
    }
}