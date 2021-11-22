// NACIMIENTO: 03 de noviembre de 2019
// OBJETIVO :  Mostrar los conceptos de polimorfismo
/*DESCRIPCION: Esta clase viene directamente del ejemplo de Herencia, no se le hace ningun cambio con respeto a lo que está en el ejemplo original
*/


public class Coordinador extends Profesor {
private int adicional;

// Constructor de coordinador
public Coordinador (String pNombre, String sNombre,String pApellido, String sApellido, int edad,int tel, int salario, int dias, int adic){
	super(pNombre,sNombre,pApellido,sApellido,edad,tel,salario,dias); // de esta manera se usa el constructor de la super clase profesor
	adicional=adic; // y se inicializa la variable de inatancia propia de esta clase
}

// Constructor vacio de coordinador, esto hace que se inicialicen por defecto las variables de instancia tando de profesor como la de coordinador
public Coordinador(){
}

//Declaracion de metodos accesores y mutadores propios de coordinador
public void setAdicional(int adi){
	adicional=adi;
}
public int getAdicional(){
	return adicional;
}

// Sobrescrtura del metodo salario, @Override se usa para garantizar que si se sobreescriba el metodo salario de profesor, si no 
// se usa @Override, se corre el riesgo de definir aca un metodo que no sobrescriba el de la super clase, ya que usandolo, por obligacion
// este metodo debe tener la misma firma que el metodo de la super clase, si no no compila
@Override
public int salario(){
	return super.salario()+getAdicional();    // al usar super.salario() se esta usando el metodo salario de la superclase
}

@Override
public String toString(){
	return String.format("%s\nValor adicional por coordinador: %d\n", super.toString(),getAdicional());  //al usar super.toSstring() se esta usando el metodo toString() de la sueprclase
}



}