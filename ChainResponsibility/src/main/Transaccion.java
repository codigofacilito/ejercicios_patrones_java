package main;

public class Transaccion {
	
	private float cantidad;
	private float balance;
	private TipoTransaccion tipoTransaccion;
	
	public Transaccion(float cantidad, float balance, TipoTransaccion tipoTransaccion) {
		this.setCantidad(cantidad);
		this.setBalance(balance);
		this.setTipoTransaccion(tipoTransaccion);
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public TipoTransaccion getTipoTransaccion() {
		return tipoTransaccion;
	}

	public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}
}
