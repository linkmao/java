// NACIMIENTO: 10 AGOSTO
// OBJETIVO :  COmprender el paso de vectores como argumentos para metodos y como estos pasan como valor o referencia segun el caso
// DESCRIPCION: 



public class Valores{

	public static void main(String[] args){
		int [] vectorEntero={1,2,3,4,5,6,7,8,9,10};
		String[] vectorTexto={"Hola","Mundo","He","Despertado"};
		int pos=0;

		System.out.printf("Valores originales de los vectores\n");
		System.out.printf("VectorEntero (ANTES DE LLAMAR A ALGUN METODO) \nPosicion\tValor\n");
		for (int i:vectorEntero)
			System.out.printf("%d\t\t%d\n",pos++,i);

		System.out.printf("\nvectorTexto (ANTES DE LLAMAR A ALGUN METODO) \nPosicion\tValor\n");
		pos=0;
		for (String i:vectorTexto)
			System.out.printf("%d\t\t%s\n",pos++,i);
		
		triplicar(vectorEntero);

		System.out.printf("VectorEntero (DESPUES DE LLAMAR METODO TRIPLICAR) \nPosicion\tValor\n");
		pos=0;
		for (int i:vectorEntero)
			System.out.printf("%d\t\t%d\n",pos++,i);

		concatenar(vectorTexto);

        System.out.printf("VectorTexto (DESPUES DE LLAMAR METODO CONCATENAR) \nPosicion\tValor\n");
        pos=0;
		for (String i:vectorTexto)
			System.out.printf("%d\t\t%s\n",pos++,i);

		System.out.printf("valor posicion 5 de vectorEntero (ANTES DE LLAMAR METODO MODIFICAR) \nPosicion\tValor\n");
		System.out.printf("%d\t\t%d\n",5,vectorEntero[5]);

		modificar(vectorEntero[5]);

		System.out.printf("valor posicion 5 de vectorEntero (DESPUES DE LLAMAR METODO MODIFICAR) \nPosicion\tValor\n");
		System.out.printf("%d\t\t%d\n",5,vectorEntero[5]);

		System.out.printf("valor posicion 2 de vectortexto (ANTES DE LLAMAR METODO CAMBIAR) \nPosicion\tValor\n");
		System.out.printf("%d\t\t%s\n",2,vectorTexto[2]);

		cambiar(vectorTexto[2]);

		System.out.printf("valor posicion 2 de vectortexto (DESPUES DE LLAMAR METODO CAMBIAR) \nPosicion\tValor\n");
		System.out.printf("%d\t\t%s\n",2,vectorTexto[2]);


	}
	public static void triplicar(int[] b){
		for(int i=0; i<=b.length-1;i++)
			b[i]*=3;
		System.out.printf("Vector b[] (Viene de Vector Entero, triplicado en metodo triplicar) \nPosicion\tValor\n");
		for(int i=0; i<=b.length-1;i++)
			System.out.printf("%d\t\t%s\n",i,b[i]);	
	}
	public static void concatenar(String[] texto){
		for(int i=0; i<=texto.length-1;i++)
			texto[i] +=  " "+ texto[i];
		System.out.printf("Vector texto[] (Viene de Vector texto, cocatenado con metodo concatenar) \nPosicion\tValor\n");
		for(int i=0; i<=texto.length-1;i++)
			System.out.printf("%d\t\t%s\n",i,texto[i]);	
	}

	public static void modificar (int a){
		a+=a;
		System.out.printf("Elemento tomado de la posicion 5 de vectorEntero (Modificado en metodo modificar) \nPosicion\tValor\n");
		System.out.printf("%d\t\t%d\n",5,a);
	}

	public static void cambiar (String txt){
		txt+=" modificado en cambiar";
		System.out.printf("Elemento tomado de la posicion 2 de vectorTexto (Modificado en metodo cambiar) \nPosicion\tValor\n");
		System.out.printf("%d\t\t%s\n",2,txt);
	}



}