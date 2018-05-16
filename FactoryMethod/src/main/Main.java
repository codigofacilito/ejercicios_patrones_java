package main;

public class Main {

	public static void main(String[] args) {
		
		PizzeriaCF cf = new PizzeriaCF();
		
		Pizza peperoni = cf.crearPizza("Peperoni");
		Pizza hawaiana = cf.crearPizza("Hawaiana");
		Pizza orillaRellena = cf.crearPizza("Peperoni orilla rellena");
		
		
		System.out.println(peperoni);
		System.out.println(hawaiana);
		
		System.out.println(orillaRellena);
		
	}

}
