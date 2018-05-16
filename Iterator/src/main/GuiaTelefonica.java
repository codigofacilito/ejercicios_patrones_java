package main;

import java.util.ArrayList;

public class GuiaTelefonica {

	private ArrayList<String> numeros;
	
	public GuiaTelefonica() {
		this.numeros = new ArrayList<String>();
	}
	
	public void add(String numero) {
		this.numeros.add(numero);
	}
	
	public ArrayList<String> getNumeros() {
		return this.numeros;
	}
	
}
