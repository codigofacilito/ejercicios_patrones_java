package main;

public class Main {

	public static void main(String[] args) {
	
		NubeFactory factory = new NubeFactory();
		
		for(int x = 0; x < 100; x ++) {
			Nube nube = factory.getNube(TipoNube.Chica);
			System.out.println(nube);
		}
		
		for(int x = 0; x < 200; x ++) {
			Nube nube = factory.getNube(TipoNube.Mediana);
			System.out.println(nube);
		}
		
		for(int x = 0; x < 300; x ++) {
			Nube nube = factory.getNube(TipoNube.Grande);
			System.out.println(nube);
		}
		
		System.out.println(factory.countNubesMap());
	}

}
