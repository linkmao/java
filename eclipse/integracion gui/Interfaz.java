// Nacimiento 04 enero de 2010
// Objetivo: Integrar la interfaz grafica con una clase 
/* Descripcion. 
*/

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;

public class Interfaz extends JFrame {
	private static final long serialVersionUID = 1L;
	// declaracion de variables de instancia
	private JTextField tPrimerNombre;
	private JTextField tSegundoNombre;
	private JTextField tPrimerApellido;
	private JTextField tSegundoApellido;
	private JTextField tEdad;
	private JTextField tID;
	private JTextField tGrado;
	private JLabel lPrincipal;
	private JLabel lPrimerNombre;
	private JLabel lSegundoNombre;
	private JLabel lPrimerApellido;
	private JLabel lSegundoApellido;
	private JLabel lEdad;
	private JLabel lID;
	private JLabel lGrado;
	private JButton bGuardar;
	
	// Metodo constructor
	public Interfaz () {
		super("Integracion de GUI - Mi  ejemplo;");
		setLayout(new FlowLayout());
		lPrincipal= new JLabel("Escribe los elementos solicitados");
		lPrimerNombre = new JLabel ("Primer nombre");
		lSegundoNombre = new JLabel ("Segundo nombre");
		lPrimerApellido = new JLabel ("Primer Apellido");
		lSegundoApellido = new JLabel ("Segundo Apellido");
		lEdad = new JLabel ("Edad");
		lID = new JLabel ("Documento de identidad");
		lGrado = new JLabel ("Grado");
		
		tPrimerNombre = new JTextField (10);
		tSegundoNombre = new JTextField (10);
		tPrimerApellido = new JTextField (10);
		tSegundoApellido = new JTextField (10);
		tEdad = new JTextField (3);
		tID = new JTextField (10);
		tGrado = new JTextField (3);
		
		bGuardar = new JButton ("Guardar");
		
		add(lPrincipal);
		add(lPrimerNombre);
		add(tPrimerNombre);
		add(lSegundoNombre);
		add(tSegundoNombre);
		add(lPrimerApellido);
		add(tPrimerApellido);
		add(lSegundoApellido);
		add(tSegundoApellido);
		add(lEdad);
		add(tEdad);
		add(lID);
		add(tID);
		add(lGrado);
		add(tGrado);
		add(bGuardar);
		
		bGuardar.addActionListener(new Evento());
	}// Fin del metodo constructor

	// Clase interna manejadora de eventos
	private class Evento implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			Gestor Archivo = new Gestor();
			Archivo.abrirArchivo();
			Archivo.agregarRegistro(tPrimerNombre.getText(), tSegundoNombre.getText(), tPrimerApellido.getText(), tSegundoApellido.getText(), Integer.parseInt(tEdad.getText()) , tID.getText(), Integer.parseInt(tGrado.getText()) );
			Archivo.cerraArchivo();
			tPrimerNombre.setText("");
			tSegundoNombre.setText(""); 
			tPrimerApellido.setText(""); 
			tSegundoApellido.setText("");
			tEdad.setText("");
			tID.setText("");
			tGrado.setText("");
			JOptionPane.showMessageDialog(null, "El registro fue guardado satisfactoriamente");
		}
		
	}
	
	
}
