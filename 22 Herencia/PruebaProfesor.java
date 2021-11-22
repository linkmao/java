// NACIMIENTO: 03 noviembre 2019
// OBJETIVO :  Mostrar el uso de la clase Profesor y de su metodo toString()
/*DESCRIPCION: en esta clase se pome a prieba la clase Profesor, se crean 3 objetos , se incializan dos de elllos con el constructor que recibe
// parametros, y se crea un tercero con un constructor vacio
// Se hace uso del metodo toString() del objeto con tan solo imprimir el objeto
*/


public class PruebaProfesor{
	public static void main (String[] args){
		Profesor persona1=new Profesor("Mauricio", "", "Rua", "Florez", 40, 2813870,200000,15);
		Profesor persona2=new Profesor("Diego", "Armando", "Rua", "Florez", 35, 3112312,100000,10);
		Profesor persona3=new Profesor();
		System.out.print(persona1);  // Esto permite imprimir el metodo toString del objeto persona1, de la clase Profesor
		System.out.print(persona2);
		System.out.print(persona3);
		
		System.out.print("Salario de cada docente\n");
		System.out.printf("Profesor 1: %d\nProfesor 2: %d\nProfesor3: %d\n",persona1.salario(),persona2.salario(),persona3.salario()); // SE hace uso del metodo salario, el cual es public para ver el salaro de profesor

			}
}