/* Nacimiento: 10 de dic de 2019
Objetivo: constrir una clase que haga una ventana y use etiquetas
Descripcion:

*/

import java.awt.FlowLayout;  // permite organizar un flujo de trabajo y organizar componentes
import javax.swing.JFrame;  // Clase para crear una ventana
import javax.swing.JLabel;  // Clase para crar las etiquetas, la cual puede tener texto o imagenes
import javax.swing.JTextField; // Clase para campo de texto sencillo
import javax.swing.JPasswordField; // Clase para campo de texto que gestiona contraseñas
import javax.swing.JButton; // Clase para los botones
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;


public class Marco extends JFrame {
	// Variables de instancia
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JTextField cajon1;
	private JTextField cajon2;
	private JTextField cajon3;
	private JPasswordField cajon4;
	private JButton boton1;
	private JCheckBox casilla;
	private JRadioButton radio;
	private JComboBox lista;
	private String[] nombres= {"Mauricio", "Mariangel", "Diego", "Ramon", "Papa", "Mama"};

	// Metodo constructor
	public Marco(){
	super("Ventana de prueba");
	setLayout(new FlowLayout());
		etiqueta1=new JLabel("Etiqueta de texto 1");
		add(etiqueta1);
		etiqueta2=new JLabel("Etiqueta de texto 2");
		add(etiqueta2);
		etiqueta3=new JLabel("Etiqueta de texto 3");
		add(etiqueta3);
		cajon1= new JTextField(10); // Constructr de JTextFiel con numero de columnas en este caso 10
		add (cajon1);
		cajon2= new JTextField("Espacio para escribir texto");  // Constructor con el texto por defecto
		add (cajon2);
		cajon3= new JTextField("No editable", 10);   // Constructor con el texto  y numero de columnas
		cajon3.setEditable(false);         // Hace el cajon no editable
		add (cajon3);
		cajon4=new JPasswordField("Texto oculto");   // Constructor con el texto  por defecto aunque oculto
		add(cajon4);
		boton1=new JButton("Aceptar");
		add(boton1);
		casilla= new JCheckBox("Mantener opciones");
		add (casilla);
		radio=new JRadioButton("Descartar");
		add (radio);
		lista=new JComboBox(nombres);
		add(lista);
	}
}
