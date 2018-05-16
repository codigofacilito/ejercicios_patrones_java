package main;

public class Main {
	
	public static void main(String[] args) {
		
		Rectangulo rectangulo = new Rectangulo(10, 20);
		Triangulo triangulo = new Triangulo(10, 5);
		
		Presentacion presentacion = new Presentacion();
		
		presentacion.area(rectangulo);
		presentacion.area(triangulo); 
		
	}

}
