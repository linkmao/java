// NACIMIENTO: 26 JULIO 2019
// OBJETIVO :  Mostrar el uso de un metodo llamado desde esta clase y llamado desde una clase externa
//          :  Mostrar el uso de la conversion explicita de datos
// DESCRIPCION: Este programa pretende mostarr como usar metodos dentro de una misma clase, y ademas mostraremos como desde otra clase
// diferente a esta, llamará  a los metodos acá definidos

import java.util.Scanner;

public class Metodos {

public static void main (String[] args){
Scanner entrada = new Scanner(System.in);	
System.out.println("ESTA ES UNA PEQUEÑA CALCULADORA QUE SUMA, RESTA, MULTIPLICA Y DIVIDE DOS NUMEROS\n\n\n");
System.out.println("Escribe el primer numero");
int num1=entrada.nextInt();
System.out.println("\nEscribe el segundo numero");
int num2=entrada.nextInt();
System.out.println("RESULTADOS\n");
System.out.printf("RESULTADOS LA SUMA %d\n", suma(num1,num2));    // se llama suma() sin la necesidad de anteponerle el nombre de la clase pues ese metodo esta definido en esta clase, asi para los demas metodos
System.out.printf("RESULTADOS LA RESTA %d\n", resta(num1,num2));
System.out.printf("RESULTADOS LA MULTIPLICACION %d\n", multiplica(num1,num2));
System.out.printf("RESULTADOS LA DIVISION %.3f\n", divide(num1,num2));
}

public static int suma(int a, int b){ // se declara, publico para que pueda accederse desde una clase externa, static para que no haya necesidad de intanciar un objeto para su uso
	return a + b;
}

public static int multiplica(int a, int b){
	return a*b;
}

public static int resta(int a, int b){
	return a-b;
}

public static float divide(int a, int b){
	return (float)a/b;   
}
/* como la division entre enteros da entero, y en este caso queremos el resultado flotante se debe entonces hacer la division entre flotantes
para ello hacemos lo siguiente. Hacemos la conversion EXPLICITA de a como float con (float)a (en realidad a sigue siendo int, si no que se crea
una copia de a que es float y esa se usa), como ya hay una copia de a de tipo float, java convierte IMPLICITAMENTE b tambien a float, ya que
java solo opera con datos del mismo tipo */
}


