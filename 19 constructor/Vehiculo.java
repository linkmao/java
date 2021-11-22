// NACIMIENTO: 19 octubre 2019
// OBJETIVO :  Mostrar el uso de constructor de un objeto
//			:  Mostrar como se usa this para la construccion de objetos
/*DESCRIPCION: con esta clase se quiere mostrar las diferentes maneras de usar  metodos constructores de la clase, entre ellos el uso
de this para inicializar las variables de instancia de una manera muy sencilla, ademas se declaran los metodos para poner y obtener los datos
de las variables de instancia
*/


public class Vehiculo{
 private int modelo;
 private String marca;
 private int color;
 private int kilometros;


 // Creacion de metodos constructores de obtejos de tipo vehiculo
 public Vehiculo (){ // Constructor por defecto, en este caso lo declaro, pero siempre Java Hace este constructor sin necesidad de declararlo
  modelo=0;
  marca="";
  color=0;
  kilometros=0;
  // Se inicializan las variables de instancia con valores por defecto en el caso de usar un constructor vacio
 }

 // Creacion de metodo constructor para el caso de que se envien los argumentos desde la creacion del objeto de la clase vehiculo
 public Vehiculo (int mod, String mar, int col, int kil){
 	modelo=mod;
 	marca= mar;
 	color=col;
 	kilometros=kil;
// Se inicializan varibles de instancia con los parametros que se envian desde la llamada del constructor
// Tambien se hubiese usado this (mod, mar, col, kil), pero eso se muestra en el siguiente metodo
 }

 // Creacion de metodo constructor para el caso de que se envien 3 argumentos y uso de this
public Vehiculo (int mod, String mar, int col){
 	this (mod, mar, col, 0);
// en este caso se inicializa el modelo, marca y color con los parametros, y se forza a que kilometro sea 0
}

// Creacion de metodo constructor para el caso de dos parametros e inicializacion de por defectos de las variables de instancia color y kilometros
//public Vehiculo (int mod, String mar){
//	this (mod, mar);
// RESULTA QUE POR OBLIGACION (ESO PARECE ) THIS DEBE INICIALIZAR LAS 4 VARIABLES DE INSTANCIA, NO SE PUEDE INCIALIZAR ALGUNAS Y DEJAR QUE JAVA INTENTE INCIALIZAR EL RESTO 
//}

// Metodos para obtener datos
public int getModelo(){
	return modelo;
}

public String getMarca(){
	return marca;
}

public int getColor(){
	return color;
}

public int getKilometros(){
	return kilometros;
}

// Metodos para cambiar las variables de instancia
public void setModelo(int mod){
	modelo=mod;
}

public void setMarca (String marca){
// en este caso se usará this solo por mostrar su uso
	this.marca=marca;  // this.marca se refiere a la variable de instancia de la clase
}

public void setColor (int col){
	color=col;
}

public void setKilometros(int kil){
	kilometros=kil;
}








}