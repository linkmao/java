
/**
 * Clase abstracta que permitirá ser extendida en otro tipo de figuras bidimensionales
 * @author maolink
 */
public abstract class FiguraBidimensional implements CentroDeCosto{ // Se implementa la interfaz CentroDeCosto
private String nombre;
private int id;

//Metodo constructor
/**
 * Metodo constuctor de instancias de FigurasBidimensionales
 * @param name Nombre que se le asignara a la figura
 * @param identificador NUmero que permitira identificar la figura
 */
public FiguraBidimensional(String name, int identificador) {
	setNombre(name);
	setId(identificador);
}

// Metodo constructor vacio por defecto
public FiguraBidimensional() {
	}

/**
 * Metodo abstracto, se implementará en las subclases concretas que deriven de la clase FiguraBidimensional
 * @return int - Valor del area de la figura
 */
public abstract double area();
/**
 * Metodo abstracto, se implementará en las subclases concretas que derive de la clase FiguraBidimensional
 * @return int - Valor del perimetro de la figura
 */
public abstract double perimetro();

// Metodos mutadores
/**
 * Metodo que perite asignar el nombre a la  figura
 * @param nombrefigura Nombre que se le asignara a la figura
 */
public void setNombre(String nombrefigura) {
	nombre=nombrefigura;
}

/**
 * Metodo que permite asignar un numero identificador entre 0 y 100
 * @param identificador Valor entero entre 1 y 99, incluyendolos 
 */
public void setId(int identificador) {
	if (identificador>0 && identificador <100) {
		id=identificador;
		}
		else {
		throw new IllegalArgumentException("El id de la figura debe estar entre 0 y 99");
		}
}

// Metodos accesores
/**
 * Metodo para obtener el nombre de la figura
 * @return String - Nombre de la figura
 */
public String getNombre() {
	return nombre;	
}

/**
 * Metodo para obtener el numero de identificacion de la figura
 * @return int - Numero de id de la figura (entre 1 y 99)
 */
public int getId() {
	return id;
}


@Override
/**
 * Metodo para obtener la descripcion de los objetos
 */
 public String toString() {
return String.format("%s\nIdentificador: %d",getNombre(),getId());		
}

// No se implementa el metodo costo de la interfaz CentroDeCosto, sin embargo ese contrato adquirido se debe validar en las subclases


}
