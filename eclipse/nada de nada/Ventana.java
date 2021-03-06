import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;



public class Ventana extends JFrame {
	// Declaracion de variables de instancia
	private JButton botonAceptar;
	private JButton botonCancelar;
	private JLabel etiqueta;

	// Metodo constructor
	public Ventana () {
		super("Reocrdando un ejemplo");
		setLayout(new FlowLayout());
		botonAceptar = new JButton("Aceptar");
		botonAceptar.addActionListener(new Manejador());
		botonCancelar= new JButton("Cancelar");
		botonCancelar.addActionListener(new Manejador());
		etiqueta=new JLabel("Texto aca");
		add(botonAceptar);
		add(botonCancelar);
		add(etiqueta);
		}
	
		//Metodo manejador de evento
		private class Manejador implements ActionListener{
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource()==botonAceptar)
					etiqueta.setText("Se ha preisonado ACEPTAR");
				else if (ae.getSource()==botonCancelar)
					etiqueta.setText("Se ha presionado CANELAR");
				else
					etiqueta.setText("Este texto no deberia ir");
							
		}
		
	}    

}
