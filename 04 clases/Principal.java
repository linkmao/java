// NACIMEINTO: 20 Junio 2019
// OBJETIVO: Crear una clase principal y una clase secundaria, ademas crear un objeto de esa clase secundaria
/* DESCRIPCIÖN: Este es uno de esos ejemplo que permite ver como crear nuevas clases y usarse entre si.  Esta clase principal
lo unico que hace es llamar el metodo main para inicial la ejecucion del programa
Tambien de crear un objeto de la clase Imprinir y utilizar uno de los metodos alla definidos
*/

public class Principal
{
	public static void main (String[] args)
	{
		Imprimir objeto = new Imprimir();  // instancia una variable llamada objeto con un objeto de la clase Imprimir
		objeto.muestraMensaje();			// Se llama el metodo muestraMensaje() de objeto que se declaró tipo Imprimir
	}
}