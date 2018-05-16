package main;

public class Enemigo {

	private String imagen; 
	private int posX;
	private int posY;
	private int cantidadVida;
	
	public Enemigo(String imagen, int posX, int posY, int cantidadVida) {
		this.setImagen(imagen);
		this.setPosX(posX);
		this.setPosX(posX);
		this.setCantidadVida(cantidadVida);
	}
	
	public Enemigo(Enemigo enemigo) {
		this.setImagen(enemigo.getImagen());
		this.setPosX(enemigo.getPosX());
		this.setPosX(enemigo.getPosY());
		this.setCantidadVida(enemigo.getCantidadVida());
	}
	
	public Enemigo clone() {
		//return new Enemigo(this);
		return new Enemigo(this.imagen, this.posX, this.posY, this.cantidadVida);
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public int getPosX() {
		return posX;
	}
	
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public int getCantidadVida() {
		return cantidadVida;
	}

	public void setCantidadVida(int cantidadVida) {
		this.cantidadVida = cantidadVida;
	}
}
