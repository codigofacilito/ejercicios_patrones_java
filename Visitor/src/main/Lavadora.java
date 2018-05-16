package main;

public class Lavadora implements IFruta, IVisitable {

	public float getPrecio() {
		return 20f;
	}
	
	public float aplicarDescuento(IVisitor visitor) {
		return visitor.descuento(this);
	}
	
}
