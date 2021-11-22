// Nacimiento 26 novimebre de 2019

/* Descripcion. La idea es utilzar el concepto de polimorfismo usando definicion de variable de la superclase FiguraBidimensional
para guardar alli una referencia de objetos de las diferentes figuras

Esta implementacion usa la herencia entre clases y el concepto de polimorfismo (para la implementacion de las interfaces vaya a  PruebaConInterfaz)
*/
public class PruebaConPolimorfismo {

	public static void main(String[] args) {
		// Se crea un vector de 7 filas para guardar alli los objetos. Notese que no se crea objetos de la clase 
		//FiguraBidimensinal(Clase abstracta), pero si se guardaran alli referencias a objetos de las otras figuras
		FiguraBidimensional[] figuras= new FiguraBidimensional[7];
		// Opcion 1, asignacion directa
		figuras[0]=new Circulo("FIGURA CIRCULO", 1, 3); 
		figuras[1]=new Cuadrado("FIGURA CUADRADO", 2, 5);
		figuras[2]=new Rectangulo("FIGURA RECTANGULO", 3, 10, 12);
		figuras[3]=new TrianguloRectangulo("FIGURA TRIANGULO RECTANGULO",4, 2,3, 5);
		figuras[4]=new TrianguloEscaleno("FIGURA TRAINAGULO ESCALENO", 5, 5, 7, 8);
		figuras[5]=new TrianguloIsoceles("FIGURA TRIANGULO ISOCELES", 6, 10 ,5);
		// Opcion 2, asignacion mediante uan variable que guarda un objeto
		TrianguloEquilatero tEquilatero= new TrianguloEquilatero("FIGURA TRIANGULO EQUILATERO", 7, 12);
		figuras[6]=tEquilatero;
		
		
		/* en figuaraActual se guarda la referencia al objeto actual desde el circulo hasta el triangulo isoceles
		 Esta forma de uso de for hace que se recorra todos los elementos del array
		 Se imprime el metodo toString(), se llama los metodos perimetro y area, se llama el metodo getClass().getName de la clase 
		 Object para obtener el nombre de la clase que pertenece la figura, y se usa instanceof para tecttar cuando se tenga una clase 
		 en particular ejecutar una accion especifia*/
		for(FiguraBidimensional figuraActual: figuras) {
			System.out.printf("%s\nArea de la figura: %.2f\nPerimetro de la figura: %.2f\nCosto total de la figura: %.2f\nLa figura mostrada es de la clase: %s\n\n", figuraActual, figuraActual.area(), figuraActual.perimetro(),figuraActual.costo(), figuraActual.getClass().getName());
			
			if (figuraActual instanceof TrianguloRectangulo)
				System.out.println("***** FELICIDADES, ACABO DE ESCRIBIR LOS DATOS DEL TRIANGULO RECTANGULO*****\n\n");
				
		}
		
}
	

}
