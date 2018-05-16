package main;

public class Pizzeria {

	public Pizza crearPizzaChica() {
		//DB, FIle, API
		return new Pizza(6); 
	}
	
	public Pizza crearPizzaMediana() {
		return new Pizza(8); 
	}
	
	public Pizza crearPizzaGrande() {
		return new Pizza(12); 
	}
}
