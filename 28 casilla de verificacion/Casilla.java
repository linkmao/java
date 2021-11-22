// Nacimiento 26 diciembre 2019
// Objetivo: Realizar el uso de JChekBox
/* Descripcion.
1. Se hara uso de una clase interna manejadora de eventos pues  usare getSource y a la fecha no se como con este metodo hacer que la clase
manejadora de eventos pueda ser un archivo fuente independiente
2. Para los checkBox, se implementan otras interfaz de escucha (ItemListener)

*/

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Casilla extends JFrame{
	// variables de instancia
	private JTextField cuadroTexto;
	private JCheckBox casillaNegrita;
	private JCheckBox casillaCursiva;

	// metodo constructor
	public Casilla (){
		super("Ejemplo de uso de JChekBox");
		setLayout(new FlowLayout());
		cuadroTexto = new JTextField("Este texto cambiara de negrita a cursiva",30);
		cuadroTexto.setFont(new Font("Serif",Font.PLAIN,14));
		add(cuadroTexto);
		casillaNegrita=new JCheckBox("Negrita");
		add (casillaNegrita);
		casillaCursiva = new JCheckBox("Cursiva");
		add (casillaCursiva);
		// configuracion para la escucha de los eventos
		ManejadorEvento escucha = new ManejadorEvento();
		casillaNegrita.addItemListener(escucha);
		casillaCursiva.addItemListener(escucha);
	}


	// clase interna para el manejo de eventos
	private class ManejadorEvento implements ItemListener{
		private int valNegrita = Font.PLAIN;
		private int valCursiva = Font.PLAIN;
		
		public void itemStateChanged(ItemEvent evento){
			if(evento.getSource()==casillaNegrita)
				valNegrita=casillaNegrita.isSelected() ? Font.BOLD: Font.PLAIN;

			if(evento.getSource()==casillaCursiva)
				valCursiva=casillaCursiva.isSelected() ? Font.ITALIC: Font.PLAIN;

			cuadroTexto.setFont(new Font("Serif",valNegrita+valCursiva,14));	 
		}
	}// Fin de la clase interna manejadora de evento
}
