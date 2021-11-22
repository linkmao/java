// NACIMIENTO: 29 octubre
// OBJETIVO :  Mostrar coomo se usa el metodo toString() el cual arroja la representacion en texto de cualquier objeto
/*DESCRIPCION: en esta clase se pome a prieba la clase Profesor, se crean 3 objetos , se incializan dos de elllos con el constructor que recibe
// parametros, y se crea un tercero con un constructor vacio
// Se hace uso del metodo toString() del objeto con tan solo imprimir el objeto
*/

import java.util.Scanner;
public class PruebaProfesor{
	public static void main (String[] args){
		Profesor persona1=new Profesor("Mauricio", "", "Rua", "Florez", 40, 2813870);
		Profesor persona2=new Profesor("Diego", "Armando", "Rua", "Florez", 35, 3112312);
		Profesor persona3=new Profesor();
		System.out.print(persona1);  // Esto permite imprimir el metodo toString del objeto persona1, de la clase Profesor
		System.out.print(persona2);
		System.out.print(persona3);
		
	}
}