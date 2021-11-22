import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class PanelReinicio extends  JPanel implements ActionListener {
	// Atributos propios del panel reinicio
	
	private JButton btnReiniciar;
	private JButton btnSalir;
	public final static String REINICIO= "reinicio";  // para hacer el llamando a la acccion
	public final static String SALIR= "salir";  // para hacer el llamando a la acccion
	private InterfazGeo principal;


	public PanelReinicio(InterfazGeo ventana){
		principal = ventana;

		setLayout (new GridLayout(2,1));
		setPreferredSize(new Dimension(0,200));  // Con el 0 no se define anchom pero 130 de alto
		Border border = BorderFactory.createTitledBorder ("Configuracion");
		// border.setTitledColor (Color.BLUE);
		setBorder(border);

		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setActionCommand(REINICIO);
		btnReiniciar.addActionListener(this);
		btnSalir = new JButton("Salir");
		btnSalir.setActionCommand(SALIR);
		btnSalir.addActionListener(this);

		add (btnReiniciar);
		add (btnSalir);
	}

	public void actionPerformed (ActionEvent evento){
		String comando = evento.getActionCommand();
		if (comando.equals(REINICIO)){
			principal.reiniciar();
		}
		if (comando.equals(SALIR)) {
			principal.salir();
		}
		

		// NOTESE QUE ESTE UNICO METODO ME PUEDE MANEJAR LAS DIFERNETES ESCUCHAS DE LOS BOTONES DEL PANEL
		//EN ESTE CASO NO SE REQUIERE ESE IF PERO SI SON MAS BOTONES SE PUEDE ENTONCES MANEJAR EN ESTE MISMO METODO
	}
	
	

}