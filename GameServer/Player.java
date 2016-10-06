package GameServer;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import Matrix.Nodo;

/**
 * se encarga de dibujar al jugador en la interfaz
 * @author pablo
 *
 */
public class Player extends ServerUIObject {
	private Nodo currentPos;
	private Nodo previousPos;
	private Trail trail;
	private Timer timer = new Timer();
	private long beginTime, timeTaken;
	private int speed = 6;
	private int speedcount=0;
	
    
	
	/**
	 * constructor
	 * @param nodo	posicion en donde se creara el objeto
	 */
	public Player(Nodo nodo, String pdirection){
		
		currentPos = nodo;
		previousPos = nodo;
		x =	currentPos.getX();
		y = currentPos.getY();
		id = ID.Player;
		trail = new Trail();
		trail.setNext(new Trail());
		
		direction = pdirection;
		
		
		
		
		 
	}


	
	/**
	 * se encarga de actualizar las acciones del objeto
	 */
	public void tick() {
		
		Move();
		
	
	}	
		
	

	
	


	/**
	 * se encarga de dibujar al jugador en la interfaz
	 */
	public void render(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, 20, 20);
		trail.render(g);
		
	}

	

	
	
	
	/**
	 * se encarga del movimiento del jugador
	 */
	public void Move(){
		
		speedcount++;
		
		if (speedcount == speed){
		
		if (direction == "right"){
			if (currentPos.getRight()==null){
				//direction = "down";
				currentPos = currentPos;
				speedcount=0;
			}else{ 
				Nodo tmp = currentPos;
				currentPos = currentPos.getRight();
				previousPos = tmp;
				this.setX(currentPos.getX());
				this.setY(currentPos.getY());
				trail.setCurrentPos(previousPos);
				speedcount=0;
			}
				
		}
		if (direction == "down"){
			if (currentPos.getDown()==null){
				//direction = "left";
				currentPos = currentPos;
				speedcount=0;
			}else{ 
				Nodo tmp = currentPos;
				currentPos = currentPos.getDown();
				previousPos = tmp;
				this.setX(currentPos.getX());
				this.setY(currentPos.getY());
				trail.setCurrentPos(previousPos);
				speedcount=0;
			}
				
		}
		if (direction == "left"){
			if (currentPos.getLeft()==null){
				//direction = "up";
				currentPos = currentPos;
				speedcount=0;
			}else{ 
				Nodo tmp = currentPos;
				currentPos = currentPos.getLeft();
				previousPos = tmp;
				this.setX(currentPos.getX());
				this.setY(currentPos.getY());
				trail.setCurrentPos(previousPos);
				speedcount=0;
			}
				
		}
		if (direction == "up"){
			if (currentPos.getUp()==null){
				//direction = "right";
				currentPos = currentPos;
				speedcount=0;
			}else{ 
				Nodo tmp = currentPos;
				currentPos = currentPos.getUp();
				previousPos = tmp;
				this.setX(currentPos.getX());
				this.setY(currentPos.getY());
				trail.setCurrentPos(previousPos);
				speedcount=0;
			}
				
		}
		
		}	
		
	}


	
	



}
