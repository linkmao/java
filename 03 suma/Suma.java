//NACIMIENTO: 19 junio 2019
// OBJETIVO: Usar un elemento de entrada y variables, ademas de crear objetos
// DESCRIPCION;
//	- Se improta la clase Scanner de donde se utilizará el metodo nextin 
//  -  Se crea un objeto kkamado ebtrada para usar el metodo nextInt
//  - se suma y se muestra los resultados

import java.util.Scanner; // Importa paquete java.util para usar la clase Scanner
public class Suma
{
	public static void main (String[] arg)
	{
		Scanner entrada=new Scanner(System.in); // Declara la variable entrada y luego le asigna un objeto Scanner
		int num1;
		int num2;
		int resultado;

		System.out.print("Por favor digita un numero entero ");
		num1=entrada.nextInt(); // hace uso del objeto entrada para recibir el valor digitado

		System.out.print("Por favor digita otro numero entero ");
		num2=entrada.nextInt();
		
		resultado=num1+num2;
		
		System.out.printf("La suma de los dos numeros digitados es %d\n", resultado ); // Opcion del libro con printf (con formato) %d consultar, \n es caracter de escape que genera nueva linea
		System.out.println("La suma de los dos numeros digitados es " + resultado); // Mi opción de mostrar concatenando con +
	}
}