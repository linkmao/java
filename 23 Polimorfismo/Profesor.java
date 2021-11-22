// NACIMIENTO: 09  Noviembre 2019
// OBJETIVO :  Mostrar elementos basicos de polimorfismo
/*DESCRIPCION: esta clase viene del ejemplo de herencia , no tiene ningu cambio alguno*/


public class Profesor
// Definicion de campos de la clase Profesor, todas ellas private es decir solo lo smetodos de esta clase pueden acceder a estos campos
// por lo tanto si un asub clase desea acceder a estos, lo debera hacer por medio de los metods public aca definidos
{
private String primerNombre;
private String segundoNombre;
private String primerApellido;
private String segundoApellido;
private int edad;
private int telefono;
private int salarioDia;
private int diasTrabajados;


// metodo constructor c0n argumentos, en este caso se inicializan los 8 campos
public Profesor(String pN ,String sN, String pA, String sA, int age, int tel, int sal, int dias){
	primerNombre=pN;
	segundoNombre=sN;
	primerApellido=pA;
	segundoApellido=sA;
	edad=age;
	telefono=tel;
	salarioDia=sal;
	diasTrabajados=dias;
}

// Metodo constructor vacio, inicializa todos los campos o variables de instancia con los valores pode defecto
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
public void setSalarioDia(int sal){
	salarioDia=sal;
}
public void setDiasTrabajados(int dias){
	diasTrabajados=dias;
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
public int getSalarioDia(){
	return salarioDia;
}
public int getDiasTrabajados(){
	return diasTrabajados;
}


// Metodo para obtener el total de salario
public int salario(){
	return getSalarioDia()*getDiasTrabajados(); // En esta linea se hubiese podido usar directamente las variables de instancia, pero es buena practica, usar los metodos accesores
}


// metodo toString(), De igual manera, se usan los metodos accesores para obtener los valores de las variables de instancia, auque el uso directo de las variables de isntancia hubiese sido suficiente
public String toString(){
	return String.format("Primer Nombre: %s\nSegundo nombre: %s\nPrimer apellido: %s\nSegundo apellido: %s\nEdad: %d años\nNumero de telefono: %d\nSalario por dia: %d\nDias trabajados: %d", getPrimerNombre(),getSegundoNombre(),getPrimerApellido(),getSegundoApellido(),getEdad(),getTelefono(),getSalarioDia(),getDiasTrabajados());
}


}