package GameClient;

import java.awt.Graphics;
import java.util.LinkedList;

import GameServer.ServerUIObject;


/**
 * Se encarga de la actualizacion y dibujado de los elementos en la interfaz grafica
 * @author pablo
 *
 */
public class ClientHandler {

	LinkedList<ClientUIObject> objects = new LinkedList<ClientUIObject>();
	
	
	/**
	 * Actualiza los elementos de la interfaz
	 */
	public void tick(){
		for(int i = 0; i <objects.size();i++){
			ClientUIObject temp = objects.get(i);
			
			temp.tick();
		}
		
		
	}
	
	/**
	 * Dibuja los elementos de la interfaz
	 * @param g
	 */
	public void render(Graphics g){
		for(int i = 0; i <objects.size();i++){
			ClientUIObject temp = objects.get(i);
			
			temp.render(g);
		}
		
	}
	
	/**
	 * agrega un objeto a la lista objects
	 * @param object
	 */
	public void addObject(ClientUIObject object){
		this.objects.add(object);
		
	}
	
	/**
	 * remueve un objeto de la lista objects
	 * @param object
	 */
	public void removeObject(ClientUIObject object){
		this.removeObject(object);
		
	}

	
	/**
	 * obtiene la lista de objetos
	 * @return
	 */
	public LinkedList<ClientUIObject> getObjects() {
		return objects;
	}
	
	
	
	
}
