// NACIMIENTO: 24 octubre 2019
// OBJETIVO :  Mostrar la diferencia de acceso entre variables de instancia publicas y privadas
//			:  
/*DESCRIPCION:  En esta clase se definen dos variables de instancia, una public y otra privada, para acceder a la privada por oblogacion
el objeto que se declare de esta clase, debe utilizar los metodos de acceso definido, en cambio para acceder a la variable de instancia
publica solo lo hace a partir de la sintaxis objetodefinido.variable, es decir no requiere del uso de metodos, por supuesto la recomendacion es
en lo posible siempre usar metodos para la manipulacion de las variables de instancia que en lo posible deben ser private

*/


public class Objeto{
public int varPublica;
private int varPrivada;

public void putVariablePrivada(int valor) { // Permite asignar valor a la variable privada, solo con este metodo es posible
	varPrivada=valor;
// Las variables de acceso y mutadores ( asi como este que muta, es decir que cambia el valor) deben ademas de implementarse de
// la forma simple como se acaba de haceer, controlar los valores que recibe, y evitar que el usuario introdzaca valores no valods
// es decir se debe aprovechar estos metodos para especializar el programa, esta es una ventaja de acceder a las variables de isntancia por medio de metodos 
}

public int getVariablePrivada(){ // Permite obtener el valor de la variable privada, solo con este metodo es posible
	return varPrivada;
}

public void putVariablePublica(int valor) { // Se podria utiizar este metodo para acceder a la variable publica, pero tambien se puede hacer con el formato objeto.variable (ver codigo en Objeto)
	varPublica=valor;
}

public int getVariablePublica(){ // Se podria utiizar este metodo para acceder a la variable publica, pero tambien se puede hacer con el formato objeto.variable (ver codigo en Objeto)
	return varPublica;
}


}