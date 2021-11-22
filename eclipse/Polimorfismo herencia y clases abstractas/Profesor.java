
public class Profesor implements CentroDeCosto{
private String correo;
private String asignatura;
private double salarioHora;
private int horas;

// Metodos constructores
public Profesor (String email, String materia, double salarioPorHora, int horaT) {
setCorreo(email);
setAsignatura(materia);
setSalarioHora(salarioPorHora);
setHoras(horaT);
}

public Profesor() {
}

//Metodos mutadores
public void setCorreo(String email) {
	correo=email;
}

public void setAsignatura(String materia) {
	asignatura=materia;
}

public void setSalarioHora(double salarioxHora) {
	salarioHora=salarioxHora;
}


public void setHoras(int horaT) {
	horas=horaT;
}

// Metdodos accesorres
public String getCorreo() {
	return correo;
}

public String getAsignatura() {
	return asignatura;
}

public double getSalarioHora() {
	return salarioHora;
}

public int getHoras() {
	return horas;
}

@Override
public double costo() {
	return getSalarioHora()*getHoras();
	}

@Override
public String toString() {
	return String.format("Correo electronico: %s\nAsignatura: %s\nSalario por hora: %.2f\nHoras trabajadas: %d",getCorreo(),getAsignatura(),getSalarioHora(),getHoras());
	
}

// Para la implementacion de la interfaz, me pide que declare estos dos metodos
@Override
public double area() {
return 0;
}

@Override
public double perimetro() {
return 0;
}




}
