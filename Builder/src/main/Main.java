package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario codi = Usuario.Make("Codi", "Facilito")
							.setMedioContacto(false)
							.setDireccion("México").Build();
							
		System.out.println(codi);
	}

}
