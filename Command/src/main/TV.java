package main;

public class TV implements IDevise {
	
	private boolean on;
	
	public TV() {
		this.on = false;
	}
	
	public void on() {
		this.on = true;
		System.out.println("TV encendida!");
	}
	
	public void off() {
		this.on = true;
		System.out.println("TV apagada!");
	}
	
	
}
