import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class PanelEsfera extends  JPanel implements ActionListener {
	// Atributos propios del panel cuadrado
	private JLabel lRadio;
	private JLabel lSuperficie;
	private JLabel lVolumen;
	private JTextField txtRadio;
	private JTextField txtSuperficie;
	private JTextField txtVolumen;
	private JButton btnCalcula;
	public final static String ESFERA= "esfera";  // para hacer el llamando a la acccion
	private InterfazGeo principal;


	public PanelEsfera(InterfazGeo ventana){
		principal = ventana;

		setLayout (new GridLayout(4,2));
		setPreferredSize(new Dimension(0,200));  // Con el 0 no se define anchom pero 130 de alto
		Border border = BorderFactory.createTitledBorder ("Geometría Esfera");
		// border.setTitledColor (Color.BLUE);
		setBorder(border);

		lRadio= new JLabel("Ingresa el valor del radio de la esfera");
		lSuperficie= new JLabel("Su superficie es:");
		lVolumen= new JLabel("Su volumen es:");

		txtRadio = new JTextField();
		txtSuperficie = new JTextField();
		txtVolumen = new JTextField();
		txtSuperficie.setEditable(false);
		txtSuperficie.setForeground(Color.BLUE);
		txtSuperficie.setBackground(Color.WHITE);
		txtVolumen.setEditable(false);
		txtVolumen.setForeground(Color.BLUE);
		txtVolumen.setBackground(Color.WHITE);

		btnCalcula = new JButton("Calcular");
		btnCalcula.setActionCommand(ESFERA);
		btnCalcula.addActionListener(this);

		add(lRadio);
		add(txtRadio);
		add(lSuperficie);
		add(txtSuperficie);
		add(lVolumen);
		add(txtVolumen);
		add (new JLabel(""));
		add (btnCalcula);
	}

	public void actionPerformed (ActionEvent evento){
		String comando = evento.getActionCommand();
		if (comando.equals(ESFERA)){
			// LLAMAR EL EVENTO DEL MUNDO....
			principal.calcularEsfera(Double.parseDouble(txtRadio.getText()));
		}

		// NOTESE QUE ESTE UNICO METODO ME PUEDE MANEJAR LAS DIFERNETES ESCUCHAS DE LOS BOTONES DEL PANEL
		//EN ESTE CASO NO SE REQUIERE ESE IF PERO SI SON MAS BOTONES SE PUEDE ENTONCES MANEJAR EN ESTE MISMO METODO
	}
	
	public void actualizar(String pSuperficie, String pVolumen) {
		txtSuperficie.setText(pSuperficie);
		txtVolumen.setText(pVolumen);
	}

	public void reiniciar() {
		txtRadio.setText("");
		txtSuperficie.setText("");
		txtVolumen.setText("");
	}


}