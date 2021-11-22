public class GestionCurso
{
	private String curso = "Sin nombre de curso";      // Declaracion de las tres variables de instancia (propiedad de los objetos que se declaren de esta clase)
	private String profesor= "Sin profesor"; 				// Se declaran con unos valores iniciales que serán modifiicados
	private int numeroEstudiantes = 0;

// Metodos para obtener las propiedades
	public String getCurso()
	{
		return curso;
	}
	public String getProfesor()
	{
		return profesor;
	}
	public int getEstudiantes()
	{
		return numeroEstudiantes;
	}


// Metodos para cambiar las propiedades
	public void putCurso(String nombreCurso)
	{
		curso=nombreCurso;
	}
	public void putProfesor(String nombreProfesor)
	{
		profesor=nombreProfesor;
	}
	public void putEstudiantes(int cantidadEst)
	{
	numeroEstudiantes=cantidadEst;
	}
}

