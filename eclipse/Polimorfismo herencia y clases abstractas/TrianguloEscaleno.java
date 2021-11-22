
import java.lang.Math;
public class TrianguloEscaleno extends Triangulo {
	
	public TrianguloEscaleno(String name, int id, double lado1, double lado2, double lado3) {
		super(name, id, lado1, lado2, lado3);
	}
	
	public TrianguloEscaleno() {
		super();
	}
	
	@Override
	public double area() {
		return Math.sqrt((perimetro()/2)*((perimetro()/2)-getLado1())*((perimetro()/2)-getLado2())*((perimetro()/2)-getLado3()));
	}
	
	@Override
	public String toString() {
		return String.format("Figura triangulo escaleno: %s\nLado1 %.2f\nLado2 %.2f\nlado3 %.2f\nPrecio por unidad de longitud: %d", super.toString(),super.getLado1(), super.getLado2(), super.getLado3(),super.getPrecioPorUnidad());
	}
	

}
