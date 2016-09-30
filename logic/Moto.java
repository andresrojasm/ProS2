package Logic;

public class Moto {
	private int posicionX;
	private int posicionY;
	private int tama_Estela;
	private int velocidad;
	private int combustible;
	private boolean escudo;
	private boolean vivo;
	private List_Item items;
	private List_Poder poder;
	
	public void moto(){
		this.posicionX = 0;
		this.posicionY = 0;
		this.tama_Estela = 3;
		this.velocidad = (int) Math.random()*11;
		this.combustible = (int) Math.random()*101;
		this.escudo = false;
		this.vivo = true;
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
	

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public iNodo_Item getItems() {
		return items.show();
		
	}

	public iNodo_Poder getPoder() {
		return poder.peek();
		
	}

	public void setPoder(List_Poder poder) {
		this.poder = poder;
		
	}
	
	public void rotarItem(){
		items.rotar_Item();
		
	}
	
	public void rotarPoder(){
		poder.rotar_Poder();
	}
	
	public void aplicar_Estela(Nodo_Estela nodo){
		this.tama_Estela += nodo.getTama_o();
		
	}
	
	public void aplicar_Bomba(){
		this.vivo = false;
		
	}
	
	public void aplicar_Combustible(Nodo_Combustible nodo){
		if((combustible + nodo.getCombustible()) >= 100){
			this.combustible = 100;
			
		}else{
			this.combustible += nodo.getCombustible();
			
		}
		
	}

}
