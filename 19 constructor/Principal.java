// NACIMIENTO: 19 octubre 2019
// OBJETIVO :  Mostrar el uso de constructor de un objeto
//			:  Mostrar como se usa this para la construccion de objetos
/*DESCRIPCION:  Esta clase se apoya en la clase vehiculo, lo que se hace aca es crear 4 objetos de la clase vehiculos, innicialzados
de diferneetes maneras para usar asi los difernetes constructores definidos en la clase vehiculo    

*/

import java.util.Scanner;

public class Principal{
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	int entero;
	String cadena;
	int eleccion;
	// Inciaremos algunos objetos desde el codigo
	Vehiculo v1 = new Vehiculo();  // constructor por defecto
	Vehiculo v2 = new Vehiculo(2017, "Mazda", 2, 300);  // Constructor con parametros
	Vehiculo v3 = new Vehiculo(2000, "Renault", 3);  // Constructor con parametros
	Vehiculo v4 = new Vehiculo();  // constructor por defecto
	System.out.println("Inicializacion de el objeto v5 de la clase Vehiculo\nINGRESA AÑO DEL MODELO");
	entero=entrada.nextInt();
	v4.setModelo(entero);
	System.out.println("INGRESA MARCA DEL VEHICULO");
	entrada.nextLine(); // agotar bufer del scanner
	cadena=entrada.nextLine();
	v4.setMarca(cadena);
	System.out.println("INGRESA COLOR DEL VEHICULO (NUMERO ENTERO)");
	entero=entrada.nextInt();
	v4.setColor(entero);
	System.out.println("INGRESA KILOMETRAJE DEL VEHICULO");
	entero=entrada.nextInt();
	v4.setKilometros(entero);

System.out.println("INGRESA EL NUMERO DEL OBJETO QUE QUIERAS ANALIZAR DESDE 1 A 4, 0 PARA TERMINAR");
eleccion=entrada.nextInt();
while (eleccion != 0 ){
	switch (eleccion){
		case 1:
		imprimir(eleccion,v1.getModelo(),v1.getMarca(),v1.getColor(),v1.getKilometros());
		break;
		case 2:
		imprimir(eleccion, v2.getModelo(),v2.getMarca(),v2.getColor(),v2.getKilometros());
		break;
		case 3:
		imprimir(eleccion, v3.getModelo(),v3.getMarca(),v3.getColor(),v3.getKilometros());
		break;
		case 4:
		imprimir(eleccion, v4.getModelo(),v4.getMarca(),v4.getColor(),v4.getKilometros());
		break;
	}
	System.out.println("INGRESA EL NUMERO DEL OBJETO QUE QUIERAS ANALIZAR DESDE 1 A 4, 0 PARA TERMINAR");
	eleccion=entrada.nextInt();
}

} // Fin del main

private static void imprimir(int elec, int a, String b, int c, int d){
		System.out.printf("OBJETO %s\n%s\t%s\t%s\t%s\n%d\t%s\t%d\t%d\n\n",elec, "MODELO", "MARCA", "COLOR", "KILOMETRAJE", a, b, c, d);
}

} // fIn de la clase