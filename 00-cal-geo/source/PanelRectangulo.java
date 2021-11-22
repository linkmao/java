import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class PanelRectangulo extends  JPanel implements ActionListener {
	// Atributos propios del panel cuadrado
	private JLabel lBase;
	private JLabel lAltura;
	private JLabel lPerimetro;
	private JLabel lArea;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JTextField txtPerimetro;
	private JTextField txtArea;
	private JButton btnCalcula;
	public final static String RECTANGULO= "res-rectangulo";  // para hacer el llamando a la acccion
	private InterfazGeo principal;


	public PanelRectangulo(InterfazGeo ventana){
		principal = ventana;

		setLayout (new GridLayout(5,2));
		setPreferredSize(new Dimension(0,200));  // Con el 0 no se define anchom pero 130 de alto
		Border border = BorderFactory.createTitledBorder ("Geometría rectangulo");
		// border.setTitledColor (Color.BLUE);
		setBorder(border);

		lBase= new JLabel("Ingresa el valor de la base del rectangulo");
		lAltura= new JLabel("Ingresa el valor de la altura del rectangulo");
		lPerimetro= new JLabel("Su perimetro es:");
		lArea= new JLabel("Su area es:");

		txtBase = new JTextField();
		txtAltura = new JTextField();
		txtPerimetro = new JTextField();
		txtArea = new JTextField();
		txtPerimetro.setEditable(false);
		txtPerimetro.setForeground(Color.BLUE);
		txtPerimetro.setBackground(Color.WHITE);
		txtArea.setEditable(false);
		txtArea.setForeground(Color.BLUE);
		txtArea.setBackground(Color.WHITE);

		btnCalcula = new JButton("Calcular");
		btnCalcula.setActionCommand(RECTANGULO);
		btnCalcula.addActionListener(this);

		add(lBase);
		add(txtBase);
		add(lAltura);
		add(txtAltura);
		add(lPerimetro);
		add(txtPerimetro);
		add(lArea);
		add(txtArea);
		add (new JLabel(""));
		add (btnCalcula);
	}

	public void actionPerformed (ActionEvent evento){
		String comando = evento.getActionCommand();
		if (comando.equals(RECTANGULO)){
			// LLAMAR EL EVENTO DEL MUNDO....
			principal.calcularRectangulo(Double.parseDouble(txtBase.getText()), Double.parseDouble(txtAltura.getText()));
		}

		// NOTESE QUE ESTE UNICO METODO ME PUEDE MANEJAR LAS DIFERNETES ESCUCHAS DE LOS BOTONES DEL PANEL
		//EN ESTE CASO NO SE REQUIERE ESE IF PERO SI SON MAS BOTONES SE PUEDE ENTONCES MANEJAR EN ESTE MISMO METODO
	}
	
	
	public void actualizar(String pPerimetro, String pArea) {
		txtPerimetro.setText(pPerimetro);
		txtArea.setText(pArea);
		
	}
	
	public void reiniciar() {
		txtBase.setText("");
		txtAltura.setText("");
		txtArea.setText("");
		txtPerimetro.setText("");
	}



}