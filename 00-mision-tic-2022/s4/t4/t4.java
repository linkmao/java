// Librerias de java para utilizar
import java.util.ArrayList;
import java.util.List;


public class Transaccion {
	private int cons;
	private double valor;
	private int accion;
	private int tipo;
	public Transaccion(int pConsecutivo,double pValor,int pAccion,int pTipo ) {
		cons=pConsecutivo;
		valor=pValor;
		accion=pAccion;
		tipo=pTipo;
	}
	public int darConsecutivo() {
		return cons;
	}
	public double darValor() {
		return valor;
	}

	public int darTipoTransaccion() {
		return accion;
	}

	public int darTipoCuenta() {
		return tipo;
	}

	public String resumen() {
		return "Consecutivo: "+cons+" Valor: "+valor+" Accion: "+accion+" Tipo: "+tipo;
	}
	
	
	

}


public class CDT
{
     // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Valor inicial del CDT.
     */
    private double valorInvertido;

    /**
     * Interés mensual que del CDT
     */
    private double interesMensual;

    /**
     * Mes de apertura del CDT.
     */
    private int mesApertura;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicializa el CDT. <br>
     * <b>post: </b> El valor invertido, el interés mensual y la fecha se inicializaron en 0.
     */
    public CDT( )
    {
        valorInvertido = 0;
        interesMensual = 0;
        mesApertura = 0;
    }


    public void verificarInvariante() {
    	assert mesApertura>=0:"Mes Incorrecto";
    	assert interesMensual>=0:"Interes incorrecto";
    	assert valorInvertido>=0:"Valor Invertido Incorrecto";
    	//assert ahorros.darSaldo() +  inversion.calcularValorPresente( mesActual ) < INVERSION_MAXIMO:"ERROR: SE SUPERÓ EL MONTO MÁXIMO DE INVERSIÓN";
    }
    
    /**
     * Retorna el interés que paga el banco mensualmente por este CDT.
     * @return Interés mensual del CDT.
     */
    public double darInteresMensual( )
    {
        return interesMensual;
    }

    /**
     * Inicia una inversión en un CDT .<br>
     * <b>post: </b> Se cambian los valores del CDT, con los valores recibidos. <br>
     * @param pMontoInvertido Monto de dinero que se va a invertir en el CDT. pMontoInvertido > 0.
     * @param pInteresMensual Interés mensual que va a ganar el CDT. pInteresMensual > 0.
     * @param pMes Mes de apertura del CDT. pMes > 0.
     */
    public void invertir( double pMontoInvertido, double pInteresMensual, int pMes )
    {
    	
        valorInvertido = pMontoInvertido;
        interesMensual = pInteresMensual;
        mesApertura = pMes;
    	
    	verificarInvariante();
    }

    /**
     * Calcula el valor presente de la inversión teniendo en cuenta el interés de la cuenta. <br>
     * @param pMesActual Mes actual del simulador. pMesActual > 0.
     * @return Valor presente del dinero invertido en CDT.
     */
    public double calcularValorPresente( int pMesActual )
    {
        int mesesTranscurridos = pMesActual - mesApertura;
        verificarInvariante();
        return ( double ) ( valorInvertido + ( mesesTranscurridos * interesMensual * valorInvertido ) );
        
    }

    /**
     * Cierra el CDT y retorna el valor invertido más los intereses. <br>
     * <b>post: </b> Se retornó el rendimiento del CDT, y se reinició sus atributos a 0.
     * @param pMesActual Mes de cierre para calcular el rendimiento del CDT.
     * @return Valor de cierre del CDT.
     */
    public double cerrar( int pMesActual )
    {
        double valorCierre = calcularValorPresente( pMesActual );
        valorInvertido = 0;
        interesMensual = 0;
        mesApertura = 0;
        return valorCierre;
    }
    
    //TODO: 7 Calcular los intereses del cdt
    public double darInteresGenerado(int pMesActual) {
    	int mesesTranscurridos = pMesActual - mesApertura;
    	verificarInvariante();
    	return (double) ( mesesTranscurridos * interesMensual * valorInvertido );
    }
}





public class CuentaAhorros
{
      // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Saldo actual de la cuenta de ahorro.
     */
    private double saldo;

    /**
     * Interés mensual que paga la cuenta de ahorro.
     */
    private double interesMensual;

  //TODO: 2 Crear atributo
    private double interesGenerado;
    
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicializa la cuenta de ahorro con el interés mensual que paga el banco. <br>
     * <b>post: </b> Se inicializó el saldo en 0 y el interés mensual en 0.006.
     */
    public CuentaAhorros( )
    {
        saldo = 0;
        interesMensual = 0.006;
        //TODO: 3 Inicializar el interes generado en 0
        interesGenerado = 0;
    }

