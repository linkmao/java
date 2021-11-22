import java.awt.*;
import javax.swing.*;


public class PanelSuma extends  JPanel implements ActionListener {
	// Atributos propios del panel suma
	private Jlabel lNum1;
	private Jlabel lNum2;
	private Jlabel lRes;

	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtRes;

	private JButton btnSuma

	public final static String SUMA= "sumar"  // para hacer el llamando a la acccion
	
	private InterfazCalculadora principal;


	public PanelSuma(InterfazCalculadora ventana){
		principal = ventana;

		setLayout (new GridLayout(5,2));
		setPreferredSize(new Dimension(0,130));  // Con el 0 no se define anchom pero 130 de alto
		TitledBorder border = BorderFactory.createTileBorder ("Suma de dos numeros");
		border.SetTitleColor (Color.BLUE);
		setBorder(border);

		lNum1= new Jlabel("Ingrese número 1");
		lNum2= new Jlabel("Ingrese número 1");
		lRes= new Jlabel("El resultado de la suma");

		txtNum1 = new JTextField();
		txtNum2 = new JTextField();
		txtRes = new JTextField();
		txtRes.SetEditable(false);
		txtRes.SetForeground(Color.BLUE);
		txtRes.Background(Color.WHITE);

		btnSuma = new JButton("Sumar");
		btnSuma.SetActionCommand(SUMA);
		btnSuma.addActionListener(this);


		add(lNum1);
		add(lNum2);
		add(lRes);
		add(btnSuma);
	}



	public void actionPerformed (ActionEvent evento){
		String comando = evento.getActionCommand();
		if (comando.equals(SUMA)){
			// LLAMAR EL EVENTO DEL MUNDO....
			principal.metodo();
		}

		// NOTESE QUE ESTE UNICO METODO ME PUEDE MANEJAR LAS DIFERNETES ESCUCHAS DE LOS BOTONES DEL PANEL
		//EN ESTE CASO NO SE REQUIERE ESE IF PERO SI SON MAS BOTONES SE PUEDE ENTONCES MANEJAR EN ESTE MISMO METODO
	}


}