// NACIMIENTO: 21 JULIO 2019
// OBJETIVO :  Crear una aplicación que vaya tomando los numeros introducidos, y que arroje: cantidad sumatoria y primedio
// DESCRIPCION: En esta aplicacion que diseñaré sin  muestra alguna con el objetivo de afianzar los elementos ya estudiados pretendo g
// Usar elementos de entrada en el teclado y elementos de decision y repeticion en caso de ser necesario
import java.util.Scanner;

public class calculos {

public static void main (String [] args){
	Scanner entrada = new Scanner (System.in);
	int numero;  
	int contador=0;  // se debe incializar pues al ser un contador requiere un valor inicial
	int suma=0;      // se debe incializar pues al ser un contador requiere un valor inicial
	float promedio;  
	System.out.println("Introduce un valor entero. Digite -1 para terminar\n");
	numero=entrada.nextInt();
		while (numero !=-1){
			suma+=numero;
			contador++;
			System.out.println("Introduce un valor entero. Digite -1 para terminar\n");
			numero=entrada.nextInt();
		}
	promedio= (float)suma/contador;	  // necesito hacer el cast para garantizar que se obtenga un valor con decimales
	System.out.println("\n\nRESULTADOS:");
	System.out.printf("\nCantidad de elementos introducidos: %d", contador);
	System.out.printf("\nsumatoria de los elemementos introducidos: %d", suma);
	System.out.printf("\npromedio de los valores introducidos: %.2f", promedio);


	}




}
