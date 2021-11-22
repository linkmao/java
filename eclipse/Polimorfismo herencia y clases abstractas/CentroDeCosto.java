/*Definicion de una interfaz llamada CentroDeCosto la cual definirá un metodo que se aplicará a dos clases absolutaente
 * diferentes como la clase FigiraBidimensional y la clase Profesor. El contexto que me he ideado para este ejemplo es que
 * las figiras bidimensionales tedran un costo en funcion de su perimetro y un valor por unidad de medida de ese perietro, ese valor
 * será definido por cada objeto, y por el lado del Profesor, este tendrá un costo por el servicio prestado.
 * Esta interfaz permite entocnes definir un mismo metodo abstracto  para dos clases que no estan relacionadas
 * 
 * 
 */
public interface CentroDeCosto {
	double costo();   // Definicion de metodo costo, el cual por estar en una interfaz por defecto es public y bastrac
	double area();
	double perimetro();

}



