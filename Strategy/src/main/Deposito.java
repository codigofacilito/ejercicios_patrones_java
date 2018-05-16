package main;

public class Deposito implements IEstrategia {

	public float realizarOperacion(float balance, float cantidad) {
		return balance + cantidad;
	}
	
}
