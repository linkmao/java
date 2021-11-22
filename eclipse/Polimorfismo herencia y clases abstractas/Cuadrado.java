
public class Cuadrado extends Rectangulo {

	public Cuadrado(String name, int identificador, double lado) {
		super(name, identificador, lado, lado);
	}
	
	public Cuadrado() {
		super();
	}
		
@Override
public String toString() {
	return String.format("Figura Cuadrado: %s\nIdentificador: %d\nLado: %.2f\nPrecio por unidad de longitud: %d",super.getNombre(), super.getId(),super.getLado1(),super.getPrecioPorUnidad());
}
}
