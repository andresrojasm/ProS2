package GameServer;

import java.awt.Color;
import java.awt.Graphics;

import Matrix.Nodo;
/**
 * determina la estela del jugador en la interfaz
 * @author pablo
 *
 */
public class Trail extends ServerUIObject{

	private Player player;
	private Nodo currentPos;
	private Nodo previousPos;
	private Trail next;
	
	/**
	 * constructor
	 */
	public Trail(){
		
		
	}
	
	
	/**
	 * se encarga de actualizar las acciones del objeto
	 */
	public void tick() {
		
		
	}

	
	/**
	 * se encarga de dibujar en la interfaz
	 */
	public void render(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, 20, 20);
		if(next!= null)
			next.render(g);
		
	}


	
	/**
	 *obtiene la posicion actual
	 * @return	 posicion actual
	 */
	public Nodo getCurrentPos() {
		return currentPos;
	}


/**
 * define la posicion actual y la anterior
 * @param currentPos	posicion actual
 */
	public void setCurrentPos(Nodo currentPos) {
		this.previousPos = currentPos;
		this.currentPos = currentPos;
		this.x=currentPos.getX();
		this.y=currentPos.getY();
		if(next!= null)
			next.setCurrentPos(previousPos);
	}


	/**
	 * obtiene la posicion anterior
	 * @return
	 */
	public Nodo getPreviousPos() {
		return previousPos;
	}


	/**
	 * define la posicion anterior
	 * @param previousPos
	 */
	public void setPreviousPos(Nodo previousPos) {
		this.previousPos = previousPos;
	}

	/**
	 * obtiene la siguiente estela
	 * @return
	 */

	public Trail getNext() {
		return next;
	}


	/**
	 * define la siguiente estela
	 * @param next
	 */
	public void setNext(Trail next) {
		this.next = next;
	}
	
	
}
