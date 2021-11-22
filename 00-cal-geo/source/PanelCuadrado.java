	import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class PanelCuadrado extends  JPanel implements ActionListener {
	// Atributos propios del panel cuadrado
	private JLabel lLado;
	private JLabel lPerimetro;
	private JLabel lArea;
	private JTextField txtLado;
	private JTextField txtPerimetro;
	private JTextField txtArea;
	private JButton btnCalcula;
	public final static String CUADRADO= "res-cuadrado";  // para hacer el llamando a la acccion
	private InterfazGeo principal;


	public PanelCuadrado(InterfazGeo ventana){
		principal = ventana;

		setLayout (new GridLayout(4,2));
		setPreferredSize(new Dimension(0,200));  // Con el 0 no se define anchom pero 130 de alto
		Border border = BorderFactory.createTitledBorder ("Geometría Cuadrado");
		// border.setTitledColor (Color.BLUE);
		setBorder(border);

		lLado= new JLabel("Ingresa el valor del lado del cuadrado");
		lPerimetro= new JLabel("Su perimetro es:");
		lArea= new JLabel("Su area es:");

		txtLado = new JTextField();
		txtPerimetro = new JTextField();
		txtArea = new JTextField();
		txtPerimetro.setEditable(false);
		txtPerimetro.setForeground(Color.BLUE);
		txtPerimetro.setBackground(Color.WHITE);
		txtArea.setEditable(false);
		txtArea.setForeground(Color.BLUE);
		txtArea.setBackground(Color.WHITE);

		btnCalcula = new JButton("Calcular");
		btnCalcula.setActionCommand(CUADRADO);
		btnCalcula.addActionListener(this);

		add(lLado);
		add(txtLado);
		add(lPerimetro);
		add(txtPerimetro);
		add(lArea);
		add(txtArea);
		add (new JLabel(""));
		add (btnCalcula);
	}

	public void actionPerformed (ActionEvent evento){
		String comando = evento.getActionCommand();
		if (comando.equals(CUADRADO)){
			// LLAMAR EL EVENTO DEL MUNDO....
			principal.calcularCuadrado(Double.parseDouble(txtLado.getText()));
		}

		// NOTESE QUE ESTE UNICO METODO ME PUEDE MANEJAR LAS DIFERNETES ESCUCHAS DE LOS BOTONES DEL PANEL
		//EN ESTE CASO NO SE REQUIERE ESE IF PERO SI SON MAS BOTONES SE PUEDE ENTONCES MANEJAR EN ESTE MISMO METODO
	}
	
	public void actualizar(String pPerimetro, String pArea) {
		txtPerimetro.setText(pPerimetro);
		txtArea.setText(pArea);
	}
	
	public void reiniciar() {
		txtLado.setText("");
		txtPerimetro.setText("");
		txtArea.setText("");
	}


}