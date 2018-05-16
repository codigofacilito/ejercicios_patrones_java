package main;

public interface IObservable {

	void addObserver(IObserver o);
	
	void notificarObservadores();
	
	void removeObserver();
	
}
