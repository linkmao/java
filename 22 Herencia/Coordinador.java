// NACIMIENTO: 03 de noviembre de 2019
// OBJETIVO :  Mostrar el concepto de herencia y como este permite ahorrar tiempo en la programacion
/*DESCRIPCION: Se creará a clase coordinador, la cual heredara, los metodos y los campos (variables de instancia) de la clase profesor
pues un COORDINADOR ES UN PROFESOR, por lo tanto profesor es la superclase y coordinador es la subclase.

El coordinador tiene todos los metodos  variables de instancia de profesor, pero se adicionara la variable de instancia adicional, 
que permite guardar el valor adicional que gana un coordinador, ademas se crean los metodos accesores y mutadores para esa variable de 
instancia.

Como los constructores no se heredan pero si se pueden utilizar entonces por obligacion se debe crear el constructor para coordinador
pero se usa la palabra clave super para incializar las variables de instancia que son heredadas de profesor, y por aparte se inicializa
la variable de intancia definida en esta clase (adicional)

se sobrescriben los metodos salario y toString(), el primero de ellos se debe sobrescribir pues el calculo del salario del cordinador es
diferente al del profesor, y se sobrescribe tString() pues se debe adicionar la informacion de texto de la variable de instancia aca creada
en todos los casos para acceder a los valores de las variables de instancia private de la clase profesor, por medio de los metodo publicos alla definidos
*/


public class Coordinador extends Profesor {
private int adicional;   //Guardara el valor adicional que gana un coordinador

// Constructor de coordinador
public Coordinador (String pNombre, String sNombre,String pApellido, String sApellido, int edad,int tel, int salario, int dias, int adic){
	super(pNombre,sNombre,pApellido,sApellido,edad,tel,salario,dias); // de esta manera se usa el constructor de la super clase profesor
	adicional=adic; // y se inicializa la variable de inatancia propia de esta clase
}

// Constructor vacio de coordinador, esto hace que se inicialicen por defecto las variables de instancia tanto de profesor como la de coordinador
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