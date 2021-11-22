// NACIMIENTO: 27 JULIO 2019
// OBJETIVO :  Mostrar uno de los usos del objeto random
//			:  Ussar iteraciones con for
//			:  mostrar un buen uso del metodo printf
//			:  Uso de constantes
// 			:  Uso de enumeraciones
// DESCRIPCION: Este es un juego con numeros aleatorios qu


import java.util.Scanner;

public class Frecuencias{
	public static void main(String[] args){
		Scanner entrada=new Scanner(System.in);
		System.out.println("ANALISIS DE LA DISTRIBUCION DE FRECUENCIA SUMA VALORES DE DOS DADOS");
		System.out.println("CUANTOS LANZAMIENTOS DESEA HACER?");
		int cantidad = entrada.nextInt();
		int suma=0; int s2=0;int s3=0;int s4=0;int s5=0;int s6=0;int s7=0;int s8=0;int s9=0;int s10=0;int s11=0;int s12=0;
		for (int i=1;i<=cantidad;i++){
			suma=Craps.tirarDados();
			switch (suma){
				case 2:s2++;break;
				case 3:s3++;break;
				case 4:s4++;break;
				case 5:s5++;break;
				case 6:s6++;break;
				case 7:s7++;break;
				case 8:s8++;break;
				case 9:s9++;break;
				case 10:s10++;break;
				case 11:s11++;break;
				case 12:s12++;break;
			}
		}
			System.out.println("\nREPORTE DE FRECUENCIAS DE LA SUMA DE LOS DADOS");
			System.out.printf("Suma\tCantidad\tPorcentaje\n");
			System.out.printf("2\t%d\t\t%.2f%%\n",s2,((float)s2/cantidad)*100);
			System.out.printf("3\t%d\t\t%.2f%%\n",s3,((float)s3/cantidad)*100);
			System.out.printf("4\t%d\t\t%.2f%%\n",s4,((float)s4/cantidad)*100);
			System.out.printf("5\t%d\t\t%.2f%%\n",s5,((float)s5/cantidad)*100);
			System.out.printf("6\t%d\t\t%.2f%%\n",s6,((float)s6/cantidad)*100);
			System.out.printf("7\t%d\t\t%.2f%%\n",s7,((float)s7/cantidad)*100);
			System.out.printf("8\t%d\t\t%.2f%%\n",s8,((float)s8/cantidad)*100);
			System.out.printf("9\t%d\t\t%.2f%%\n",s9,((float)s9/cantidad)*100);
			System.out.printf("10\t%d\t\t%.2f%%\n",s10,((float)s10/cantidad)*100);
			System.out.printf("11\t%d\t\t%.2f%%\n",s11,((float)s11/cantidad)*100);
			System.out.printf("12\t%d\t\t%.2f%%\n",s12,((float)s12/cantidad)*100);
	}
}