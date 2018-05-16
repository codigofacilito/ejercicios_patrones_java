package main;

public class Usuario {
	
	private String nombre;
	private String apellido;
	
	private boolean medioContacto; 
	
	private String email;
	private String telefono;
	private String direccion;
	
	
	public BuilderUsuario setMedioContacto(boolean medioContacto) {
		
		if(!medioContacto) {
			throw new IllegalArgumentException("No es posible asiganar un valor falso a medio de contacto");
		}
		
		this.medioContacto = medioContacto;
		return new BuilderUsuario(this);
	}
	
	private Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		
		this.medioContacto = false;
		
		this.email = "";
		this.telefono = "";
		this.direccion = "";
		
	}
	
	public static Usuario Make(String nombre, String apellido) {
		return new Usuario(nombre, apellido);
	}
	
	public Usuario Build() {
		return this;
	}
	
	public String toString() {
		return " " + this.nombre + " " + this.apellido + " " + this.email + " " + this.telefono + " " + this.direccion;
	}
	
	
	public static class BuilderUsuario{
		
		private Usuario usuario;
		
		public BuilderUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		
		public BuilderUsuario setDireccion(String direccion) {
			usuario.direccion = direccion;
			return this;
		}

		public BuilderUsuario setEmail(String email) {
			usuario.email = email;
			return this;
		}

		public BuilderUsuario setTelefono(String telefono) {
			usuario.telefono = telefono;
			return this;
		}
		
		public Usuario Build() {
			return usuario;
		}
	}
	
}
