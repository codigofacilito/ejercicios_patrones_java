package main;

public class OnDevise implements ICommand {

	private IDevise devise;
	
	public OnDevise(IDevise devise) {
		this.devise = devise;
	}
	
	public void operacion() {
		this.devise.on();
	}
	
}
