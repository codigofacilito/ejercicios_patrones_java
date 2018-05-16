package main;

public class IteradorGuia implements Iterador {

	private GuiaTelefonica guia;
	private int posicion;
	
	public IteradorGuia(GuiaTelefonica guia) {
		this.guia = guia;
	}
	
	public String siguiente() {
		return this.guia.getNumeros().get(this.posicion++);
	}
	
	public boolean contieneSiguiente() {
		return this.posicion < this.guia.getNumeros().size()
				&& this.guia.getNumeros().get(this.posicion) != null;
	}
	
}
