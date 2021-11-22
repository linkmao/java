// Nacimiento 18 diciembre 2019
// Objetivo: Realizar el manejo de un evento click
/* Descripcion. 
 * 
*/

import javax.swing.JFrame;  // Neseario para la constamte EXIT_ON_CLOSE

public class Prueba {

	public static void main (String[] args) {
		Evento ventana = new Evento();    // Se define y se instacia un objeto de la clase Evento
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Se le da la orden de que se cierre al apretar el boton de cierre
		ventana.setSize(300, 200);  // Tamaño
		ventana.setVisible(true);  // Que se visualice
		
	}
}
