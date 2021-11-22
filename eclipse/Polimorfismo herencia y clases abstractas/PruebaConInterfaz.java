
// Nacimiento 02 diciembre de 2019

/* Descripcion. la idea es utilizar el concepto de Interfaz que usa de igual manera el polimorfismo


*/
public class PruebaConInterfaz {

	public static void main(String[] args) {
		// Se crea un vector de 8 filas para guardar alli los objetos. En este Notese que no se crea objetos de la interfaz 
		//CentroDeCostos(Clase abstracta), pero si se guardaran alli referencias a objetos de las otras figuras
		CentroDeCosto[] datos= new CentroDeCosto[8];
		// Opcion 1, asignacion directa
		datos[0]=new Circulo("FIGURA CIRCULO", 1, 3); 
		datos[1]=new Cuadrado("FIGURA CUADRADO", 2, 5);
		datos[2]=new Rectangulo("FIGURA RECTANGULO", 3, 10, 12);
		datos[3]=new TrianguloRectangulo("FIGURA TRIANGULO RECTANGULO",4, 2,3, 5);
		datos[4]=new TrianguloEscaleno("FIGURA TRAINAGULO ESCALENO", 5, 5, 7, 8);
		datos[5]=new TrianguloIsoceles("FIGURA TRIANGULO ISOCELES", 6, 10 ,5);
		// Opcion 2, asignacion mediante uan variable que guarda un objeto
		TrianguloEquilatero tEquilatero= new TrianguloEquilatero("FIGURA TRIANGULO EQUILATERO", 7, 12);
		datos[6]=tEquilatero;
		datos[7]=new Profesor("maolink@gmail.com","Matematicas",80000,40); 
		
		
		/* en datoActual se guarda la referencia al objeto actual desde el circulo hasta el triangulo isoceles, pasando por profesor
		 Esta forma de uso de for hace que se recorra todos los elementos del array
		 Se imprime el metodo toString(), se llama los metodos perimetro y area, se llama el metodo getClass().getName de la clase 
		 Object para obtener el nombre de la clase que pertenece la figura, y se usa instanceof para tecttar cuando se tenga una clase 
		 en particular ejecutar una accion especifia*/
		for(CentroDeCosto datoActual: datos) {
			if (datoActual instanceof Profesor)
				System.out.printf("Objeto Profesor:\n%s\nTotal del salario: %.2f",datoActual, datoActual.costo());
			else
				System.out.printf("%s\nArea de la figura: %.2f\nPerimetro de la figura: %.2f\nCosto total de la figura: %.2f\nLa figura mostrada es de la clase: %s\n\n", datoActual, datoActual.area(), datoActual.perimetro(),datoActual.costo(), datoActual.getClass().getName());
			}
		
}
	

}
