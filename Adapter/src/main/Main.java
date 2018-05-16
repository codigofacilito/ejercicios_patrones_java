package main;

public class Main {

	public static void main(String[] args) {
		
		IConexionSQL conexion = new AdaptadorDB( new ConexionMongoDB() );
		
		conexion.conexion();
		
		String resultado = conexion.runQuery();
		System.out.println(resultado);

	}

}
