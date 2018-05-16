package main;

public class SamsungStore implements IAbstractFactory {

	public IComputadora crearComputadora() {
		return new QX410();
	}
	
	public ITablet crearTablet() {
		return new TabS3();
	}
	
}
