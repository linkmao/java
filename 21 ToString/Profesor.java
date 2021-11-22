// NACIMIENTO: 29 octubre
// OBJETIVO :  Mostrar coomo se usa el metodo toString() el cual arroja la representacion en texto de cualquier objeto
/*DESCRIPCION: Esta clase profesor tiene dos constructores, uno con parametros y ootro vacio, ademas se defnen todos los metodos accesores y mutadores
// necesarios para la manipulacion de las variables de instancia, pero lo principal es la definicion del metodo toString, el cual devuelve
un string del objeto, que no es mas que devolver ls valores de las variables de instancia del objeto. Ver la prueba de esta clase en PruebaProfesor
*/


public class Profesor
{
private String primerNombre;
private String segundoNombre;
private String primerApellido;
private String segundoApellido;
private int edad;
private int telefono;


// metodo constructor cin argumentos
public Profesor(String pN ,String sN, String pA, String sA, int age, int tel){
	primerNombre=pN;
	segundoNombre=sN;
	primerApellido=pA;
	segundoApellido=sA;
	edad=age;
	telefono=tel;
}

// Metodo constructor vacio
public Profesor(){
}

// Metodos modificadores  o mutadores
public void setPrimerNombre(String pN){
	primerNombre=pN;
}
public void setSegundoNombre(String sN){
	segundoNombre=sN;
}
public void setPrimerApellido(String pA){
	primerApellido=pA;
}
public void setSegundoApellido(String sA){
	segundoApellido=sA;
}
public void setEdad(int ed){
	edad=ed;
}
public void setTelefono(int tel){
	telefono = tel;
}


// metodos accesores
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
public int getTelefono(){
	return telefono;
}


// metodo toString()
public String toString(){
	return String.format("Representacion STRING del objeto profesor\nPrimer Nombre: %s\nSegundo nombre: %s\nPrimer apellido: %s\nSegundo apellido: %s\nEdad: %d años\nNumero de telefono: %d\n\n", primerNombre,segundoNombre,primerApellido,segundoApellido,edad,telefono);
}









}