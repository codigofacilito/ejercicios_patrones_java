package main;

public class Transaccion {

	private IEstrategia estrategia;//algoritmo
	
	public Transaccion(IEstrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public float ejecutarTransaccion(float balance, float cantidad) {
		return this.estrategia.realizarOperacion(balance, cantidad);
	}
	
	
}
