package main;

public class Main {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("Codi", 6 );
		
		Usuario memento = usuario.getMemento();//Nuestra copia!
		
		usuario.setNombre("Cambio de nombre");
		usuario.setEdad(20);
		
		System.out.println(usuario.getNombre());
		System.out.println(usuario.getEdad());
		
		usuario.restartMemento(memento);
		
		System.out.println(usuario.getNombre());
		System.out.println(usuario.getEdad());
		
	}

}
