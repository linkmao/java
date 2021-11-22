/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n4_club
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.club.test;

import org.junit.Before;
import org.junit.Test;

import uniandes.cupi2.club.mundo.Factura;
import static org.junit.Assert.*;

/**
 * Clase que modela las pruebas para una factura.
 */
public class FacturaTest
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * La factura a probar.
     */
    private Factura factura;

    // -----------------------------------------------------------------
    // Escenarios
    // -----------------------------------------------------------------

    /**
     * Escenario con una factura.
     */
    @Before
    public void setupEscenario1( )
    {
        factura = new Factura( "Jorge Bejarano", "Pi�a colada", 10000 );
    }
    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * 
     */
    @Test
    public void testFactura( )
    {
        assertEquals( "El nombre no es el esperado.", "Jorge Bejarano", factura.darNombre( ) );
        assertEquals( "El concepto no es el esperado.", "Pi�a colada", factura.darConcepto( ) );
        assertEquals( "El valor no es el esperado", 10000, factura.darValor( ), .2 );
    }
}
