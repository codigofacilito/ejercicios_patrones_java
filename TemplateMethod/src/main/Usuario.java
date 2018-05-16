package main;

public abstract class Usuario {

	public void autenticacion() {
		System.out.println("TODOS los usuarios necesitan autenticarse!");
	}
	
	abstract void formaTrabajar();
	
}
