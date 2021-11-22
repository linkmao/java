apuntes preliminares para la conexion y gestion de base de datos con el controlador Derby usando el framewokr JDBC

metodo createStatement de la clase Conecction

Statement s = conexion.createStatement();


String sql= "CREATE TABLE resultado 
			(nombre varchar(32),
			apellido varchar(32),
			edad int,
			activo boolean,
			codigo int,
			PRIMARY KEY (codigo))"; 
  // consulta para la creacion de tablas



 
s.execute(sql);


String sql = "SELECT....."
ResultSet resultado = s.executeQuery(sql);


String sql="UPDATE...."
int modificado = s.executeUpdate(sql);



MANIPULACION DE LOS RESULTADOS SE HACE CON LA CLASE ResultSet
con metodo next() se avanza sobre la secuencua

con los metodos getString() y getInt() se extrae la informacion de los campos del elemento actual de la secuencia

con el siguiente ejemplo se entiende como manipular la informacion
asumamos que se ha creado la tabla resultado como se escribio arriba


String sql = "SELECT * FROM resultados WHERE codigo = 2179";
Statement st = conexion.createStatement();
ResultSet resultado = st.executeQuery(sql);
if (resultado.next()){
	string nombre= resultado.getString(1);
	string apellido = resultado.getString(2);
	int edad = resultado.getInt(3);
	boolean activo = resultado.getBoolean(4); // suposicion no se si es así
	int codigo = resultado.getInt(5);
}
resultado.close();
st.close();



CONEXION DE LA BASE DE datos
luego de descagar el derby y de tomar el archivo derby.jar y llevarlo inicialmente a la carpetalib y luego
posteriormente hacerle un areferencia en referenced lib el proceso de coneion a la base de datos es el siguiente


declaracion de constantes necesarias ademas del codigo de la conexion y demás que no cambiará pues esto es casi así el 100% de las veces

public final static String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
public final static String JDBC_URL = "jdbc:derby:listaContactos;create=true"; // este tiene el nombre de la bd
public final static String SHUT_DOWN = "admin.db.shutdown";

private Connection conexion;


 public void conectarABD( ) throws SQLException, Exception
    {
    	// Load driver
    	Class.forName(DRIVER);
    	
    	// Connect
    	conexion = DriverManager.getConnection( JDBC_URL );
        if (conexion != null)
        {
        	System.out.println("Conexion exitosa");
        }
    }
    


   public void desconectarBD( ) throws SQLException
    { 
        conexion.close( );
  
        try
        {
            DriverManager.getConnection( SHUT_DOWN );
        }
        catch( SQLException e )
        {
            // Al bajar la base de datos se produce siempre una excepción
        }
    }




    algunos apuntes para la ocdificacion de las PRUEBAS UNITARIAS


    package maolink.proyecto.geometria.test;  // es bueno por ejemplo trabajar siempre en empaquetado
    import junit.framework.TestCase;
    public class GeometriaTest extends TestCase{
    private Geometria geo;   // se debe hacer una asociacion de un objeto del tipo de la clase que se va a probar
    // CREACION DE ESCENARIOS

    private void setupEscenario1(){
    	geo= new Geometria();
    	// se inicia a llenar o a usar el constructor de geo con lo que se quiera, para generar los escenarios de los
    	//metodos a testear
    	geo.suma(a, b, c);
	   	geo.suma(m.n,,z);
    }


	// ejecucion de las pruebas
	public void testSuma(){
		setupEscenario1(); //configuro los datos de pruebas
		assertTrue("No se pudo hacer la suma", geo.suma(2,4));

	}


    }







