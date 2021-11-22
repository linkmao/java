// NACIMIENTO: 26 JULIO 2019
// OBJETIVO :  Mostrar como llamar un metodo que está en otra clase
// DESCRIPCION: Esta clase lo que hace es hacer uso de los metodos definido en la clase Metodos, los metodos suma resta multiplica y divide
// definidos en Metodos se han declarado static por eso no es necesario intanciar objetos


import java.util.Scanner;
public class Llamado{
public static void main(String[] args){
Scanner entrada = new Scanner(System.in);
System.out.println("Calculadora usando metodos de la clase Metodos\n");
System.out.println("Escribe el primer numero");
int num1=entrada.nextInt();
System.out.println("Escribe el segundo numero");
int num2=entrada.nextInt();
System.out.println("RESULTADOS\n\n");
System.out.printf("Resultado de la suma %d\n",Metodos.suma(num1,num2)); //Notese como se usa el nombre de la clase y el nombre del metodo, no es necesario intanciar un objeto de la clase pues se ha definido en la clase Metodo como static
System.out.printf("Resultado de la resta %d\n",Metodos.resta(num1,num2));
System.out.printf("Resultado de la multiplicacion %d\n",Metodos.multiplica(num1,num2));
System.out.printf("Resultado de la division %.3f",Metodos.divide(num1,num2));
}
}