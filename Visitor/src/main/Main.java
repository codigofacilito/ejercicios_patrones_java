package main;

public class Main {
	
	public static void main(String[] args) {
		
		//Fruta 10% de descuento
		//LíneBlanca 5% de descuento
		
		
		Manzana manzana = new Manzana();
		Lavadora lavadora = new Lavadora();
		
		IVisitor descuento = new DescuentoComun();
		
		System.out.println(manzana.aplicarDescuento(  descuento ));
		System.out.println(lavadora.aplicarDescuento(  descuento));
		
	}
}
