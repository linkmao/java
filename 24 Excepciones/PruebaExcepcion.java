// Nacmiento  05 diciembre de 2019
// Objetivo: Mostrar los elementos basicos de las excepciones
/* Descripcion: En este programa se muestra el uso de la s excepciones, de esto quedan los siguinetes aprendizajes
- Se deben importar las clases de las excpeciones a capturar, ArithmeticExcepion no se importa pues esta en el paquete java.lan que se importa por defecto
- los bloqus try... catch...finally(opcional) deben se consecutivos
- El programa cuando genera una excepcion en el try sale de alli y busca el catch que lo maneje, de alli pasa a finally (si lo hay )  y
luego ejecuta la primera linea despues del ultimo catch o finally (si lo hay), es decir, java no regresa al punto que causa la excepcion
- El hecho anterior hace que por ejemplo para la toma de datos como en el de este ejemplo se deba usar el un ciclo do
- realmente en los catch no se busca que nuevamente se digiten los datos, es mas como para el manejo informativo
*/

import java.util.Scanner;
import java.util.InputMismatchException; // se debe importar 
public class PruebaExcepcion
	{
		public static void main (String[] args){
			boolean datosIncorrecto= true;
			do{
				try{
				Scanner entrada = new Scanner(System.in);
				System.out.println("EJEMPLO DE DIVISION CON MANEJO DE EXCEPCIONES");
				System.out.println("Digita el numerador");
				int numerador= entrada.nextInt();     // Se peude generar InputMismatchException
				System.out.println("Digita el denominador");
				int denominador= entrada.nextInt();   // Se peude generar InputMismatchException
				System.out.println("El resultado de la division es: "+ division(numerador,denominador)); // Se puede generar ArithmeticEception
				datosIncorrecto=false; // Si no se genera ninguna excepcion, el programa llegara hasta aca y permitira salir del do
				}
				catch(ArithmeticException aE){
					System.err.printf("Tipo de excepcion: %s\n", aE);
					System.out.printf("Se ha intentado dividir entre cero, por favor intente de nuevo (el denominador no puede ser cero) \n\n");
				}
				catch(InputMismatchException iME ){
					System.err.printf("Tipo de excepcion: %s\n", iME);
					System.out.printf("Se ha intentado ingresar un dato diferente a un numero entero, por favor intente de nuevo\n\n");	
				}
				finally{
					System.out.println("ESTE TEXTO ESTA EN EL BLOQUE FINALLY, ESTE BLOQUE SE EJECUTA YA SEA SI HAY EXCEPCION O NO LO HAY SE USA NORMALMENTE PARA LIBERAR RECUROSOS DE LA MEMORIA DEL SISTEMA");
				}
			} while (datosIncorrecto);// fin del do

		} // Fin del main

	
		private static int division(int a, int b) throws ArithmeticException{  // Analizar este throws pues parece que si ese tambien funciona
			return a/b;
		}

	} // Fin de la clase