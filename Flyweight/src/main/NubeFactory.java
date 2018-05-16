package main;

import java.util.HashMap;

public class NubeFactory {

	private HashMap<TipoNube, Nube> nubesMap;
	
	public NubeFactory() {
		this.nubesMap = new HashMap<TipoNube, Nube>();
	}
	
	public Nube getNube(TipoNube tipo) {
		
		Nube nube = (Nube)this.nubesMap.get(tipo);
		
		if(nube == null) {
			nube = new Nube(tipo, "nube.png", 100, 100);
			this.nubesMap.put(tipo, nube);
		}
		
		return nube;
	}
	
	public int countNubesMap() {
		return this.nubesMap.size();
	}
	
}
