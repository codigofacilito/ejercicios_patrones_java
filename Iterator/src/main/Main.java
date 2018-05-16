package main;

public class Main {

	public static void main(String[] args) {
		GuiaTelefonica guia = new GuiaTelefonica();
		
		guia.add("123");
		guia.add("124");
		guia.add("125");
		guia.add("126");
		guia.add("127");
		guia.add("128");
		
		Iterador iterador = new IteradorGuia(guia);
		
		while(iterador.contieneSiguiente()) {
			System.out.println(iterador.siguiente());
		}

	}

}
