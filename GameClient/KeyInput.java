package GameClient;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import GameServer.ID;
import GameServer.ServerUIObject;

public class KeyInput extends KeyAdapter{
	
	private ClientHandler handler;
	
	
	public KeyInput(ClientHandler handler){
		
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		for(int i = 0; i< handler.getObjects().size(); i++){
			ClientUIObject temp = handler.getObjects().get(i);
			
			if(temp.getID() == ClientID.Player){
				
				if (key == KeyEvent.VK_LEFT){
					
					temp.setDirection("left");
			
				}
				
				if (key == KeyEvent.VK_RIGHT){
					
					temp.setDirection("right");
	
				}
				if (key == KeyEvent.VK_UP){
					
					temp.setDirection("up");
				}
				
				if (key == KeyEvent.VK_DOWN){
					
					temp.setDirection("down");
				}
			}
		}
		
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
	}
	
	
}
