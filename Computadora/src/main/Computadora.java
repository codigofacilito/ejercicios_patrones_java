package main;

public class Computadora {
	
	private ITeclado teclado;
	private IMouse mouse;
	
	public Computadora(ITeclado teclado, IMouse mouse) {

		this.teclado = teclado;
		this.mouse = mouse;

	}
	
	public void encender() {
		
		this.teclado.conectar();
		this.mouse.conectar();
		
	}
}
