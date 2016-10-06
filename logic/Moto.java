package Logic;

/**
 * 
 * @author Andres Rojas
 *
 */

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

	/**
	 * 
	 * Posicion en el eje X
	 * 
	 * @return int
	 */
	
	public int getPosicionX() {
		return posicionX;
		
	}
	
	/**
	 * 
	 * Modifica la posicion en el eje X
	 * 
	 * @param int posicionX
	 */
	
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
		
	}
	
	/**
	 * 
	 * Posicion en el eje Y
	 * 
	 * @return int 
	 */

	public int getPosicionY() {
		return posicionY;
		
	}

	/**
	 * 
	 * Modifica la posicion en el eje Y
	 * 
	 * @param int posicionY
	 */
	
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
		
	}

	/**
	 * Devuelve el tama_o de la estela
	 * 
	 * @return int
	 */
	
	public int getTama_Estela() {
		return tama_Estela;
		
	}

	/**
	 * 
	 * Recive un entero que modificara el tama_o de la estela
	 * 
	 * @param int ptama_Estela
	 */
	
	public void setTama_Estela(int ptama_Estela) {
		this.tama_Estela = ptama_Estela;
		
	}

	/**
	 * Devuelve la velocidad del vehiculo
	 * 
	 * @return int
	 */
	
	public int getVelocidad() {
		return velocidad;
		
	}
	
	/**
	 * 
	 * Recive un integer el cual modifica la velocidad del vehiculo
	 * 
	 * @param int velocidad
	 */
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
		
	}
	
	/**
	 * Devuelve la cantidad de conbustivle que posee
	 * 
	 * @return int
	 */
	
	public int getCombustible() {
		return combustible;
		
	}

	/**
	 * 
	 * Recive un integer que modifica el valor de la variable combustible
	 * 
	 * @param int combustible
	 */
	
	public void setCombustible(int combustible) {
		this.combustible = combustible;
		
	}

	/**
	 * Devuelve un boolean que determina el estado del vehiculo
	 * 
	 * @return boolean
	 */
	
	public boolean isEscudo() {
		return escudo;
		
	}

	/**
	 * Recive un boolean el cual modifica el estado del escudo
	 * 
	 * @param boolean escudo
	 */
	
	public void setEscudo(boolean escudo) {
		this.escudo = escudo;
		
	}
	
	/**
	 * Ve si se encuenta rivo o si no
	 * @return boolean
	 */

	public boolean isVivo() {
		return vivo;
	}

	/**
	 * Recive un boolean que modifica este estado
	 * 
	 * @param boolean vivo
	 */
	
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	/**
	 * Muestra el primer elemento de nuestra lista
	 * @return iNodo_Item
	 */
	
	public iNodo_Item getItems() {
		return items.show();
		
	}

	/**
	 * Muestra el primer elemento de la lista de poderes
	 * 
	 * @return iNodo_Poder 
	 */
	
	public iNodo_Poder getPoder() {
		return poder.peek();
		
	}

	/**
	 * Recive un iNodo_Item que se a_ade en la cola
	 * 
	 * @param iNodo_Item item
	 */
	
	public void addItem(iNodo_Item item) {
		this.items.enqueue(item);
		
	}
	
	/**
	 * Recive un iNodo_Poder que se a_ade en la pila
	 * 
	 * @param iNodo_Poder poder
	 */
	
	public void addPoder(iNodo_Poder poder) {
		this.poder.push(poder);
		
	}
	
	/**
	 * Rota la lista de items pasando el ultimo a primero
	 */
	
	public void rotarItem(){
		items.rotar_Item();
		
	}
	
	/**
	 * Rota la lista de poderes pasando el ultimo a primero
	 */
	
	public void rotarPoder(){
		poder.rotar_Poder();
	}
	
	/**
	 * Al encontrar un item de este tipo modifica el tama_o de la estela
	 * 
	 * @param nodo, contiene un int
	 */
	
	public void aplicar_Estela(Nodo_Estela nodo){
		this.tama_Estela += nodo.getTama_o();
		
	}
	
	/**
	 * Si encuentra una bomba cambia el estado para que se "destruya"
	 */
	
	public void aplicar_Bomba(){
		this.vivo = false;
		
	}
	
	/**
	 * 
	 * @param Nodo combustible el cual contiene un numero aleatorio
	 * 			el cual se suma al combustible del vehiculo  
	 */
	
	public void aplicar_Combustible(Nodo_Combustible nodo){
		if((combustible + nodo.getCombustible()) >= 100){
			this.combustible = 100;
			
		}else{
			this.combustible += nodo.getCombustible();
			
		}
		
	}
	/**
	 * Al encontrar un escudo lo setea a true
	 */
	public void aplicar_Escudo(){
		this.escudo = true;
	}
	
	/**
	 * Afecta temporalmente la velocidad del vehiculo
	 * 
	 * @param Nodo_Hipervelocidad nodo
	 */
	
	public void aplicar_Hipervelocidad(Nodo_Hipervelocidad nodo){
		this.velocidad += nodo.getVelocidad();
		
		try {
			Thread.sleep(5000);
			this.velocidad -= nodo.getVelocidad();
		} catch (InterruptedException e) {}
	}
	/**
	 * Aplica al vehiculo el poder que sigue en la pila
	 */
	public void aplicar_Poder(){
		iNodo_Poder tmp = poder.pop();
		String nombre = tmp.getDato();
		
		switch(nombre){
			case "poderEscudo": aplicar_Escudo();
				break;
			case "poderHipervelocidad":Nodo_Hipervelocidad nodo = (Nodo_Hipervelocidad) poder.pop(); 
				aplicar_Hipervelocidad(nodo);
				break;
		}
		
	}
	/**
	 * Aplica al vehiculo el poder que sigue en la cola
	 */
	public void aplicar_Item(){
		iNodo_Item tmp = items.dequeue();
		String nombre = tmp.getDato();
		
		switch(nombre){
			case "itemBomba": aplicar_Bomba();
				break;
			case "itemEstela":Nodo_Estela nodo = (Nodo_Estela) items.dequeue(); 
				aplicar_Estela(nodo);
				break;
			case "itemCombustible": Nodo_Combustible nodo2 = (Nodo_Combustible) items.dequeue();
				aplicar_Combustible(nodo2);
				break;
		}
	}

}
