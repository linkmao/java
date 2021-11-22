// NACIMIENTO: 09 de noviembre de 2019
// OBJETIVO :  Muesra de el uso de polimorfismo
/*DESCRIPCION: Esta implemetacion usa la superclase Profesor y la subcalse, Coooridinador para mostrar el uso del polimorfismo, en este
ejemplo la conclusion genreal es: SE PUEDE COPIAR LA REFERENCIA DE UN OBJETO CREADO DE UNA SUBCLASE A UNA VARIABLE DEL TIPO DE LA
SUPERCLASE.

En este ejemplo se hace lo siguinete:
1. Se crea un objeto del tipo Profesor, el cual es la superclase
2. Se crea un objeto del tipo Coordinador el cual es la subclase de profesor, ese objeto se guarda en la variable de tipo Coordinado llamada ocoordinado
3. Se crea un objeto del tipo Profesor, en la variable coordinador2, al cual se le lleva la referencia de ocoordinador

ESTO ES POSIBLE PORQUE UN COORDINADOR ES UN PROFESOR, POR ESO SE PUEDE CREAR UNA VARIABLE DE TIPO PROFESOR Y LLEVAR ALLI UNA VARIABLE DE 
TIPO COORDINADOR, PERO AL REVEZ NO FUNCIONA PUES UN PROFESOR NO ES UN COORDINADOR

finalmente cuando se llama el metodo toString de coordinador2, a pesar de ser un objeto de la clase profesor, se está llamando el metodo
toString() de la clase coordinador*/


public class PruebaPolimorfismo{
public static void main (String[] args){
	Profesor oprofesor = new Profesor ("Mauricio" ,"", "Rua", "Florez", 40, 2813870, 2000000, 30);   
	Coordinador ocoordinador = new Coordinador("Diego", "Armando", "Rua", "Florez",  38, 3118181, 3000000, 25, 500000);
	System.out.printf("\n%s%s\n","Metodo toString() de objeto tipo Profesor", oprofesor.toString());
	System.out.printf("\n%s%s\n","Metodo toString() de objeto tipo Coodinador", ocoordinador.toString());

	// Esta es la parte crucial, se crea una variable tipo Profesor pero se guarda una referencia de un objeto tipo Coordinador
	Profesor coordinador2 = ocoordinador;
	System.out.printf("\n%s%s\n","Metodo toString() de objeto tipo Profesor, pero que contiene referencia a coordinador", coordinador2.toString());
	// Cuando se usa el toString se esta usado en metodo toString de coordinador a pesar de que el objeto es un profesor


//  Eso es adicional!!!!, es para ver como la copia de la referencia hace que cuando cambia un dato en cualquier objeto, cambia en todos los que son
//	refrencia a ese objeto, osea que en realidad coordinador2 y ocoordinador no son dos objetos independientes si no que guardan la misma informacion pues 
//	estan apuntado a la misma informacion en memoria
	ocoordinador.setPrimerNombre("Mariangel");
	System.out.printf("%s: %s\n","Nuevo primer nombre del objeto ocoordinador",ocoordinador.getPrimerNombre());
	System.out.printf("%s: %s\n","Nuevo primer nombre del objeto coordinador2",coordinador2.getPrimerNombre());
	coordinador2.setSegundoNombre("Hermosa");
	System.out.printf("%s: %s\n","Nuevo segundo nombre del objeto ocoordinador",ocoordinador.getSegundoNombre());
	System.out.printf("%s: %s\n","Nuevo segundo nombre del objeto coordinador2",coordinador2.getSegundoNombre());
}




}