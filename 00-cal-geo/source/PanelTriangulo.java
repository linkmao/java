
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class PanelTriangulo extends  JPanel implements ActionListener {
	// Atributos propios del panel triangulo
	private JLabel lLado1;
	private JLabel lLado2;
	private JLabel lLado3;
	private JLabel lPerimetro;
	private JLabel lArea;
	private JTextField txtLado1;
	private JTextField txtLado2;
	private JTextField txtLado3;
	private JTextField txtPerimetro;
	private JTextField txtArea;
	private JButton btnCalcula;
	public final static String TRIANGULO= "res-triangulo";  // para hacer el llamando a la acccion
	private InterfazGeo principal;


	public PanelTriangulo(InterfazGeo ventana){
		principal = ventana;

		setLayout (new GridLayout(6,2));
		setPreferredSize(new Dimension(0,200));  // Con el 0 no se define anchom pero 130 de alto
		Border border = BorderFactory.createTitledBorder ("Geometría triangulo");
		// border.setTitledColor (Color.BLUE);
		setBorder(border);

		lLado1= new JLabel("Ingresa el valor del primer lado del triangulo");
		lLado2= new JLabel("Ingresa el valor del segundo lado del triangulo");
		lLado3= new JLabel("Ingresa el valor del tercer lado del triangulo");
		lPerimetro= new JLabel("Su perimetro es:");
		lArea= new JLabel("Su area es:");

		txtLado1 = new JTextField();
		txtLado2 = new JTextField();
		txtLado3 = new JTextField();
		txtPerimetro = new JTextField();
		txtArea = new JTextField();
		
		txtPerimetro.setEditable(false);
		txtPerimetro.setForeground(Color.BLUE);
		txtPerimetro.setBackground(Color.WHITE);
		txtArea.setEditable(false);
		txtArea.setForeground(Color.BLUE);
		txtArea.setBackground(Color.WHITE);

		btnCalcula = new JButton("Calcular");
		btnCalcula.setActionCommand(TRIANGULO);
		btnCalcula.addActionListener(this);

		add(lLado1);
		add(txtLado1);
		add(lLado2);
		add(txtLado2);
		add(lLado3);
		add(txtLado3);
		add(lPerimetro);
		add(txtPerimetro);
		add(lArea);
		add(txtArea);
		add (new JLabel(""));
		add (btnCalcula);
	}

	public void actionPerformed (ActionEvent evento){
		String comando = evento.getActionCommand();
		if (comando.equals(TRIANGULO)){
			// LLAMAR EL EVENTO DEL MUNDO....
			principal.calcularTriangulo(Double.parseDouble(txtLado1.getText()),Double.parseDouble(txtLado2.getText()),Double.parseDouble(txtLado3.getText()));
		}

		// NOTESE QUE ESTE UNICO METODO ME PUEDE MANEJAR LAS DIFERNETES ESCUCHAS DE LOS BOTONES DEL PANEL
		//EN ESTE CASO NO SE REQUIERE ESE IF PERO SI SON MAS BOTONES SE PUEDE ENTONCES MANEJAR EN ESTE MISMO METODO
	}

	public void actualizar( String pPerimetro, String pArea) {
		txtPerimetro.setText(pPerimetro);
		txtArea.setText(pArea);
		
	}
	
	public void reiniciar() {
		txtLado1.setText("");
		txtLado2.setText("");
		txtLado3.setText("");
		txtArea.setText("");
		txtPerimetro.setText("");
	}


}