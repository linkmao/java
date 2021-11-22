// NACIMIENTO: 26 JULIO 2019
// OBJETIVO :  Mostrar uno de los usos del objeto random
//			:  Ussar iteraciones con for
//			:  mostrar un buen uso del metodo printf
// DESCRIPCION: Este ejempllo lo que hace es generar un nmero aleatorio entero entre 1 y 6, para ello se usa un objeto de la clase Random 
// (aunque se pudo utilizar la clase estatica Random de math, el objetoo random de util tiene mas posibilidades), la cantidad de numeros a 
// generar será elegida por el usuario, finalmente se llevará el conteo de cuantas veces a ha salido cada valor usando una sentencia switch
// para mostrar la frecuencia de aparicion de cada numero y el porcentaje de este

import java.util.Random;
import java.util.Scanner;
public class Aleatorio{
	public static void main(String[] args) {
		Random dado = new Random(); // creo el objeto de la clase Random
		Scanner entrada=new Scanner(System.in);
		int num; int n1=0; int n2=0; int n3=0; int n4=0; int n5=0; int n6=0; // declaro variables
		System.out.println("****Generador de numeros aleatorio****\nCuantos números aleatorios quiere crear?");
		int cantidad=entrada.nextInt();
			for(int i=1;i<=cantidad;i++){
				num=dado.nextInt(6)+1;
				System.out.printf("%d ", num);

			switch (num){
			case 1:
			n1++;
			break;
			case 2:
			n2++;
			break;
			case 3:
			n3++;
			break;
			case 4:
			n4++;
			break;
			case 5:
			n5++;
			break;
			case 6:
			n6++;
			break;
			}

			if (i%5==0){   // esto me permite que si se han impreso 5 valores, se genere una nueva linea de imresion
				System.out.println("");
			}

		}
		System.out.println("\nCara\tFrecuencia\tPorcentaje\n");
		System.out.printf("1\t%d\t\t%.2f%%\n2\t%d\t\t%.2f%%\n3\t%d\t\t%.2f%%\n4\t%d\t\t%.2f%%\n5\t%d\t\t%.2f%%\n6\t%d\t\t%.2f%%\n", n1, ((float)n1/cantidad)*100,n2, ((float)n2/cantidad)*100,n3, ((float)n3/cantidad)*100,n4, ((float)n4/cantidad)*100,n5, ((float)n5/cantidad)*100,n6, ((float)n6/cantidad)*100);
		


	}



}
