

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;


public class Gestor {
	private Formatter archivo;
	
	public void abrirArchivo() {
		try{
			archivo=new Formatter("datos.txt");
			}
			catch (SecurityException sE){
				System.err.println("Archivo sin permiso");
				System.exit(1);
			}
			catch (FileNotFoundException fNE){
				System.err.println("Error a crear archivo");
				System.exit(1);	
			}
	}
	
	public void agregarRegistro(String pNombre, String sNombre, String pApellido, String sApellido, int edad, String id, int grado ) {
		archivo.format("%s %s %s %s %d %s %d", pNombre, sNombre, pApellido, sApellido, edad, id, grado);
	}
	
	public void cerraArchivo() {
		archivo.close();
	}
}
