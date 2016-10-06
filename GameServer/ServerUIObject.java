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
	protected String state;
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

	/**
	 * retorna el estado del objeto
	 * @return
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Define el estado del objeto
	 * @param pstate
	 */
	public void setState(String pstate){
		state = pstate;
	}
	
	

	public String getDirection() {
		return direction;
	}



	public void setDirection(String direction) {
		this.direction = direction;
	}


}
