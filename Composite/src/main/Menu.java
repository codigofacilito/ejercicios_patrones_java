package main;

import java.util.ArrayList;

public class Menu implements IMenu{
	
	private ArrayList<IMenu> menus;
	
	public Menu() {
		this.menus = new ArrayList<IMenu>();
	}
	
	public boolean open() {
		System.out.println("Open!");
		return true;
	}
	
	public boolean close() {
		System.out.println("Close!");
		return true;
	}
	
	public void addMenu(IMenu menu) {
		this.menus.add(menu);
	}
	
	public IMenu getMenu(int pos) {
		return this.menus.get(pos);
	}
	
}