    /**
     * Retorna el saldo del cliente. <br>
     * @return Saldo de la cuenta de ahorros.
     */
    public double darSaldo( )
    {
        return saldo;
    }

    /**
     * Retorna el interés mensual. <br>
     * @return Interés mensual de la cuenta de ahorros.
     */
    public double darInteresMensual( )
    {
        return interesMensual;
    }
    
    //TODO: 4 Retorna el interes total generado
    public double darInteresGenerado( )
    {
        return interesGenerado;
    }

    /**
     * Consigna un monto de dinero en la cuenta del cliente. <br>
     * <b>post: </b> El saldo se incrementó en el monto de dinero ingresado. <br>
     * @param pMonto Monto de dinero a consignar en la cuenta. pMonto > 0.
     */
    public void consignarMonto( double pMonto )
    {
        saldo = saldo + pMonto;
    }

    /**
     * Retira un monto de dinero de la cuenta de ahorros. <br>
     * <b>post: </b> El saldo se redujo en el valor dado.
     * @param pMonto Monto de dinero a retirar de la cuenta de ahorros. pMonto > 0.
     */
    public void retirarMonto( double pMonto )
    {
        saldo = saldo - pMonto;
    }

    /**
     * Actualiza el saldo de la cuneta de ahorros sumándole los intereses (ha pasado un mes). <br>
     * <b>post: </b> El saldo actual se actualizó aplicando el porcentaje de interés mensual respectivo.
     */
    public void actualizarSaldoPorPasoMes( )
    {
    	//TODO: 5 Calcular el ingreso mensual por interes y acumularlo (ahorros)
    	double ingreso = ( saldo * interesMensual );
        saldo += ingreso;
        interesGenerado += ingreso;
    }
    
    //TODO: 6 Calculo interes compuesto
    public void actualizarSaldoMeses(int pMeses)
    {
    	interesGenerado += saldo*Math.pow(1+0.006, pMeses) - saldo;
    	saldo *= Math.pow(1+0.006, pMeses);
    	
    }
    
    //TODO: 9 Cerrar cuenta de ahorros
    public void cerrarCuenta() {
    	saldo = 0;
    	interesGenerado = 0;
    }
}




public class CuentaCorriente
{
     private double saldo;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicializa la cuenta corriente. <br>
     * <b>post: </b> Se inicializó el saldo en 0.
     */
    public CuentaCorriente( )
    {
        saldo = 0;
    }
    
    /**
     * Retorna el saldo de la cuenta del cliente. <br>
     * @return Saldo de la cuenta corriente.
     */
    public double darSaldo( )
    {
        return saldo;
    }

    /**
     * Consigna un monto de dinero en la cuenta del cliente. <br>
     * <b>post: </b> El saldo se incrementó en el monto de dinero dado. <br>
     * @param pMonto Monto de dinero a consignar en la cuenta. pMonto > 0.
     */
    public void consignarMonto( double pMonto )
    {
        saldo = saldo + pMonto;
    }

    /**
     * Retira un monto de dinero de la cuenta del cliente. <br>
     * <b>post: </b> El saldo se redujo en el monto de dinero dado.
     * @param pMonto Monto de dinero a retirar en la cuenta. pMonto > 0.
     */
    public void retirarMonto( double pMonto )
    {
        saldo = saldo - pMonto;
    }
    
    public void cerrarCuenta() {
    	saldo = 0;
    }
}






@SuppressWarnings("unchecked")


public class SimuladorBancario
{
	 	public static final double INVERSION_MAXIMO = 100000000;
	
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

	//TODO: 1 Crear atributo
    private double interesGenerado;
	
    /**
     * Cédula del cliente.
     */
    private String cedula;

    /**
     * Nombre del cliente.
     */
    private String nombre;

    /**
     * Mes actual.
     */
    private int mesActual;

    /**
     * Cuenta corriente del cliente.
     */
    private CuentaCorriente corriente;

    /**
     * Cuenta de ahorros del cliente.
     */
    private CuentaAhorros ahorros;

    /**
     * CDT del cliente.
     */
    private CDT inversion;
    
    private List<Transaccion> tran;
    
