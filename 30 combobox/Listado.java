// Nacimiento 29 diciembre 2019
// Objetivo: Utilizar el combobox
/* Descripcion. 
*/

import java.awt.FlowLayout;   // Permite el flujo de trabajo, o la forma en que se van poniendo los controles
import java.awt.event.ItemListener;   // Interfaz para manejar eventos
import java.awt.event.ItemEvent;     // Necesario para crear objetos que escuchen eventos
import javax.swing.JFrame;			// Clase basica para la creaciond e ventanas
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Listado extends JFrame{
	//Declaracion de variables de instancia
	private JComboBox cuadroListado;
	private JLabel etiqueta;
	private String   nombres[]={"java.png", "html.png", "mysql.png", "php.png"};
	private Icon iconos[] ={new ImageIcon(getClass().getResource(nombres[0])),new ImageIcon(getClass().getResource(nombres[1])),new ImageIcon(getClass().getResource(nombres[2])),new ImageIcon(getClass().getResource(nombres[3]))};

	// Metodo constructor
	public Listado(){
		super("Ejemplo de lista combobox");
		setLayout(new FlowLayout());
		cuadroListado=new JComboBox(nombres);
		cuadroListado.setMaximumRowCount(4); //Al hacer click despliega maximo 4 filas, las demas se acceden con la barra de desplazamiento vertical
		cuadroListado.addItemListener(new ItemListener() {public void itemStateChanged(ItemEvent evento){if(evento.getStateChange()==1) etiqueta.setIcon(iconos[cuadroListado.getSelectedIndex()]);}});
	//	cuadroListado.addItemListener(new Manejador());
		add(cuadroListado);
		etiqueta = new JLabel (iconos[0]);
		add (etiqueta);
	} // Fin del metodo constructor
	
	// Clase interna para el manejo de los eventos
	/*private class Manejador implements ItemListener{
		public void itemStateChanged(ItemEvent evento){
			if(evento.getStateChange()==1)//ItemEvent.SELECT)
				etiqueta.setIcon(iconos[cuadroListado.getSelectedIndex()]);
		}
	}// Fin de la clase manejadora de eventos	  */
}// Fin de la clase principal
