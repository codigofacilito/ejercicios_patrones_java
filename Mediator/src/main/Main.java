package main;

public class Main {

	public static void main(String[] args) {
		
		Usuario eduardo = new Usuario("Eduardo");
		Usuario codi = new Usuario("Codi");
		
		SalaChat sala = new SalaChat();
		
		sala.addParticipante(eduardo);
		sala.addParticipante(codi);
		
		sala.enviarMensaje(eduardo, codi, "Hola desde el curso de patrones de diseño!");
		
 
	}

}
