package main;

public class AppleStore implements IAbstractFactory {

	public IComputadora crearComputadora() {
		return new MacbookPro();
	}
	
	public ITablet crearTablet() {
		return new IPad();
	}
	
}
