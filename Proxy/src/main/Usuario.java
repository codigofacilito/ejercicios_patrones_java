package main;

public class Usuario {

	private int nivelPermiso;//1 -- 5 //5 == Admin

	public Usuario(int nivelPermiso) {
		this.nivelPermiso = nivelPermiso;
	}
	
	public int getNivelPermiso() {
		return nivelPermiso;
	}

	public void setNivelPermiso(int nivelPermiso) {
		this.nivelPermiso = nivelPermiso;
	}
	
	
	
}
