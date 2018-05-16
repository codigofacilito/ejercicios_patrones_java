package main;

public class Main {

	public static void main(String[] args) {
		
		Transaccion transaccion = new Transaccion(100, 200, TipoTransaccion.Cheques);
		
		IManejadorTransacciones deposito = new Deposito();
		IManejadorTransacciones retiro = new Retiro();
		IManejadorTransacciones reembolso = new Reembolso();
		//100
		deposito.setNextManejador(retiro);
		retiro.setNextManejador(reembolso);
		
		deposito.ejecutarTransaccion(transaccion);
		
	}

}
