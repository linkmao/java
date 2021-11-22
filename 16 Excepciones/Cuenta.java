
public class Cuenta {
	int mes;

public void ponerMes(int valor){
	if (valor>=1 && valor<=12)
	mes=valor;
	else
	throw new IllegalArgumentException("Este valor esta fuera del rango solicitado")	;
}

public int obtenerMes(){
   return mes;
}
}