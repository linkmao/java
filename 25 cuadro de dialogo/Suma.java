// Nacimiento 05 de diciembre de 2019
// Objetivo: Ver las funcionalidades basicas de un cuadro de mensaje
// Descripccion: Se hace uso de la clase JOptionPane para obtener cuadros de mensajes sencillos


import javax.swing.JOptionPane;


public class Suma {

	public static void main (String[] args){
		String numero1= JOptionPane.showInputDialog("Introduzca el primer  numero entero");
		String numero2= JOptionPane.showInputDialog("Introduzca el segundo numero entero");
		int valor1=Integer.parseInt(numero1);
		int valor2=Integer.parseInt(numero2);
		int suma=valor1+valor2;
		JOptionPane.showMessageDialog(null,"la suma de los numeros es: "+ suma, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);




	}

}

