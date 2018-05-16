package main;

public class AutoApagar implements IEstadoAuto {
	
	private final Auto auto;
	
	public AutoApagar(Auto auto) {
		this.auto = auto;
	}
	
	public void encender() {
		System.out.println("El auto esta encendido!");
		auto.setEstadoActual(auto.getAutoEncendio());
	}
	
	public void manejar() {
		System.out.println("El auto no se puede manejar si esta apagado!");
	}
	
	public void apagar() {
		System.out.println("El auto ya esta apagado!");
	}
	
}