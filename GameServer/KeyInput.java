package GameServer;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private ServerHandler handler;
	
	
	public KeyInput(ServerHandler handler){
		
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		for(int i = 0; i< handler.getObjects().size(); i++){
			ServerUIObject temp = handler.getObjects().get(i);
			
			if(temp.getID() == ID.Player){
				
				if (key == KeyEvent.VK_LEFT){
					if(temp.getDirection() == "right"){
						temp.setDirection("right");	
					}
					else temp.setDirection("left");
			
				}
				
				if (key == KeyEvent.VK_RIGHT){
					if(temp.getDirection() == "left"){
						temp.setDirection("left");	
					}
					else temp.setDirection("right");
	
				}
				if (key == KeyEvent.VK_UP){
					if(temp.getDirection() == "down"){
						temp.setDirection("down");	
					}
					else temp.setDirection("up");
				}
				
				if (key == KeyEvent.VK_DOWN){
					if(temp.getDirection() == "up"){
						temp.setDirection("up");	
					}
					else temp.setDirection("down");
				}
			}
		}
		
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
	}
	
	
}
