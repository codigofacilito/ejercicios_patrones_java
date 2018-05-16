package main;

public class Usuario {
	
	private String nombre;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}
	
	public void recibirMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	

}
