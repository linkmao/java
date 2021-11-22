// NACIMIENTO: 14 octubre 2019
// OBJETIVO :  Mostrar como en un mismo archivo de texto se pueden crear dos o mas clases
// DESCRIPCION: En este ejemplo lo que se hace es que usando un mismo archivo de texto se crea en el la clase principaly, y para no usar
// otro archivo se define aca mismo la clase secundaria, esta segunda clase no puede ser publis ese es el impedimento de hacerlo aca
// sin embargo todo funciona dentro de lo esperado, al compilarse la clase principal, se compila por aparte y se genera un archivo class de la
// clase secundaria
// Pues en realidad auqnue puede ser util, me parece que se lleva mas control al tener las clases separadas

import java.util.Scanner;
public class Principal{
public static void main (String[] args){
   Secundaria objeto = new Secundaria();       // se declara el objeto de la clase secundara
   Scanner entrada= new Scanner (System.in);   // se declara el objeto para laentrada de datos
   System.out.println("Escribe un primer texto\n");   
   String texto1=entrada.nextLine();                 
   System.out.println("Escribe un segundo texto\n");
   String texto2=entrada.nextLine();
   String textofinal = objeto.union(texto1,texto2);     // se lleva  a la variable textofinal el uso del metodo union de la clase secundria
   System.out.println(textofinal);
  }
}

class Secundaria{  // al utilizar esta clase en este mismo archivo no se puede declarar publicc, se deja asi
 public String union(String t1, String t2){
 	System.out.printf("La union del texto %s con el texto %s, corresponde a \n", t1,t2);
 	return t1 + t2;
 }


}