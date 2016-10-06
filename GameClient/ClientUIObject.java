package GameClient;

import java.awt.Graphics;

import GameServer.ID;

/**
 * clase padre para los objetos de la interfaz
 * @author pablo
 *
 */
public abstract class ClientUIObject {

	protected int x, y;
	protected ClientID id;
	protected String direction;
	
	
	
	/**
	 * se encarga de las acciones del objeto
	 */
	public abstract void tick();
	
	/**
	 * se encarga de dibujar en la interfaz
	 * @param g
	 */
	public abstract void render(Graphics g);
	
	
	/**
	 * define una posicion x
	 * @param px
	 */
	public void setX(int px){
		x = px;
	}
	
	/**
	 * define una posicion y
	 * @param py
	 */
	public void setY(int py){
		y = py;
	}
	
	/**
	 * obtiene una posicion x
	 * @return posicion x
	 */
	public int getX(){
		return x;
	}
	/**
	 * obtiene una posicion en y
	 * @return	posicion en y
	 */
	public int getY(){
		return y;
	}
	/**
	 * define un ID para el objeto
	 * @param pid
	 */
	public void setID(ClientID pid){
		id = pid;
	}
	/**
	 * obtiene el ID del objeto
	 * @return	ID
	 */
	public ClientID getID(){
		return id;
	}

	public void setDirection(String pdirection) {
		direction = pdirection;
		
	}
	
	

	
}
