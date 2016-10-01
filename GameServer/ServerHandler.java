package GameServer;

import java.awt.Graphics;
import java.util.LinkedList;

/**Clase que se encarga de colocar los objetos en la ventana
 * 
 * @author pablo
 *
 */
public class ServerHandler {
	
	LinkedList<ServerUIObject> objects = new LinkedList<ServerUIObject>();
	
	/**
	 * se encarga de actualizar las funciones de cada objeto
	 */
	public void tick(){
		for (int i = 0; i <objects.size(); i++){
			ServerUIObject temp = objects.get(i);
			
			temp.tick();
		}
		
	}
	
	/**
	 * se encarga de dibujar cada objeto en la interfaz
	 * @param g
	 */
	public void render(Graphics g){
		for (int i = 0; i <objects.size(); i++){
			ServerUIObject temp = objects.get(i);
			
			temp.render(g);
			
		}
		
	}
	/**
	 * agrega un objeto a la lista de objetos
	 * @param pobject	objeto a agregar
	 */
	public void addObject(ServerUIObject pobject){
		objects.add(pobject);
		
	}
	
	/**
	 * elimina un objeto
	 * @param pobject
	 */
	public void removeObject(ServerUIObject pobject){
		objects.remove(pobject);
	}
	
	/**
	 * obtiene la lista de objetos
	 * @return
	 */
	public LinkedList<ServerUIObject> getObjects() {
		return objects;
	}
	
	
}
