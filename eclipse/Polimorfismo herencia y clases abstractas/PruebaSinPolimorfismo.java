// Nacimiento: 26 de nov 2019
//OBjetivo. Crear una implementacion simple de una estructura de herencia entre varias clases
/*Descripcion: En esta implementacion se muestra el uso de todas las clases creadas a partir de una superclase llamada
FiguraBidimensional, la estructura de herencia permite usar variables de instancia y metodos de las clases que se extienden
para hacer asi mas facil la escritura de los programas
La estructura de herencia queda asi

                                          FiguraBidimensional
                   |                  |                                     |
                Circulo         Rectangulo                              Triangulo
                                     |                  |                    |                    |
                                 Cuadrado      TrianguloRectangulo   TrianguloIsoceles    TrianguloEscaleno
                                                                              |
                                                                     TrianguloEquilatero


-La clase FiguraBIdimensional es abstracta, con metodos abstractos area y perimetro que se deben sobrescribir en las demas clases
-TraianguloEquilatero podria extender a cualquier otra clase de Triangulo, pero al hacerlo con TrianguloIsoceles no necesita
sobrescribir los metodos perimetro() y area() de TrianguloIsoceles pues son los mismos necesarios para TrianguloEquilatero

Cada clase queda documentada asi que alli se explica con detalle todo
*/

public class PruebaSinPolimorfismo {
	public static void main(String[] args) {
	Circulo figura1=new Circulo("CIRCULO 1", 1, 9);
	Rectangulo figura2 = new Rectangulo("RECTANGULO 1", 2, 25, 18);
	Cuadrado figura3 = new Cuadrado("CUADRADO 1",3,5);
	TrianguloRectangulo figura4 = new TrianguloRectangulo("TRIANGULO RECTANGULO 1", 4, 4, 7, 10);
	TrianguloIsoceles figura5 = new TrianguloIsoceles("TRIANGULO ISOCELES 1",5, 10, 4);
	TrianguloEscaleno figura6 = new TrianguloEscaleno("TRIANGULO ESCALENO 1",6,11, 12, 13);
	TrianguloEquilatero figura7 = new TrianguloEquilatero("TRIANGULO EQUILATERO 1",7, 6);
	
	System.out.println(figura1);
	System.out.printf("Determinacion de area y perimetro\nArea: %.2f\nPerimetro: %.2f\n\n", figura1.area(),figura1.perimetro());
	
	System.out.println(figura2);
	System.out.printf("Determinacion de area y perimetro\nArea: %.2f\nPerimetro: %.2f\n\n", figura2.area(),figura2.perimetro());
	
	System.out.println(figura3);
	System.out.printf("Determinacion de area y perimetro\nArea: %.2f\nPerimetro: %.2f\n\n", figura3.area(),figura3.perimetro());
	
	System.out.println(figura4);
	System.out.printf("Determinacion de area y perimetro\nArea: %.2f\nPerimetro: %.2f\n\n", figura4.area(),figura4.perimetro());
	
	System.out.println(figura5);
	System.out.printf("Determinacion de area y perimetro\nArea: %.2f\nPerimetro: %.2f\n\n", figura5.area(),figura5.perimetro());
	
	System.out.println(figura6);
	System.out.printf("Determinacion de area y perimetro\nArea: %.2f\nPerimetro: %.2f\n\n", figura6.area(),figura6.perimetro());
	
	System.out.println(figura7);
	System.out.printf("Determinacion de area y perimetro\nArea: %.2f\nPerimetro: %.2f\n\n", figura7.area(),figura7.perimetro());
	
	}
}