    private int cons;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicializa el simulador con la información del cliente. <br>
     * <b>post: </b> El mes fue inicializado en 1, y las tres cuentas (CDT, corriente y de ahorros) fueron inicializadas como vacías. <br>
     * @param pCedula Cédula del nuevo cliente. pCedula != null && pCedula != "".
     * @param pNombre Nombre del nuevo cliente. pNombre != null && pNombre != "".
     */
    public SimuladorBancario( String pCedula, String pNombre )
    {
        // Inicializa los atributos personales del cliente
        nombre = pNombre;
        cedula = pCedula;
        // Inicializa el mes en el 1
        mesActual = 1;
        // Inicializa las tres cuentas en vacío
        corriente = new CuentaCorriente( );
        ahorros = new CuentaAhorros( );
        inversion = new CDT( );
        tran = new  ArrayList<Transaccion>();
        cons=1;
        verificarInvariante();
    }

    
    public void verificarInvariante() {
    	assert mesActual>=1:"Mes Incorrecto";
    	assert corriente!=null:"Corriente Debe Existir";
    	assert ahorros!=null:"Ahorros Debe Exisitr";
    	assert ahorros.darSaldo()>=0:"Saldo ahorros incorrecto";
    	assert corriente.darSaldo()>=0:"Saldo corriente incorrecto";
    	assert ahorros.darSaldo() +  inversion.calcularValorPresente( mesActual ) < INVERSION_MAXIMO:"ERROR: SE SUPERÓ EL MONTO MÁXIMO DE INVERSIÓN";
    }
    
    
    /**
     * Retorna el nombre del cliente.
     * @return Nombre del cliente.
     */
    public String darNombre( )
    {
        return nombre;
    }
    
    public double darInteresGenerado() {
    	return interesGenerado + ahorros.darInteresGenerado();
    }

    /**
     * Retorna la cédula del cliente.
     * @return Cédula del cliente.
     */
    public String darCedula( )
    {
        return cedula;
    }

    /**
     * Retorna la cuenta corriente del cliente.
     * @return Cuenta corriente del cliente.
     */
    public CuentaCorriente darCuentaCorriente( )
    {
        return corriente;
    }

    /**
     * Retorna el CDT del cliente.
     * @return CDT del cliente.
     */
    public CDT darCDT( )
    {
        return inversion;
    }

    /**
	 * Retorna la cuenta de ahorros del cliente.
	 * @return Cuenta de ahorros del cliente.
	 */
	public CuentaAhorros darCuentaAhorros( )
	{
	    return ahorros;
	}

	/**
     * Retorna el mes en el que se encuentra la simulación.
     * @return Mes actual.
     */
    public int darMesActual( )
    {
        return mesActual;
    }

    /**
     * Calcula el saldo total de las cuentas del cliente.
     * @return Saldo total de las cuentas del cliente.
     */
    public double calcularSaldoTotal( )
    {
        return corriente.darSaldo( ) + ahorros.darSaldo( ) + inversion.calcularValorPresente( mesActual );
    }
    
    
    
    
    public void CrearTransaccion(double v, int a , int t) {
    	tran.add(new Transaccion(cons,v,a,t));
    	cons++;
    }
    
    

    /**
     * Invierte un monto de dinero en un CDT. <br>
     * <b>post: </b> Invirtió un monto de dinero en un CDT.
     * @param pMonto Monto de dinero a invertir en un CDT. pMonto > 0.
     * @param pInteresMensual Interés del CDT elegido por el cliente.
     */
    public void invertirCDT( double pMonto, String pInteresMensual )throws Exception
    {
		if(inversion.calcularValorPresente(mesActual)==0) {
			double pInteres = Double.parseDouble(pInteresMensual) / 100.0;
			inversion.invertir( pMonto, pInteres, mesActual );
			CrearTransaccion(pMonto, 0, 2);
			verificarInvariante();
		}else {
			throw new Exception("ERROR: SOLO SE PUEDE TENER UN CDT ACTIVO A LA VEZ");
		}
    }

    /**
     * Consigna un monto de dinero en la cuenta corriente. <br>
     * <b>post: </b> Consignó un monto de dinero en la cuenta corriente.
     * @param pMonto Monto de dinero a consignar en la cuenta. pMonto > 0.
     */
    public void consignarCuentaCorriente( double pMonto )
    {
        corriente.consignarMonto( pMonto );
    }

    /**
     * Consigna un monto de dinero en la cuenta de ahorros. <br>
     * * <b>post: </b> Consignó un monto de dinero en la cuenta de ahorros.
     * @param pMonto Monto de dinero a consignar en la cuenta. pMonto > 0.
     */
    public void consignarCuentaAhorros( double pMonto )
    {
        ahorros.consignarMonto( pMonto );
        CrearTransaccion(pMonto, 0, 0);
        verificarInvariante();
    }

    /**
     * Retira un monto de dinero de la cuenta corriente. <br>
     * <b>pre: </b> La cuenta corriente ha sido inicializada
     * <b>post: </b> Si hay saldo suficiente, entonces este se redujo en el monto especificado.
     * @param pMonto Monto de dinero a retirar de la cuenta. pMonto > 0.
     */
    public void retirarCuentaCorriente( double pMonto )
    {
        corriente.retirarMonto( pMonto );
        CrearTransaccion(pMonto, 1, 1);
        verificarInvariante();
    }

