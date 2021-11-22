// Nacimiento 26 diciembre 2019
// Objjetivo: Realizar el manejo de un evento a traves de botones
/* Descripcion. Este ejemplo es muy simlilar al de manejo de eventos hecho con cuadros de texto, se crea una clase que extiente a JFrame
el cual contendra toda la confiuracion del GUI.
Ademas se logra por fin, tener la clase manejadoora de eventos como un archivo fuente independiente, esto se logra ya que al usar el
metdodo getActionCommand de la clase JButon, este devuelve el texto que tiene el boton, commo un objeto String, el cual de manera
directa se puede usar en la clase independiente Eventos para saber que boton se ha presionado,.
El ejemplo se habia formalado tambien usando el metodo getSource (Asi como se hizo en el ejemplo de las jacas de texto (ver ejemplo manejador
de eventos en la carpeta eclipse) sin embargo eso obliga a la fecha que la clase manejadora de eventos se escriba dentro de la clase
principal

*/

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Boton extends JFrame{
	// Variables de instancia, en este caso los botones
	private JButton bAceptar;
	private JButton bCancelar;
	private JButton bOtro;

	//Metodo constructor de la clase boton
	public Boton (){
		super ("Ejemplo de la colocacion de botones");
		setLayout(new FlowLayout());
		bAceptar= new JButton ("Aceptar");
		add(bAceptar);
		bCancelar= new JButton("Cancelar");
		add (bCancelar);
		bOtro= new JButton("Otro");
		add (bOtro);
	// Declaracion de la variable para manejo de eventos
		Eventos escucha = new Eventos()	;
		bAceptar.addActionListener(escucha);
		bCancelar.addActionListener(escucha);
		bOtro.addActionListener(escucha);
	} // Fin del metodo constructor
}// Fin de la clase Boton
