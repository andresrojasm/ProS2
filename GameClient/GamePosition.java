package GameClient;

import java.awt.Color;
import java.awt.Graphics;


/**
 * Se encarga de dibujar las casillas del juego por donde se moveran las entidades
 * @author pablo
 *
 */
public class GamePosition extends ClientUIObject{

	
	/**
	 * constructor
	 * @param x		ubicacion en x
	 * @param y		ubicacion en y
	 * @param id	Id para identificar el tipo que es
	 */
	public GamePosition(int x, int y, ClientID id){
		this.x = x;
		this.y = y;
		this.id = id;
		
		
	}
	
	
	/**
	 * se encarga de actualizar las acciones del objeto
	 */
	public void tick() {
		
		
	}

	/**
	 * se encarga de dibujar el objeto en la interfaz
	 */
	public void render(Graphics g) {
		
		g.setColor(Color.white);
		g.drawRect(x, y, 20, 20);
	}

}
