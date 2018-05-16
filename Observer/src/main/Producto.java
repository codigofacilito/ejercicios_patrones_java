package main;

import java.util.Set;
import java.util.LinkedHashSet;

public class Producto implements IObservable {
	
	private Set<IObserver> observadores;
	
	private int stock;
	
	public Producto(int stock) {
		this.stock = stock;
		this.observadores = new LinkedHashSet<>();
	}
	
	public void venta() {
		this.setStock(this.stock - 1);
		System.out.println("Producto vendido!");
		
		this.notificarObservadores();
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void addObserver(IObserver o) {
		this.observadores.add(o);
	}
	
	public void notificarObservadores() {
		for(IObserver observador : this.observadores)
			observador.notificacion("EL producto se vendio!");
	}
	
	public void removeObserver() {
		
	}
}
