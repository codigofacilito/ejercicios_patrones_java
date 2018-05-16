package main;

public class Pizza {

	private int cantidadRebanadas;
	
	public Pizza(int cantidadRebanadas) {
		this.cantidadRebanadas = cantidadRebanadas;
	}
	
	public String toString() {
		return "Cantidad rebanadas : " + this.cantidadRebanadas;
	}
	
}
