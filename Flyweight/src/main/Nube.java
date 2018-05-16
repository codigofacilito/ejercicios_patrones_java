package main;

public class Nube {

	private TipoNube tipo;
	private String imagen;
	private int posX;
	private int posY;
	
	public Nube(TipoNube tipo, String imagen, int posX, int posY) {
		this.tipo = tipo;
		this.imagen = imagen;
		this.posX = posX;
		this.posY = posY;
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

	public TipoNube getTipo() {
		return tipo;
	}

	public void setTipo(TipoNube tipo) {
		this.tipo = tipo;
	}
	
	
}
