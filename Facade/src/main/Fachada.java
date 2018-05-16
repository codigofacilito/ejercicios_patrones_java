package main;

public class Fachada {

	private Computadora computadora;
	
	public Fachada() {
		
		ITeclado teclado = new Teclado();
		IMouse mouse = new Mouse();
		
		this.computadora = new Computadora(teclado, mouse);
	}
	
	public void encender() {
		//Complejas
		this.computadora.encender();
	}
	
}
