// NACIMIENTO: 16 octubre 2019
// OBJETIVO :  Mostrar cual es el uso simple de this
// DESCRIPCION: En este ejemplo se muestra el uso de this para reconocer de cual variable hace referencia, lease el archivo UsoThis

import java.util.Scanner;

public class Principal {
	public static void main (String[] arg){
	Scanner entrada = new Scanner(System.in);
	int numero1;
	int numero2;
	String cadena;
	UsoThis objeto1 = new UsoThis();
	UsoThis objeto2 = new UsoThis();
	System.out.println("Inicializacion de las variables de instancia para objeto1 y objeto2\n");
	System.out.print("Digita en su orden nombre, edad  y salario para objeto 1");
	cadena=entrada.nextLine();
	numero1=entrada.nextInt();
	numero2=entrada.nextInt();
	objeto1.asignarEdad(numero1);
	objeto1.asignarSalario(numero2);
	objeto1.asignarNombre(cadena);
	System.out.println("SE HAN ASIGNADO VARIABLES DE INSTANCIA PARA OBJETO 1\n");
	
	System.out.print("Digita en su orden nombre, edad  y salario para objeto 2");
	entrada.nextLine();
	cadena=entrada.nextLine();
	numero1=entrada.nextInt();
	numero2=entrada.nextInt();
	objeto2.asignarEdad(numero1);
	objeto2.asignarSalario(numero2);
	objeto2.asignarNombre(cadena);
	System.out.println("SE HAN ASIGNADO VARIABLES DE INSTANCIA PARA OBJETO 2\n");

	System.out.println("VIZUALIZACION DE LOS DATOS \n Presiona 1 para objeto 1, 2 para objeto 2, 0 para terminar");

	numero1=entrada.nextInt();
	while (numero1!=0){
		if (numero1==1){
			System.out.printf("%s\n%s\t%s\t%s\n%d\t%d\t%s\n", "MOSTRANDO DATOS DEL OBJETO 1", "Edad", "Salario","Nombre", objeto1.obtenerEdad(), objeto1.obtenerSalario(), objeto1.obtenerNombre());
		} else if (numero1==2){
			System.out.printf("%s\n%s\t%s\t%s\n%d\t%d\t%s\n", "MOSTRANDO DATOS DEL OBJETO 2", "Edad", "Salario","Nombre", objeto2.obtenerEdad(), objeto2.obtenerSalario(), objeto2.obtenerNombre());
		} else{
		System.out.println("EL VALOR INGRESADO NO ES VALIDO");			
		}
	numero1=entrada.nextInt();
	}// Fin del while

}// Fin del main



} // fin de la clase
