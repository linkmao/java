
public abstract class Triangulo extends FiguraBidimensional {
private double lado_1;
private double lado_2;
private double lado_3;
private static int PRECIOXUNIDAD=800;

	public Triangulo(String name, int identificador, double lado1, double lado2, double lado3) {
		super(name, identificador);
		setLado1(lado1);
		setLado2(lado2);
		setLado3(lado3);
	}

	public Triangulo() {
		super();
	}
	
	//Metodos mutadores
	public void setLado1(double lado1) {
		if (lado1>=0)
			lado_1=lado1;
		else
			throw new IllegalArgumentException("El valor del lado del triangulo debe ser mayor o igual a 0");
	}
	
	public void setLado2(double lado2) {
		if (lado2>=0)
			lado_2=lado2;
		else
			throw new IllegalArgumentException("El valor del lado del triangulo debe ser mayor o igual a 0");
	}
	
	public void setLado3(double lado3) {
		if (lado3>=0)
			lado_3=lado3;
		else
			throw new IllegalArgumentException("El valor del lado del triangulo debe ser mayor o igual a 0");
	}
	
	
	// Metodos accesores
	
	public int getPrecioPorUnidad() {  
		return PRECIOXUNIDAD;
	}
	
	public double getLado1() {
		return lado_1;
	}

	public double getLado2() {
		return lado_2;
	}

	public double getLado3() {
		return lado_3;
	}
	
	@Override
	public double perimetro() {
		return getLado1()+getLado2()+getLado3();
	}

	@Override
	public abstract double area();
	
	@Override
	public double costo() {     // Se cumple el contrato de la interfaz
		return perimetro()*getPrecioPorUnidad();
	}
	
	
	
	
		
	}


