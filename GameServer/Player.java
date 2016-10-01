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
public class Player extends ServerUIObject{
	
	private Nodo currentPos;
	private Nodo previousPos;
	private String direction = "right";
	private Trail trail;
	private Timer timer = new Timer();
	private long beginTime, timeTaken;
    
	
	/**
	 * constructor
	 * @param nodo	posicion en donde se creara el objeto
	 */
	public Player(Nodo nodo){
		
		currentPos = nodo;
		previousPos = nodo;
		x =	currentPos.getX();
		y = currentPos.getY();
		id = ID.Player;
		trail = new Trail();
		trail.setNext(new Trail());
		
		
		beginTime = System.nanoTime();
		
		 
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
		g.fillRect(x, y, 30, 30);
		trail.render(g);
		
	}

	

	
	
	
	/**
	 * se encarga del movimiento del jugador
	 */
	public void Move(){
		
		
		if (direction == "right"){
			if (currentPos.getRight()==null){
				direction = "down";
			}else{ 
				Nodo tmp = currentPos;
				currentPos = currentPos.getRight();
				previousPos = tmp;
				this.setX(currentPos.getX());
				this.setY(currentPos.getY());
				trail.setCurrentPos(previousPos);
			}
				
		}
		if (direction == "down"){
			if (currentPos.getDown()==null){
				direction = "left";
			}else{ 
				Nodo tmp = currentPos;
				currentPos = currentPos.getDown();
				previousPos = tmp;
				this.setX(currentPos.getX());
				this.setY(currentPos.getY());
				trail.setCurrentPos(previousPos);
			}
				
		}
		if (direction == "left"){
			if (currentPos.getLeft()==null){
				direction = "up";
			}else{ 
				Nodo tmp = currentPos;
				currentPos = currentPos.getLeft();
				previousPos = tmp;
				this.setX(currentPos.getX());
				this.setY(currentPos.getY());
				trail.setCurrentPos(previousPos);
			}
				
		}
		if (direction == "up"){
			if (currentPos.getUp()==null){
				direction = "right";
			}else{ 
				Nodo tmp = currentPos;
				currentPos = currentPos.getUp();
				previousPos = tmp;
				this.setX(currentPos.getX());
				this.setY(currentPos.getY());
				trail.setCurrentPos(previousPos);
			}
				
		}
	}



}
