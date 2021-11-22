// NACIMIENTO 21 junio 2019
//OBJETVO: Hacer uso de un objeto de la clase Unir creada por mi y de su metodo al cual se le llama con dos argumentos
// DESCRIPCION: El programa esta bien documentado,lo que si quiero resaltar aca es que el nonmbre de los dos argumentos en este caso
// texto1 y texto2 se puden llamar igual que los parametros definidos en la clase unir, notese como alla tambien se llaman igual

import java.util.Scanner;   // Se importa Scanner para la permitir el ingreso de datos
public class Textos
{
	public static void main (String[] args)
	{
		Scanner entrada1 = new Scanner(System.in);   // Se declara un objeto del tipo escaner (se podria haber declarado uno solo?) seguro si
		Scanner entrada2 = new Scanner(System.in);   // Se declara un objeto tipo Scanner para recibir la informacion (este sobra?)
		Unir muestra = new Unir();					 // Se declara un objeto Unir
		System.out.println("\nEscribe el primer texto");  
		String texto1 = entrada1.nextLine();		// Se pide el primer texto, previa declaracion de variable String
		System.out.println("Escribe el segundo texto");
		String texto2 = entrada2.nextLine();		// Se pide el segundo texto, previa declaracion de variable String
		muestra.mostrarCadenas(texto1, texto2);		// Se hace uso del metodo mostrarCadena llevando los dos arguentos
	}
}