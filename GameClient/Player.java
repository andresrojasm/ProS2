package GameClient;

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
public class Player extends ClientUIObject {
	
	private Nodo currentPos;
	private Nodo previousPos;
	private String direction = "right";
	//private Trail trail;
	private Timer timer = new Timer();
	private long beginTime, timeTaken;
	private int speed = 6;
	private int speedcount=0;
	
    
	
	/**
	 * constructor
	 * @param field 
	 * @param nodo	posicion en donde se creara el objeto
	 */
	public Player(int x, int y){
		
		this.x= x;
		this.y = y; 
		
		id = ClientID.Player;
		
		
		/*currentPos = nodo;
		previousPos = nodo;
		x =	currentPos.getX();
		y = currentPos.getY();
		id = ClientID.Player;
		
		
		beginTime = System.nanoTime();
		*/
		 
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
		
		
	}

	

	
	
	
	/**
	 * se encarga del movimiento del jugador
	 */
	public void Move(){
		
		speedcount++;
		
		/**if (speedcount == speed){
		
		if (direction == "right"){
			if (currentPos.getRight()==null){
				direction = "down";
				speedcount=0;
			}else{ 
				Nodo tmp = currentPos;
				currentPos = currentPos.getRight();
				previousPos = tmp;
				this.setX(currentPos.getX());
				this.setY(currentPos.getY());
				
				speedcount=0;
			}
				
		}
		if (direction == "down"){
			if (currentPos.getDown()==null){
				direction = "left";
				speedcount=0;
			}else{ 
				Nodo tmp = currentPos;
				currentPos = currentPos.getDown();
				previousPos = tmp;
				this.setX(currentPos.getX());
				this.setY(currentPos.getY());
				
				speedcount=0;
			}
				
		}
		if (direction == "left"){
			if (currentPos.getLeft()==null){
				direction = "up";
				speedcount=0;
			}else{ 
				Nodo tmp = currentPos;
				currentPos = currentPos.getLeft();
				previousPos = tmp;
				this.setX(currentPos.getX());
				this.setY(currentPos.getY());
				
				speedcount=0;
			}
				
		}
		if (direction == "up"){
			if (currentPos.getUp()==null){
				direction = "right";
				speedcount=0;
			}else{ 
				Nodo tmp = currentPos;
				currentPos = currentPos.getUp();
				previousPos = tmp;
				this.setX(currentPos.getX());
				this.setY(currentPos.getY());
				
				speedcount=0;
			}
				
		}
		
		}	*/
		
	}




	



}