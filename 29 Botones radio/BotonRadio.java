// Nacimiento 26 diciembre 2019
// Objetivo: Realizar el uso de JRadioButton
/* Descripcion.


*/

import java.awt.FlowLayout;   // Permite el flujo de trabajo, o la forma en que se van poniendo los controles
import java.awt.Font;			// Crear objetos de tipo font
import java.awt.event.ItemListener;   // Interfaz para manejar eventos
import java.awt.event.ItemEvent;     // Necesario para crear objetos que escuchen eventos
import javax.swing.JFrame;			// Clase basica para la creaciond e ventanas
import javax.swing.JTextField;		// Clase basica para campos de texto
import javax.swing.JRadioButton;	// Clase para los btones tipo radio
import javax.swing.ButtonGroup;      // Clase que le da la logica a los JRadioButton de tal forma que solo uno de ellos este seleccionado

public class BotonRadio extends JFrame{
	// Declaracion de variables de instancia
	private JTextField cuadroTexto;
	private Font letraSimple;
	private Font letraCursiva;
	private Font letraNegrita;
	private Font letraNegritaCursiva;
	private JRadioButton botonSimple;
	private JRadioButton botonNegrita;
	private JRadioButton botonCursiva;
	private JRadioButton botonNegritaCursiva;
	private ButtonGroup grupoOpciones;

	// Metodo constructor
	public BotonRadio(){
		super("Uso de los botones radio");
		setLayout(new FlowLayout());
		cuadroTexto=new JTextField("Este es el texto que cambiara",30);
		add(cuadroTexto);

		botonSimple=new JRadioButton("simple",true);
		botonNegrita=new JRadioButton("negrita",false);
		botonCursiva=new JRadioButton("cursiva",false);
		botonNegritaCursiva = new JRadioButton("negrita y cursiva", false);
		add(botonSimple);
		add(botonNegrita);
		add(botonCursiva);
		add(botonNegritaCursiva);
		
		// Relacion logica de los JRadioButton se lo da el objeto del tipo ButtonGroup.
		grupoOpciones= new ButtonGroup();
		grupoOpciones.add(botonSimple);
		grupoOpciones.add(botonNegrita);
		grupoOpciones.add(botonCursiva);
		grupoOpciones.add(botonNegritaCursiva);  

		// Creacion de los tipos de letra
		letraSimple=new Font("Serif", Font.PLAIN,14);
		letraNegrita=new Font("Serif", Font.BOLD,14);
		letraCursiva=new Font("Serif", Font.ITALIC,14);
		letraNegritaCursiva =new Font("Serif", Font.BOLD+Font.ITALIC,14);
		cuadroTexto.setFont(letraSimple);

		botonSimple.addItemListener(new ManejadorEventos(letraSimple));
		botonNegrita.addItemListener(new ManejadorEventos(letraNegrita));
		botonCursiva.addItemListener(new ManejadorEventos(letraCursiva));
		botonNegritaCursiva.addItemListener(new ManejadorEventos(letraNegritaCursiva));

	}

		//Inicio de laa clase manejadora de eventos
		private class ManejadorEventos implements ItemListener{
			private Font tipoDeLetra;
			public ManejadorEventos(Font f){
				tipoDeLetra=f;
			}
		public void itemStateChanged(ItemEvent evento){
			cuadroTexto.setFont(tipoDeLetra);	
		}	
			
		}  // Fin de la clase manejadora de eventos

} // fin de la clase principal



