package main;

public class Retiro implements IManejadorTransacciones {

	private IManejadorTransacciones next;
	
	public void setNextManejador(IManejadorTransacciones next) {
		this.next = next;
	}
	
	public void ejecutarTransaccion(Transaccion transaccion) {
		
		if(transaccion.getTipoTransaccion() == TipoTransaccion.Retiro) {
			float cantidad = transaccion.getCantidad() - transaccion.getBalance();
			System.out.println("El nuevo balances después de un retiro es : " + cantidad);
		}else {
			this.next.ejecutarTransaccion(transaccion);
		}
		
	}
}