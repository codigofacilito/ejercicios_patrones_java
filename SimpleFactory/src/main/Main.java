package main;

public class Main {
	
	public static void main(String[] args) {
		
		Pizzeria pizzeriaCF = new Pizzeria();
		
		Pizza pizzaPeperoni = pizzeriaCF.crearPizzaChica();
		
		System.out.println(pizzaPeperoni);
		
	}
	
}
