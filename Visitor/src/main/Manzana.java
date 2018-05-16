package main;

public class Manzana implements IFruta, IVisitable {

	public float getPrecio() {
		return 2f;
	}
	
	public float aplicarDescuento(IVisitor visitor) {
		return visitor.descuento(this);
	}
	
}
