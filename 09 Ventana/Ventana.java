// NACIMIENTO: 07 JULIO 2019
// OBJETIVO : Crear una aplicacion que haga uso de elementos graficos
// DESCRIPCION: Este programa muetsra un cuadro de dialogo, tambien con el se entiende como SIN LA NECESIDAD DE INSTANCIAR UN OBJETO, se
//             puede hacer uso de un metodo de una clase, esto es por que en la clase, dicho metodo se ha declarado static

import javax.swing.JOptionPane;  // Importa el paquete swing
public class Ventana
{
  public static void main(String[] args) 
  {
  	JOptionPane.showMessageDialog(null, "Hola mundo he despertado\nesta vez en una\nventana. jajajaj"); // Notese que se usa showMessageDialog sin la necesidad de crear un objeto JOptionPane
  }
}




