package main;

public class OffDivise implements ICommand {

	private IDevise devise;
	
	public OffDivise(IDevise devise) {
		this.devise = devise;
	}
	
	public void operacion() {
		this.devise.off();
	}
	
}