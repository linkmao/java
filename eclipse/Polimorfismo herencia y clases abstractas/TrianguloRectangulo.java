
public class TrianguloRectangulo extends Triangulo {

	public TrianguloRectangulo(String name, int identificador, double cateto1, double cateto2, double hipotenusa) {
		super(name, identificador, cateto1, cateto2, hipotenusa);
		//cateto1 será lado 1, cateto2 será lado2, hipotenusa será lado3, en ese orden se obtendran de la clase triangulo
	}

	public TrianguloRectangulo() {
		super();
	}

	@Override
	public double area() {
		return (super.getLado1()*super.getLado2())/2;
	}

	@Override
	public String toString() {
		return String.format("Figura Triangulo Rectangulo: %s\ncateto 1: %.2f\ncateto 2: %.2f\nHipotenusa: %.2f\nPrecio por unidad de longitud: %d",super.toString(), super.getLado1(), super.getLado2(), super.getLado3(),super.getPrecioPorUnidad());
	}
}
