// Nacimiento 30 diciembre 2019
// Objetivo: Mostrar el funcionamiento de File
/* Descripcion. 
*/

import java.io.File;

public class DemoFile {
	
	public void analizaRuta(String ruta){
	File nombre = new File(ruta);

	if (nombre.exists()){
	System.out.printf("Detalles de la ruta:\n%s%s\n%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s", nombre.getName(), " Existe",
		(nombre.isFile() ? "Es un archivo":"No es un archivo"),			
		(nombre.isDirectory() ? "Es un directorio" : "No es un directorio"),
		(nombre.isAbsolute()  ? "Es ruta abosluta": "Es ruta relativa"),
		nombre.lastModified(),
		"Tamaño: ", nombre.length(),
		"Ruta: ", nombre.getPath(),
		"Ruta absoluta: ", nombre.getAbsolutePath(),
		"Padre: ", nombre.getParent() 
	 	);// Fin Printf

		if (nombre.isDirectory()){
			String directorio[]=nombre.list();
			System.out.printf("\n\nELEMENTOS DEL DIRECTORIO");
			for (String nombreDirectorio :directorio)
				System.out.printf("\n%s", nombreDirectorio);
		}// Fin del if interno
	}// Fin del if  general
	else
		System.out.print("El nombre escrito no corresponde a ningun archivo o ruta identificable");

	} // Fin del metodo
} // Fin de la clase