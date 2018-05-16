package main;

public class PizzeriaCF implements IPizzeria {

	public Pizza crearPizza(String tipo) {
		
		if (tipo.equals("Peperoni")) {
			return new Pizza(8, "Peperoni");
		}
		
		if (tipo.equals("Hawaiana")) {
			return new Pizza(8, "Hawaiana");
		}
		
		if (tipo.equals("Peperoni orilla rellena")) {
			return new PizzaOrillaRellena(12, "Peperoni"); //
		}
		
		return null;
	}
	
}
