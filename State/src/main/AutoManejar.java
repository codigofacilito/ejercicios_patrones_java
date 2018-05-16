package main;

public class AutoManejar implements IEstadoAuto {
	
	private final Auto auto;
	
	public AutoManejar(Auto auto) {
		this.auto = auto;
	}
	
	public void encender() {
		System.out.println("El auto ya esta encendido!");
	}
	
	public void manejar() {
		System.out.println("El auto ya se esta moviendo!");
	}
	
	public void apagar() {
		System.out.println("El auto esta apagado!");
		auto.setEstadoActual(auto.getAutoApagado());
	}
	
}
