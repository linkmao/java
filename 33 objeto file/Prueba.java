

import java.util.Scanner;
public class Prueba{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		DemoFile aplicacion = new DemoFile();
		System.out.print("Escriba la ruta que quiere analizar");
		aplicacion.analizaRuta(entrada.nextLine());
	}

}