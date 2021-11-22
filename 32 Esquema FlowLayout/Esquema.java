// Nacimiento 30 diciembre 2019
// Objetivo: Mostrar el funcionamiento de FlowLayout
/* Descripcion. 
*/


import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Esquema extends JFrame {
	// Declaracion de variables de instancia
	private JButton bIzquierda;
	private JButton bCentral;
	private JButton bDerecha;
	private FlowLayout flujo;
	private Container contenedor;

	// Metodo constructor
	public Esquema(){
		super ("Prueba del esquema FlowLayout");
		flujo = new FlowLayout();
		contenedor= getContentPane();
		setLayout(flujo);
		bIzquierda= new JButton("Izquierda");
		bCentral=new JButton("Central");
		bDerecha=new JButton("Derecha");
		bIzquierda.addActionListener(new Manejador());
		bCentral.addActionListener(new Manejador());
		bDerecha.addActionListener(new Manejador());
		add(bIzquierda);
		add(bCentral);
		add(bDerecha);
	}

	// Clase manejadora de eventos
	private class Manejador implements ActionListener{
		public void actionPerformed(ActionEvent evento){
			if (evento.getSource()==bIzquierda)
				flujo.setAlignment(FlowLayout.LEFT);
			else if (evento.getSource()==bCentral)
				flujo.setAlignment(FlowLayout.CENTER);
			else  if (evento.getSource()==bDerecha)
				flujo.setAlignment(FlowLayout.RIGHT);
			flujo.layoutContainer(contenedor);
		}
	}





}