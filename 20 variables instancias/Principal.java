// NACIMIENTO: 24 octubre 2019
// OBJETIVO :  Mostrar la diferencia de acceso entre variables de instancia publicas y privadas
//			:  
/*DESCRIPCION:  En este programa se definen dos objetos del tipo objeto y se accederan a sus variables de instancia, uan de ellas privada
y otra publica, para la variable privada es OBLIGATORIO usar los metodos definidos en la clase para acceder a las variables de instancia
sin embargo para la privada esto es opcional y se podria acceder por medio de la sentenca o1.varPublica o  o2.varPublica, esto no es muy 
recomendado, ademas por que se espera que con el uso de metodos de acceso para las variables privadas, estos metodos esten especializados para
evitar que el usuario introduzca errores indeseables, o para devolver el exito o fracaso de algun proceso
*/

public class Principal {
	public static void main (String[] args){
		Objeto o1 = new Objeto();
		Objeto o2 = new Objeto ();

		o1.putVariablePrivada(11); //  Solo se puede acceder a la variable privada usadndo metodos
		// o1.varPrivada = 11   este codigo no funcionaria, no es posible acceder a lo privado asi
		o1.putVariablePublica(12); /* se lleva el 12 a una variable publica mediante un metodo, ESTO ES OPCIONAL ya que al ser publica
		podria haberse usado  o1.varPublica=12;*/
		o2.putVariablePrivada(21); //  Solo se puede acceder a la variable privada usadndo metodos
		o2.varPublica=22; // Notese como no se usa metodo por ser publica (No recomendado,)
		System.out.println("ACCEDIENDO A LOS DATOS DE O1");
		System.out.printf("Variable privada %d\n",o1.getVariablePrivada());
		System.out.printf("Variable publica %d\n\n",o1.getVariablePublica()); // podria haber usado o1.varPublica

		System.out.println("ACCEDIENDO A LOS DATOS DE O2");
		System.out.printf("Variable privada %d\n",o2.getVariablePrivada()); 
		System.out.printf("Variable publica %d\n",o2.varPublica);
	}


}