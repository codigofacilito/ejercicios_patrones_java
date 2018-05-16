package main;

public class Main {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		Menu menu2 = new Menu();
		Menu menu3 = new Menu();
		
		Menu menu4 = new Menu();
		Menu menu5 = new Menu();
		
		menu3.addMenu(menu4);
		menu3.addMenu(menu5);
		
		menu.addMenu(menu2);
		menu.addMenu(menu3);
		
		menu.open();
		menu.close();

	}

}
