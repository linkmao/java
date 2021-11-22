
public class Rectangulo extends FiguraBidimensional {
private double lado_1;
private double lado_2;
private static int PRECIOXUNIDAD=500;
	
	public Rectangulo(String name, int identificador, double lado1, double lado2 ) {
		super(name, identificador);
		setLado1(lado1);
		setLado2(lado2);
	}
	
	public Rectangulo() {
		super();
	}
	
	
	// Metodos accesores
	public double getLado1() {
		return lado_1;
	}
	
	public double getLado2() {
		return lado_2;
	}
	
	public int getPrecioPorUnidad() {
		return PRECIOXUNIDAD;
	}
	
	// Metodos mutadores
	public void setLado1(double lado1){
		if (lado1>=0)
			lado_1=lado1;
		else
			throw new IllegalArgumentException("El valor del lado del rectangulo debe ser mayor a 0");
	}

	public void setLado2(double lado2){
		if (lado2>=0)
			lado_2=lado2;
		else
			throw new IllegalArgumentException("El valor del lado del rectangulo debe ser mayor a 0");
	}
	
	@Override
	public double costo() {  // Se cumple el contrato de la interfaz
		return perimetro()*getPrecioPorUnidad();
	}
	
	@Override
	public double area() {
		return lado_1*lado_2;
	}

	@Override
	public double perimetro() {
		return 2*lado_1+2*lado_2;
	}

	@Override
	public String toString() {
		return String.format("Figura Rectangulo: %s\nPrimer Lado: %.2f\nSegundo Lado: %.2f\nPrecio por unidad de longitud: %d", super.toString(),getLado1(),getLado2(),getPrecioPorUnidad());
	}
}
