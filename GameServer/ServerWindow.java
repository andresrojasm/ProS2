package GameServer;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;
/**
 * se encarga de crear la ventana de la interfaz del servidor
 * @author pablo
 *
 */
public class ServerWindow extends Canvas implements ServerConstants{
	
	public ServerWindow(ServerUI UI){
		JFrame  frame = new JFrame("TRON Server");
		
		frame.setPreferredSize(new Dimension(SERVER_WIDTH,SERVER_HEIGHT));
		frame.setMaximumSize(new Dimension(SERVER_WIDTH,SERVER_HEIGHT));
		frame.setMinimumSize(new Dimension(SERVER_WIDTH,SERVER_HEIGHT));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(UI);
		frame.setVisible(true);
		UI.start();
	}
	
}
