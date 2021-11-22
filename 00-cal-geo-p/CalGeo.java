package mundo;

public class CalGeo{
	Cuadrado cuadrado;
	Rectangulo rectangulo;
	Triangulo triangulo;
	Circulo circulo;
	Esfera esfera;
	
	// Metodo constructor vacio
	public CalGeo() {
	}
	
	
	public Cuadrado calcularCuadrado(double pLado) {
		cuadrado = new Cuadrado (pLado);
		return cuadrado;
		
	} 
	
	
	public Rectangulo calcularRectangulo(double pBase, double pAltura) {
		rectangulo = new Rectangulo (pBase,pAltura);
		return rectangulo;
		
	} 
	

	public Triangulo calcularTriangulo(double pLado1, double pLado2, double pLado3) {
		triangulo = new Triangulo (pLado1,pLado2,pLado3);
		return triangulo;
		
	} 
	
	public Circulo calcularCirculo(double pRadio) {
		circulo = new Circulo (pRadio);
		return circulo;
		
	} 
	
	public Esfera calcularEsfera(double pRadio) {
		esfera = new Esfera (pRadio);
		return esfera;
		
	} 

}