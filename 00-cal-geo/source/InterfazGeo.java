import java.awt.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class InterfazGeo extends JFrame {
	CalGeo calgeo;
	private PanelCuadrado panelCuadrado;
	private PanelCuadrado panelCuadradoRetorno; /* Se crea esta variable para llevar una 
	referencia del panelCuadrado y poder llevar así los resultados a la caja de texto, pues
	al querer usar directamente los metodos de panelCuadrado por fuera del metodo constructor
	de esta clase genera error. Usando la referencia a panelCuadrado si lo puedo hacer */
	private PanelRectangulo panelRectangulo, panelRectanguloRetorno;
	private PanelTriangulo panelTriangulo, panelTrianguloRetorno;
	private PanelCirculo panelCirculo, panelCirculoRetorno;
	private PanelEsfera panelEsfera, panelEsferaRetorno;
	private PanelReinicio panelReinicio;
		
	public static void main (String[] args){
		InterfazGeo ventana = new InterfazGeo();
		ventana.setVisible(true);
	}
	
	public InterfazGeo() {
		setTitle ( "Calculadora básica");
		setSize (1000,600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setLayout(new BorderLayout()); // este es un distribuidor de espacio
		setLayout (new GridLayout(3,2));

	    PanelCuadrado panelCuadrado = new PanelCuadrado(this);  // Este this permite una comunicacion bidireccional (en estudio )
//		add(panelCuadrado, BorderLayout.NORTH);
		add(panelCuadrado);
		
		PanelRectangulo panelRectangulo = new PanelRectangulo(this);  // Este this permite una comunicacion bidireccional (en estudio )
//		add(panelRectangulo, BorderLayout.CENTER);
		add(panelRectangulo);
		
		PanelTriangulo panelTriangulo = new PanelTriangulo(this);  // Este this permite una comunicacion bidireccional (en estudio )
//		add(panelTriangulo, BorderLayout.SOUTH);
		add(panelTriangulo);
		
		PanelCirculo panelCirculo = new PanelCirculo(this);  // Este this permite una comunicacion bidireccional (en estudio )
//		add(panelTriangulo, BorderLayout.SOUTH);
		add(panelCirculo);
		
		PanelEsfera panelEsfera = new PanelEsfera(this);  // Este this permite una comunicacion bidireccional (en estudio )
//		add(panelTriangulo, BorderLayout.SOUTH);
		add(panelEsfera);
		
		PanelReinicio panelReinicio = new PanelReinicio(this);  // Este this permite una comunicacion bidireccional (en estudio )
//		add(panelTriangulo, BorderLayout.SOUTH);
		add(panelReinicio);
		
		panelCuadradoRetorno=panelCuadrado;   // Se crea la referencia del panelCuadrado para poder usar sus metodos fuera de este metodo constructor
		panelRectanguloRetorno=panelRectangulo;
		panelTrianguloRetorno= panelTriangulo;
		panelCirculoRetorno=panelCirculo;
		panelEsferaRetorno=panelEsfera;
		/* Ya entendí, la palabra this se refiere siempre a la clase actual, eso signigica que al constructor de
		PanelSuma por ejemplo se le envia como argumento, la clase actual, significa eso entonces que en la definicion
		del constructor de la clase PanelSuma debe estar definido el recibimiento de paranetro del tipo clase (es decir)
		recibe esta clase, TODO ESTO GARANTIZA UNA COMUNICACION BIDIRECCINAL ENTRE LOS PANELES CON BOTONES Y LA CLASE INTERFAZ
		PRINCIPAL
		*/

//		panelResta = new PanelResta(this);
//		add(panelResta, BorderLayout.CENTER);
//
//		panelMultiplica = new PanelMultiplica(this);
//		add(panelMultiplica, BorderLayout.SOUTH);
	}
			
	public void calcularCuadrado(double pLado) {
		try {
		CalGeo calgeo = new CalGeo();
		Cuadrado cuadrado;
		cuadrado= calgeo.calcularCuadrado(pLado);
		double perimetro= (double)Math.round(cuadrado.perimetro()*100)/100;
		double area= (double)Math.round(cuadrado.area()*100)/100;
 		panelCuadradoRetorno.actualizar(Double.toString(perimetro),Double.toString(area)); 
		}
		catch ( Exception e )
		{
			JOptionPane.showMessageDialog( this, e.getMessage( ), "Calculo del cuadrado", JOptionPane.WARNING_MESSAGE );
		}
	}
	
	public void calcularRectangulo(double pBase, double pAltura) {
		try {
		CalGeo calgeo = new CalGeo();
		Rectangulo rectangulo;
		rectangulo= calgeo.calcularRectangulo(pBase, pAltura);
		double perimetro= (double)Math.round(rectangulo.perimetro()*100)/100;
		double area= (double)Math.round(rectangulo.area()*1000.0)/1000.0;
		panelRectanguloRetorno.actualizar(Double.toString(perimetro),Double.toString(area));
		}
		catch ( Exception e )
		{
			JOptionPane.showMessageDialog( this, e.getMessage( ), "Calculo del rectangulo", JOptionPane.WARNING_MESSAGE );
		}
	
	}
	
	public void calcularTriangulo(double pLado1, double pLado2, double pLado3) {
		try {
		CalGeo calgeo = new CalGeo();
		Triangulo triangulo;
		triangulo=calgeo.calcularTriangulo(pLado1, pLado2, pLado3);
		double perimetro= (double)Math.round(triangulo.perimetro()*100)/100;
		double area= (double)Math.round(triangulo.area()*100)/100;
		panelTrianguloRetorno.actualizar(Double.toString(perimetro),Double.toString(area) );
		}
		catch ( Exception e )
		{
			JOptionPane.showMessageDialog( this, e.getMessage( ), "Calculo del triangulo", JOptionPane.WARNING_MESSAGE );
		}
	}
	
	public void calcularCirculo(double pRadio) {
		try {
		CalGeo calgeo = new CalGeo();
		Circulo circulo;
		circulo=calgeo.calcularCirculo(pRadio);
		double circunferencia= (double)Math.round(circulo.circunferencia()*100)/100;
		double area= (double)Math.round(circulo.area()*100)/100;
		panelCirculoRetorno.actualizar(Double.toString(circunferencia),Double.toString(area));
		}
		catch ( Exception e )
		{
			JOptionPane.showMessageDialog( this, e.getMessage( ), "Calculo del circulo", JOptionPane.WARNING_MESSAGE );
		}
	}
	
	public void calcularEsfera(double pRadio) {
		try {
		CalGeo calgeo = new CalGeo();
		Esfera esfera;
		esfera=calgeo.calcularEsfera(pRadio);
		double superficie= (double)Math.round(esfera.superfice()*100)/100;
		double volumen= (double)Math.round(esfera.volumen()*100)/100;
		panelEsferaRetorno.actualizar(Double.toString(superficie),Double.toString(volumen));
		}
		catch ( Exception e )
		{
			JOptionPane.showMessageDialog( this, e.getMessage( ), "Calculo de la esfera", JOptionPane.WARNING_MESSAGE );
		}
	}
	
	public void reiniciar() {
		panelCuadradoRetorno.reiniciar();
		panelRectanguloRetorno.reiniciar();
		panelTrianguloRetorno.reiniciar();
		panelCirculoRetorno.reiniciar();
		panelEsferaRetorno.reiniciar();
	}
	
	public void salir() {
		dispose();
	}
}
