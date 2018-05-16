package main;

public class Main {
	
	public static void main(String[] args) {
		
		IPizza pizzaPeperoni = new QuesoExtra(new PizzaPeperoni());
		
		System.out.println(pizzaPeperoni.descripcion());
		System.out.println(pizzaPeperoni.precio());
		
		
		IPizza pizzaHawaiana = new QuesoExtra(new OrillaRellena(new PizzaHawaiana()));
		
		System.out.println(pizzaHawaiana.descripcion());
		System.out.println(pizzaHawaiana.precio());
		
		
		
		
	}

}
