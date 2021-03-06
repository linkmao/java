// NACIMIENTO: 16 octubre 2019
// OBJETIVO :  Mostrar cual es el uso simple de this
/* DESCRIPCION: El uso de this sencillo sirve para para identificar a que variable se hace referencia, en este ejemplo las variables 
de instancia edad, salario y nombre que son propias de la clase UsoThis y que se pueden confundir con edad, salario y nombre de los
metodos abajo utilizado*/

public class UsoThis {
	// Declaracion de variables de instancia de la clase UsoThis
  private int edad;
  private int salario;
  private String nombre;

// como se muestra a continuacion elmetodo asignarEdad tiene un parametro con el nombre igual al de la variable de instancia (lo normal es usar
  //nombres difernetes) asi que para saber que se habla de edad de la clase, es decir de la arriba declarada, se usa entonces this
public void asignarEdad(int edad){
    this.edad=edad;  
}
public void asignarSalario(int salario){
	this.salario=salario;
}
public void asignarNombre(String nombre){
	this.nombre=nombre;
}

public int obtenerEdad() {
    return edad;
}

public int obtenerSalario(){
	return salario;
}

public String obtenerNombre() {
	return nombre;
}



}
