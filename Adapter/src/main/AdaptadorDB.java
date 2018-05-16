package main;

public class AdaptadorDB implements IConexionSQL {

	private IConexionNoSQL noSQL;
	
	public AdaptadorDB(IConexionNoSQL noSQL) {
		this.noSQL = noSQL;
	}
	
	public void conexion() {
		this.noSQL.conexion();
	}
	
	public String runQuery() {
		return this.noSQL.excecuteSentence();
	}
}
