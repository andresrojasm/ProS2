package GameClient;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class ClientWindow  extends Canvas implements ClientConstants{

	private static final long serialVersionUID = -4808020916777763484L;

	
	
	
	public ClientWindow(ClientUI UI){
		
	JFrame  frame = new JFrame("TRON");
		
	frame.setPreferredSize(new Dimension(CLIENT_WIDTH,CLIENT_HEIGHT));
	frame.setMaximumSize(new Dimension(CLIENT_WIDTH,CLIENT_HEIGHT));
	frame.setMinimumSize(new Dimension(CLIENT_WIDTH,CLIENT_HEIGHT));
		
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setLocationRelativeTo(null);
	frame.add(UI);
	frame.setVisible(true);
	UI.start();
	}
	
}
