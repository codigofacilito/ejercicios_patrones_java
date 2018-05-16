package main;

public class ConexionMongoDB implements IConexionNoSQL {
	
	public void conexion() {
		System.out.println("Conexión con MongoDB");
	}
	
	public String excecuteSentence() {
		return "Consulta MongoDB";
	}
	
}
