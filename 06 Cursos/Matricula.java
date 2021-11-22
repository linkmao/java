import java.util.Scanner;

public class Matricula
{
	public static void main(String[] args)
	{
		GestionCurso informacion = new GestionCurso();
		System.out.println("La información inicial de los cursos corresponde a");
		imprimeInfo(informacion.getCurso(), informacion.getProfesor(), informacion.getEstudiantes());
		System.out.println("***INICIO DE LA NUEVA CONFIGURACION***"); 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el nuevo nombre del curso");
		String nuevoCurso = entrada.nextLine();
		System.out.println("Escribe el nuevo nombre del profesor");
		String nuevoProfesor = entrada.nextLine();
		System.out.println("Escribe la nueva cantidad de estudiantes");
		int nuevaCantidad = entrada.nextInt();
		informacion.putCurso(nuevoCurso);
		informacion.putProfesor(nuevoProfesor);
		informacion.putEstudiantes(nuevaCantidad);
		System.out.println("La nueva configuracion de matriculas es ahora");
		imprimeInfo(informacion.getCurso(), informacion.getProfesor(), informacion.getEstudiantes());
	}

	private static void imprimeInfo(String nombre, String profesor, int cantidad)
	{
		System.out.printf("NOMBRE DEL CURSO: %s\nNOMBRE DEL PROFESOR: %s\nCANTIDAD DE ESTUDIANTES: %S\n", nombre ,profesor, cantidad);
	}

	
}