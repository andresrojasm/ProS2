package GameServer;

import java.awt.Graphics;

/**
 * clase padre para los objetos de la interfaz
 * @author pablo
 *
 */
public abstract class ServerUIObject {

	protected int x, y;
	protected ID id;
	
	
	/*public ServerUIObject(int x, int y, ID id){
		this.x = x;
		this.y = y;
		this.id = id;
	}*/
	
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
	public void setID(ID pid){
		id = pid;
	}
	/**
	 * obtiene el ID del objeto
	 * @return	ID
	 */
	public ID getID(){
		return id;
	}
	
	
	
	
	
}
