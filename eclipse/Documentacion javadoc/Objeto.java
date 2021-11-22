// NACIMIENTO: 24 octubre 2019
// OBJETIVO :  Mostrar la diferencia de acceso entre variables de instancia publicas y privadas


/**
En esta clase se definen dos variables de instancia, una public y otra privada, para acceder a la privada por oblogacion
el objeto que se declare de esta clase, debe utilizar los metodos de acceso definido, en cambio para acceder a la variable de instancia
publica solo lo hace a partir de la sintaxis objetodefinido.variable, es decir no requiere del uso de metodos, por supuesto la recomendacion es
en lo posible siempre usar metodos para la manipulacion de las variables de instancia que en lo posible deben ser private
@author maolink
*/
public class Objeto{
public int varPublica;
private int varPrivada;
/**
 * Permite asignar valor a la variable privada, solo con este metodo es posible
 * Las variables de acceso y mutadores ( asi como este que muta, es decir que cambia el valor) deben ademas de implementarse de
 * la forma simple como se acaba de haceer, controlar los valores que recibe, y evitar que el usuario introdzaca valores no valods
 * es decir se debe aprovechar estos metodos para especializar el programa, esta es una ventaja de acceder a las variables de isntancia por medio de metodos
 * @param valor - valor que se asignará a la variable de instancia privada de la clase
 */
public void putVariablePrivada(int valor) {
	varPrivada=valor;
 }
/**
 * Permite obtener el valor de la variable privada, solo con este metodo es posible
 * @return - Valor entero de la variable de instancia privada de la clase
 */
public int getVariablePrivada(){  
	return varPrivada;
}
/**
 * Se podria utiizar este metodo para acceder a la variable publica, pero tambien se puede hacer con el formato objeto.variable (ver codigo en Objeto)
 * @param valor - numero entero que se quiere asignar a la variable publica de la clase
 */
public void putVariablePublica(int valor) { // 
	varPublica=valor;
}
/**
 * Se podria utiizar este metodo para acceder a la variable publica, pero tambien se puede hacer con el formato objeto.variable (ver codigo en Objeto)
 * @return - Devuelve el valor de la variable de instancia publica de la clase
 */
public int getVariablePublica(){ // 
	return varPublica;
}

}