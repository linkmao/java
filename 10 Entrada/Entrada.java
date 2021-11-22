// NACIMIENTO: 07 JULIO 2019
// OBJETIVO : Crear una aplicacion que haga uso de elementos graficos y que reciba datos
// DESCRIPCION: Se usa un cuadro de dialogo con una entrada de campo para escribir texto, ese texto luego se lleva a otra ventana

import javax.swing.JOptionPane;
public class Entrada
{
 public static void main(String[] args)
 {
   String texto=JOptionPane.showInputDialog("Bienvenido, escribe tu nombre por favor");

   // Modo de mostrar el texto 1
   JOptionPane.showMessageDialog(null, "Hola, "+texto+" Recuerda que te amo mucho y que miles de cosas buenas pasaran en tu vida \nTe Amo!!!!"); // Forma tradicioal de concatenar

   // Modo de mostrar el texto 2
   String mensage=String.format("Hola %s, bienvenido al mundo de la programacion\nAdelante!!! no te rindas", texto); // Uso de metodo estatico format
   JOptionPane.showMessageDialog(null, mensage);  
 }
}