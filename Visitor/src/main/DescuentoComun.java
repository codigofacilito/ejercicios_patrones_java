package main;

public class DescuentoComun implements IVisitor {

	public float descuento(IFruta fruta) {
		return fruta.getPrecio() * 0.10f;
	}
	
	public float descuento(ILineaBlanca lineaBlanca) {
		return lineaBlanca.getPrecio() * 0.05f;
	}
	
}

