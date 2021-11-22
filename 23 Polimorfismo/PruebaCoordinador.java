// NACIMIENTO: 09 noviembre 2019
// OBJETIVO :  Mostrar el uso de la clase coordinador
/*DESCRIPCION: Esta implementacion viene desde el ejemplo original de herencia
*/


public class PruebaCoordinador{
	public static void main (String[] args){
		Coordinador persona1=new Coordinador("Mauricio", "", "Rua", "Florez", 40, 2813870,200000,15,200000);
		Coordinador persona2=new Coordinador("Diego", "Armando", "Rua", "Florez", 35, 3112312,100000,10,100000);
		Coordinador persona3=new Coordinador();
		System.out.printf("%s\n\n",persona1);  // Esto permite imprimir el metodo toString del objeto persona1, de la clase Profesor
		System.out.printf("%s\n\n",persona2);
		System.out.printf("%s\n\n",persona3);
		
		System.out.print("Salario de cada Coordinador\n");
		System.out.printf("Coordinador 1: %d\nCoordinador 2: %d\nCoordinador 3: %d\n",persona1.salario(),persona2.salario(),persona3.salario());

			}
}