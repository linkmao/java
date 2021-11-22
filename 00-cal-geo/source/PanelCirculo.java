import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class PanelCirculo extends  JPanel implements ActionListener {
	// Atributos propios del panel cuadrado
	private JLabel lRadio;
	private JLabel lCircunferencia;
	private JLabel lArea;
	private JTextField txtRadio;
	private JTextField txtCircunferencia;
	private JTextField txtArea;
	private JButton btnCalcula;
	public final static String CIRCULO= "circulo";  // para hacer el llamando a la acccion
	private InterfazGeo principal;


	public PanelCirculo(InterfazGeo ventana){
		principal = ventana;

		setLayout (new GridLayout(4,2));
		setPreferredSize(new Dimension(0,200));  // Con el 0 no se define anchom pero 130 de alto
		Border border = BorderFactory.createTitledBorder ("Geometría Circulo");
		// border.setTitledColor (Color.BLUE);
		setBorder(border);

		lRadio= new JLabel("Ingresa el valor del radio del circulo");
		lCircunferencia= new JLabel("Su circunferencia es:");
		lArea= new JLabel("Su area es:");

		txtRadio = new JTextField();
		txtCircunferencia = new JTextField();
		txtArea = new JTextField();
		txtCircunferencia.setEditable(false);
		txtCircunferencia.setForeground(Color.BLUE);
		txtCircunferencia.setBackground(Color.WHITE);
		txtArea.setEditable(false);
		txtArea.setForeground(Color.BLUE);
		txtArea.setBackground(Color.WHITE);

		btnCalcula = new JButton("Calcular");
		btnCalcula.setActionCommand(CIRCULO);
		btnCalcula.addActionListener(this);

		add(lRadio);
		add(txtRadio);
		add(lCircunferencia);
		add(txtCircunferencia);
		add(lArea);
		add(txtArea);
		add (new JLabel(""));
		add (btnCalcula);
	}

	public void actionPerformed (ActionEvent evento){
		String comando = evento.getActionCommand();
		if (comando.equals(CIRCULO)){
			// LLAMAR EL EVENTO DEL MUNDO....
			principal.calcularCirculo(Double.parseDouble(txtRadio.getText()));
		}

		// NOTESE QUE ESTE UNICO METODO ME PUEDE MANEJAR LAS DIFERNETES ESCUCHAS DE LOS BOTONES DEL PANEL
		//EN ESTE CASO NO SE REQUIERE ESE IF PERO SI SON MAS BOTONES SE PUEDE ENTONCES MANEJAR EN ESTE MISMO METODO
	}
	
	public void actualizar( String pCircunferencia, String pArea) {
		txtCircunferencia.setText(pCircunferencia);
		txtArea.setText(pArea);
		
	}
	
	public void reiniciar() {
		txtRadio.setText("");
		txtCircunferencia.setText("");
		txtArea.setText("");
	}

	

}