    /**
     * Retira un monto de dinero de la cuenta de ahorros. <br>
     * <b>post: </b> Se redujo el saldo de la cuenta en el monto especificado.
     * @param pMonto Monto de dinero a retirar de la cuenta. pMonto > 0.
     */
    public void retirarCuentaAhorros( double pMonto )
    {
        ahorros.retirarMonto( pMonto );
        CrearTransaccion(pMonto, 1, 0);
        verificarInvariante();
    }
    

    /**
     * Avanza en un mes la simulación. <br>
     * <b>post: </b> Se avanzó el mes de la simulación en 1. Se actualizó el saldo de la cuenta de ahorros.
     */
    public void avanzarMesSimulacion( )
    {
    	verificarInvariante();
        mesActual += 1;
        double Th = ahorros.darInteresGenerado();
        double Tc = inversion.darInteresGenerado(mesActual-1);
        ahorros.actualizarSaldoPorPasoMes( );
        Tc=inversion.darInteresGenerado(mesActual)-Tc;
        Th=ahorros.darInteresGenerado()-Th;
        
        if(Th>0) {
        	CrearTransaccion(Th, 0, 0);
        }
        if(Tc>0) {
        	CrearTransaccion(Tc, 0, 2);
        }
        verificarInvariante();
    }

    /**
     * Cierra el CDT, pasando el saldo a la cuenta corriente. <br>
     * <b>pre: </b> La cuenta corriente y el CDT han sido inicializados. <br>
     * <b>post: </b> El CDT quedó cerrado y con valores en 0, y la cuenta corriente aumentó su saldo en el valor del cierre del CDT.
     */
    public void cerrarCDT( )
    {
    	//TODO: 8 agregar el interes generado por el cdt al total de la simulacion
        interesGenerado += inversion.darInteresGenerado(mesActual);
        double valorCierreCDT = inversion.cerrar( mesActual );
        corriente.consignarMonto( valorCierreCDT );
        CrearTransaccion(valorCierreCDT, 1, 2);
        CrearTransaccion(valorCierreCDT, 0, 1);
        verificarInvariante();
    }
    
    /**
     * Retrira el saldo total la cuenta de ahorros, pasandolo a la cuenta corriente. <br>
     * <b>pre: </b> La cuenta corriente y el la cuenta de ahorros han sido inicializados. <br>
     * <b>post: </b> La cuenta de ahorros queda vacia ( con valores en 0 ), y la cuenta corriente aumentó su saldo en el valor del saldo total que tenia la cuenta de ahorros.
     */
    public void pasarAhorrosToCorriente()
    {
    	double cantidad = ahorros.darSaldo();
    	ahorros = new CuentaAhorros();
    	corriente.consignarMonto(cantidad);
    	CrearTransaccion(cantidad, 1, 0);
    	CrearTransaccion(cantidad, 0, 1);
    }

    /**
     * Avanza la simulción un numero de meses dado por parámetro.
     * @param pMeses numero de meses a avanzar
     * <b>post: </b> Se avanzaron los meses de la simulación. Se actualizaron los saldos.
     */
    public void metodo1( int pMeses )
    {
    	//mesActual += pMeses;
    	for(int i =0 ; i<pMeses;i++) {	
    		avanzarMesSimulacion();
    	}
    	//ahorros.actualizarSaldoMeses(pMeses);
    	verificarInvariante();
    }

    /**
     * Reinicia la simulación.
     * @return interes total generado por la simulación.
     */
    public double metodo2( )
    {	
    	cerrarCDT();
    	corriente.cerrarCuenta();
    	double respuesta = interesGenerado + ahorros.darInteresGenerado();
    	ahorros.cerrarCuenta();
    	interesGenerado = 0;
    	tran.clear();
    	mesActual = 1;
        return respuesta;
    }

	public int metodo3(int pTipo, int pCuenta) {
		double mayor=-1;
		Transaccion T = null;
		for(Transaccion t:tran) {
			if(t.darTipoTransaccion()==pTipo&&t.darTipoCuenta()==pCuenta&&t.darValor()>mayor){
				mayor=t.darValor();
				T=t;
			}
		}
		return T.darConsecutivo();
	}
}


public class Test extends TestBase {
    
    @Override
   
   
    public void setupEscenario10()
    {
       setupEscenario2();
    	try {
    	    //cuenta.cerrarCDT();
			cuenta.invertirCDT(500000, "0.02");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	cuenta.retirarCuentaAhorros(200000);
    }
    
      public void testPunto2a()
        {
          	 setupEscenario9();
        	cuenta.metodo1(2);
        	cuenta.pasarAhorrosToCorriente();
        	cuenta.avanzarMesSimulacion();
        	cuenta.consignarCuentaCorriente(150000);
        	int respuesta = 98568988;
        	assertEquals( "El saldo de la cuenta corriente no es el esperado", respuesta, ( int )cuenta.calcularSaldoTotal(), 5 );
        }
}