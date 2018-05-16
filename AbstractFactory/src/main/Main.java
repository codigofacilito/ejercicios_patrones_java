package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SamsungStore samsung = new SamsungStore();
		AppleStore apple = new AppleStore();
		
		IComputadora mac = apple.crearComputadora();
		ITablet ipad = apple.crearTablet();
		
		IComputadora qx = samsung.crearComputadora();
		ITablet s3 = samsung.crearTablet();
		
	}

}
