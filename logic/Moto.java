package Logic;

public class Moto {
	private int posicionX;
	private int posicionY;
	private int tama_Estela;
	private int velocidad;
	private int combustible;
	private boolean escudo;
	private List_Item items;
	private List_Poder poder;
	
	public void moto(){
		this.posicionX = 0;
		this.posicionY = 0;
		this.tama_Estela = 3;
		this.velocidad = (int) Math.random()*11;
		this.combustible = (int) Math.random()*101;
		this.escudo = false;
		this.items = new List_Item();
		this.poder = new List_Poder();
		
	}

	public int getPosicionX() {
		return posicionX;
		
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
		
	}

	public int getPosicionY() {
		return posicionY;
		
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
		
	}

	public int getTama_Estela() {
		return tama_Estela;
		
	}

	public void setTama_Estela(int tama_Estela) {
		this.tama_Estela = tama_Estela;
		
	}

	public int getVelocidad() {
		return velocidad;
		
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
		
	}

	public int getCombustible() {
		return combustible;
		
	}

	public void setCombustible(int combustible) {
		this.combustible = combustible;
		
	}

	public boolean isEscudo() {
		return escudo;
		
	}

	public void setEscudo(boolean escudo) {
		this.escudo = escudo;
		
	}

	public List_Item getItems() {
		return items;
		
	}

	public void setItems(List_Item items) {
		this.items = items;
		
	}

	public List_Poder getPoder() {
		return poder;
		
	}

	public void setPoder(List_Poder poder) {
		this.poder = poder;
		
	}

}
