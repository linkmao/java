
public class TrianguloEquilatero extends TrianguloIsoceles {

	public TrianguloEquilatero(String name, int id, double lado) {
		super(name, id, lado, lado);
	
	}

	public TrianguloEquilatero() {
		super();
	}

	@Override
	public String toString() {
		return String.format("Figura Triangulo rectangulo: %s\nIdentificador:%d\nLado: %.2f\nPrecio por unidad de longitud: %d", super.getNombre(),super.getId(), super.getLado1(),super.getPrecioPorUnidad() );
	}
	
}
