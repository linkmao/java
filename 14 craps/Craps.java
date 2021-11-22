// NACIMIENTO: 27 JULIO 2019
// OBJETIVO :  Mostrar uno de los usos del objeto random
//			:  Ussar iteraciones con for
//			:  mostrar un buen uso del metodo printf
//			:  Uso de constantes
// 			:  Uso de enumeraciones
// DESCRIPCION: Este es un juego con numeros aleatorios que se toma exactamente del capitulo 6.8 del libro
/* el juego consiste en tirar dos dados,
 -si la suma es 7 u 11 en el primer tiro el jugador gana
 -si la suma es 2, 3 o 12 en el primer tiro esto es un Craps, el jugador puierde
 -si la suma es 4, 5 , 6 , 8 9 o 10 en el primer tiro, esta suma se convierte en el punto del jugador, para ganar el jugador, deberá lanzar de 
 - nuevo hasta que salga de nuevo el los puntos del primer lanzamiento, si en el camino cae 7 el jugador pierde*/

import java.util.Random;
public class Craps{
	private static final Random numero = new Random();
	private enum Estado { CONTINUA, GANO, PERDIO};
	private static final int DOS=2; 
	private static final int TRES=3;
	private static final int SIETE=7;
	private static final int ONCE=11;
	private static final int DOCE=12;

	public static void main(String[] args){
		int miPunto=0; // punto si no gana o pierde en el primer tiro
		Estado estadoJuego; // puede contener alguno de los tres estados 
		int sumaDeDados = tirarDados(); // primer lanzamiento de los dados
		switch (sumaDeDados){
			case SIETE:
			case ONCE:
				estadoJuego=Estado.GANO;
				break;
			case DOS:
			case TRES:
			case DOCE:
				estadoJuego=Estado.PERDIO;
				break;
			default:
				estadoJuego=Estado.CONTINUA;
				miPunto=sumaDeDados;
				System.out.printf("El punto es %d\n", miPunto);
				break;
		}

		while (estadoJuego==Estado.CONTINUA){
			sumaDeDados=tirarDados();
			if (sumaDeDados==miPunto)
				estadoJuego=Estado.GANO;
			else
				if(sumaDeDados==SIETE)
					estadoJuego=Estado.PERDIO;
		}

		if (estadoJuego==Estado.GANO)
			System.out.println("El jugador gana");
		else
			System.out.println("El jugador pierde");

	}

	public static int tirarDados(){
		int dado1=1+numero.nextInt(6);
		int dado2=1+numero.nextInt(6);
		int suma=dado1+dado2;
		System.out.printf("El jugador tiro %d + %d = %d\n",dado1,dado2, suma);
		return suma;
	}




}

