package main;

public class ConexionMySQL implements IConexionSQL {

	public void conexion() {
		System.out.println("Conexión con MYSQL");
	}
	
	public String runQuery() {
		return "Consulta MYSQL";
	}
	
}
