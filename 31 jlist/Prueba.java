// Nacimiento 30 diciembre 2019
// Objetivo: realizar el lanzamiento de la aplicacion y su configuracion
/* Descripcion. 
*/

import javax.swing.JFrame;  // Neseario para la constamte EXIT_ON_CLOSE

public class Prueba {

	public static void main (String[] args) {
		JListado ventana = new JListado();    // Se define y se instacia un objeto de la clase Evento
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Se le da la orden de que se cierre al apretar el boton de cierre
		ventana.setSize(200, 300);  // Tamaño
		ventana.setVisible(true);  // Que se visualice
		
	}
}
