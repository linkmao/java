package maolink.calculadoraBasica.interfaz;
import java.awt.*;
import javax.swing.*;

//import maolink.calculadoraBasica.mundo;


/**
*Interfaz de la calcualdora basica
*/
public class InterfazCalculadora extends JFrame {

	// Atributos
	private CalculadoraBasica  calculadora;


	// Atribitos de la interfaz
	private PanelSuma panelSuma;
	private PanelResta panelResta;
	private PanelMultiplica panelMultiplica;
	
	// Metodo constructor
	public InterfazCalculadora() throws Exception{
		setTitle ( "Calculadora básica");
		setSize (300,300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout()); // este es un distribuidor de espacio

		panelSuma = new PanelSuma(this);  // Este this permite una comunicacion bidireccional (en estudio )
		add(panelSuma, BorderLayout.NORTH);
		/* Ya entendí, la palabra this se refiere siempre a la clase actual, eso signigica que al constructor de
		PanelSuma por ejemplo se le envia como argumento, la clase actual, significa eso entonces que en la definicion
		del constructor de la clase PanelSuma debe estar definido el recibimiento de paranetro del tipo clase (es decir)
		recibe esta clase, TODO ESTO GARANTIZA UNA COMUNICACION BIDIRECCINAL ENTRE LOS PANELES CON BOTONES Y LA CLASE INTERFAZ
		PRINCIPAL
		*/

		panelResta = new PanelResta(this);
		add(panelResta, BorderLayout.CENTER);

		panelMultiplica = new PanelMultiplica(this);
		add(panelMultiplica, BorderLayout.SOUTH);
	}

	public static void (String[] args){
		InterfazCalculadora ventana = new InterfazCalculadora();
		ventana.setVisible(true);
	}




}
