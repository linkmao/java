
import javax.swing.JFrame;
public class Prueba {
public static void main (String [] args) {
	Interfaz aplicacion = new Interfaz();
	aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Se le da la orden de que se cierre al apretar el boton de cierre
	aplicacion.setSize(300, 300);  // Tama?o
	aplicacion.setVisible(true);  // Que se visualice
}
}
