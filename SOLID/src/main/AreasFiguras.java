package main;

public class AreasFiguras {
	
	public void area(Rectangulo rectangulo) {
		System.out.println(rectangulo.getBase() * rectangulo.getAltura() );
	}
	
	public void area(Triangulo triangulo) {
		System.out.println( ( triangulo.getBase() * triangulo.getAltura() )/ 2);
	}
	
}
