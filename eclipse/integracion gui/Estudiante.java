// Nacimiento 04 enero de 2010
// Objetivo: Integrar la interfaz grafica con una clase 
/* Descripcion. 
*/
public class Estudiante{
	// Definicion de variables de instancia
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private int edad;
	private String iD;
	private int grado;

	// Creacion de metodos constructores
	public Estudiante(){  // Constructor vacio
		this ("","","","",0,"",-1);
	}
	public Estudiante(String pN, String sN, String pA, String sA, int age, String documento, int gradoEscolar){
		setPrimerNombre(pN);
		setSegundoNombre(sN);
		setPrimerApellido(pA);
		setSegundoApellido(sA);
		setEdad(age);
		setID(documento);
		setGrado(gradoEscolar);
	}
	// Creacion de metodos accesores y mutadores
	//metodos mutadores
	public void setPrimerNombre(String firstName){
		primerNombre=firstName;
	}
	public void setSegundoNombre(String secondName){
		segundoNombre=secondName;
	}
	public void setPrimerApellido(String firstApellido){
		primerApellido=firstApellido;
	}
	public void setSegundoApellido(String secondApellido){
		segundoApellido=secondApellido;
	}
	public void setEdad(int anos){
		edad=anos;
	}
	public void setID(String numero){
		iD=numero;
	}
	public void setGrado(int anoEscolar){
		grado=anoEscolar;
	}

	// Creaciond de metodos accesores
	public String getPrimerNombre(){
		return primerNombre;
	}
	public String getSegundoNombre(){
		return segundoNombre;
	}
	public String getPrimerApellido(){
		return primerApellido;
	}
	public String getSegundoApellido(){
		return segundoApellido;
	}
	public int getEdad(){
		return edad;
	}
	public String getID(){
		return iD;
	}
	public int getGrado(){
		return grado;
	}

}// Fin de la clase