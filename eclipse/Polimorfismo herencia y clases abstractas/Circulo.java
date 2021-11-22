
import java.lang.Math;
public class Circulo extends FiguraBidimensional {
private double radio;
private final int PRECIOXUNIDAD=300; 

	public Circulo(String name, int identificador, double radiocirculo) {
		super(name, identificador);
		setRadio(radiocirculo);
		}
	
	public Circulo() {
		super();
	}
	
	
	public void setRadio(double radiocirculo) {
		if (radiocirculo>0) {
			radio=radiocirculo;
		}
		else {
			throw new IllegalArgumentException("Valor de radio no valido, debe ser mayor a cero");
		}
	}
	
	public double getRadio() {
		return radio;
	}
	
	public int getPrecioPorUnidad() {
		return PRECIOXUNIDAD;
	}
	
	@Override
	public double costo() {                           // La implementacion de este metodo cumple con el contrato que se trae desde la interfaz CentroDeCosto
		return perimetro()*getPrecioPorUnidad();
	}
	
	@Override
	public double area() {
		return Math.PI*Math.pow(getRadio(), 2);
	}

	@Override
	public double perimetro() {
		return 2*Math.PI*getRadio();
	}
	
@Override
public String toString() {
		return String.format("Figura Circulo: %s\nRadio: %.2f\nPrecio por unidad de longitud: %d",super.toString() ,getRadio(), getPrecioPorUnidad());
	}
	
}
