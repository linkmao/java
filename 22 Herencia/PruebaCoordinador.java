// NACIMIENTO: 03 noviembre 2019
// OBJETIVO :  Mostrar el uso de la clase coordinador
/*DESCRIPCION: en esta clase se pome a prieba la clase Profesor, se crean 3 objetos , se incializan dos de elllos con el constructor que recibe
// parametros, y se crea un tercero con un constructor vacio
// Se hace uso del metodo toString() del objeto con tan solo imprimir el objeto
*/


public class PruebaCoordinador{
	public static void main (String[] args){
		Coordinador persona1=new Coordinador("Mauricio", "", "Rua", "Florez", 40, 2813870,200000,15,200000);
		Coordinador persona2=new Coordinador("Diego", "Armando", "Rua", "Florez", 35, 3112312,100000,10,100000);
		Coordinador persona3=new Coordinador();
		System.out.print(persona1);  // Esto permite imprimir el metodo toString del objeto persona1, de la clase coordiandor
		System.out.print(persona2);
		System.out.print(persona3);
		
		// muestra el salario de los coordinadores usando el metodo salario de la clase coordinadortttt
		System.out.print("\n\nSalario de cada Coordinador\n");
		System.out.printf("Coordinador 1: %d\nCoordinador 2: %d\nCoordinador 3: %d\n",persona1.salario(),persona2.salario(),persona3.salario());

			}
}