// Nacimiento 18 diciembre 2019
// Objjetivo: Realizar el manejo de un evento click
/* Descripcion. 
 * 
*/

import java.awt.FlowLayout;   // Clase para el flujo de aaparicion de los controles
import java.awt.event.ActionListener;   // Clase que se implementa en la clase que manejara los eventos
import java.awt.event.ActionEvent;    // Para declarar objeto del tipo ActionEvetm
import javax.swing.JFrame;     // Ventana
import javax.swing.JTextField;  // Cuadro de texto
import javax.swing.JPasswordField;  // Cuadro de texto de password
import javax.swing.JLabel;    //Etiuqeta
import javax.swing.JOptionPane;   // Cuadro de mensaje


public class Evento extends JFrame  {
	// variables de instancia
	private JTextField campoTexto;   // Se declara variable tipo JTextField
	private JPasswordField campoPassword;   // Se declara variable tipo JTextPassword
	private JLabel etiqueta;   // Se declara variable para etiqueta
	
	
	// Metodo constructor aca se configura todo
	public Evento()  {
		super ("Ventana con manejador de eventos");    // Titulo de la ventana
		setLayout(new FlowLayout() );                  // Se le indica cual es el flujo de trabajo es decir de aparicio de controles
		campoTexto= new JTextField(20);				   // Se instancia el objeto
		add (campoTexto);								// Se agrega el objeto
		campoPassword= new JPasswordField(20);			// Se instancia el objeto
		add (campoPassword);							// Se agrega el objeto
		etiqueta = new JLabel("Cambia en funcion de la acción");  // Se instancia el objeto
		add (etiqueta);									// Se agrega el objeto
		
		Manejador configuracion = new Manejador();	    // Se declara e instancia un objeto del tipo de clase donde esta el metodo que maneja los evenyos
		campoTexto.addActionListener(configuracion);	// Se le dice al control que este listo para ser escuchado
		campoPassword.addActionListener(configuracion); // Se le dice al control que sera escuchado
		}
	
	
	// Esta clase esta dentro de la clase principal, no encontré la manera de ponerla fuera en un archivo independiente, en esta clase se 
	// define el metodo actionPerformed el cual se encargara de manejar los evetos
	private class Manejador implements ActionListener{   // Se le indicav que este metodo escuchara 
	public void actionPerformed(ActionEvent evento) {    // El objeto que recoje los eventos es del ditpo ActionEvent
		String mensaje="";
		if (evento.getSource()==campoTexto)				// Ya se hace uso de la variable para saber quien emtio el mensaje
			mensaje="Se ha introducido textoo en el primer cajon";
		else if (evento.getSource()==campoPassword)
			mensaje="Se ha introducido texto en el cuadro del password";
		else 
			mensaje = "No deberia leerse esto";
			JOptionPane.showMessageDialog(null, mensaje);
		}
	} // Fin de la clase manejador
}









