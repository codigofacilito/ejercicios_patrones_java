package main;

public class ProxyServicio implements IServicio {

	private IServicio servicio;
	
	public ProxyServicio(Usuario usuario) {
		
	}
	
	public void leer() {
		this.obtenerServicio().leer();
	}
	
	public void escribir() {
		this.obtenerServicio().escribir();
	}
	
	public void actualizar() {
		this.obtenerServicio().actualizar();
	}
	
	public void eliminar() {
		this.obtenerServicio().eliminar();
	}
	
	private IServicio obtenerServicio() {
		if(this.servicio == null) {
			this.servicio = new Servicio();//
		}
		
		return this.servicio;
	}
}
