// NACIMIENTO: 13 OCTUBRE DE 2019
// OBJETIVO :  Comprender como generar y atender excepciones en un programa
/* DESCRIPCION: Se crea una clase Cuenta que mmaneja una variable de instancia llamada mes, la idea es que se inicialice esa variable
solo con valores entre 1 y 12, de no ser asi se lanza una excepcion, en caso de haber una excepcion el programa no sigue y se va directamente
a catch, lo que se debe buscar es como apoprvechar eso para volver a pedir la informacion y recuperarse del error, con un while?*/ 

import java.util.Scanner;
public class Excepcion {

public static void main (String[] args){
	Scanner entrada = new Scanner(System.in);
	Cuenta cliente = new Cuenta(); 
	boolean valido = false;

	do {
	System.out.println("Ingresa un numero entre 1 y 12 (Incluyendo ambos numeros)");
	int valor = entrada.nextInt();
	try {
		cliente.ponerMes(valor);       // si el objetoo cliente lanza una excepcion va directo al catch y no hace este resto
		System.out.println("El valor de mes ingresado fue");
		System.out.println(cliente.obtenerMes());
		System.out.println("El cual cumple con los requermiento");
		valido=true;  // solo si todo marcha bien y no se entra al catch la bandera valido se pone en true y asi no se sigue en el loop
		}
	catch (IllegalArgumentException e) {
		System.out.printf("El fallo fue por %s", e.getMessage());   // Muestra el mensaje de error, desde aca se podrá tratar el error?
		}
	} while (!valido);
}

}