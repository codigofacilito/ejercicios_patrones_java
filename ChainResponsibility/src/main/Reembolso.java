package main;

public class Reembolso implements IManejadorTransacciones {

	private IManejadorTransacciones next;
	
	public void setNextManejador(IManejadorTransacciones next) {
		this.next = next;
	}
	
	public void ejecutarTransaccion(Transaccion transaccion) {
		
		if(transaccion.getTipoTransaccion() == TipoTransaccion.Reembolso) {
			float cantidad = transaccion.getCantidad() + transaccion.getBalance();
			System.out.println("El nuevo balances después de un reembolso es : " + cantidad);
		}else {
			System.out.println("Operación No Valida!");
		}
		
	}
}
