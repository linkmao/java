// Nacimiento 30 diciembre 2019
// Objetivo: Utilizar el jlist
/* Descripcion. Uso de clase interna anonima para manejar el evento

*/

import java.awt.FlowLayout;   // Permite el flujo de trabajo, o la forma en que se van poniendo los controles
import java.awt.Color;
import javax.swing.JFrame;			// Clase basica para la creaciond e ventanas
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;   // Interfaz para obtener constante para configurar el tipo de seleccion del control


public class JListado extends JFrame{
	//Declaracion de variables de instancia
	private JList cuadroListado;
	private final String   nombresColores[]={"Negro", "Blanco", "Azul", "Amarillo","Rojo","Verde","Rosado","Magenta","Cian"};
	private final Color colores[]={Color.BLACK, Color.WHITE, Color.BLUE, Color.YELLOW, Color.RED, Color.GREEN, Color.PINK, Color.MAGENTA, Color.CYAN };
		

	// Metodo constructor
	public JListado(){
		super("Ejemplo de lista JList");
		setLayout(new FlowLayout());
		cuadroListado=new JList(nombresColores);
		cuadroListado.setVisibleRowCount(5);
		cuadroListado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(cuadroListado));
		cuadroListado.addListSelectionListener(new ListSelectionListener() {public void valueChanged(ListSelectionEvent evento){getContentPane().setBackground(colores[cuadroListado.getSelectedIndex()]);}});

	} // Fin del metodo constructor
}// Fin de la clase principal
