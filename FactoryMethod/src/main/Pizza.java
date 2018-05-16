package main;

public class Pizza {

	private int cantidadRebanadas;
	private String especialidad;
	
	public Pizza(int cantidadRebanadas, String especialidad) {
		this.cantidadRebanadas = cantidadRebanadas;
		this.especialidad = especialidad;
	}
	
	public String toString() {
		return "Cantidad rebanadas : " + this.cantidadRebanadas + " Especilidad : " + this.especialidad;
	}
	
}