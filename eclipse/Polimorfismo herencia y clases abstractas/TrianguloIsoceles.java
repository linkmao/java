
import java.lang.Math;
public class TrianguloIsoceles extends Triangulo{


	public TrianguloIsoceles(String name, int id, double lado1, double lado2) {
		super(name, id, lado1, lado1, lado2);
		// Lado 1 son los lados simetricos, lado 2 es el lado no simetrico
	}
	
	public TrianguloIsoceles() {
		super();
	}
	
	@Override
	public double area() {
		return getLado1()*(Math.sqrt(Math.pow(getLado1(), 2)-Math.pow((getLado3()/2), 2)))/2;
	}

	@Override
	public String toString() {
		return String.format("Figura triangulo isoceles: %s\nLado simetrico: %.2f\nLado no simetrico: %.2f\nPrecio por unidad de longitud: %d", super.toString(), super.getLado1(), super.getLado3(),super.getPrecioPorUnidad());
	}
}
