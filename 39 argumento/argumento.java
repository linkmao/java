// Nacimiento: 19 de enero de 2021
// Objetivo: Mostrar la manera de usar los argumentos desde la linea de comando

public class argumento {
	public static void main(String[] args){
		String nombre = args[0];
		String apellido = args[1];
		System.out.printf("Bienvenido %s %s", nombre, apellido);
	}
}