package GameClient;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.io.IOException;

import org.json.simple.parser.ParseException;


import Client.ClientConnection;

/**
 * Clase principal del la interfaz del cliente
 * @author pablo
 *
 */
public class ClientUI extends Canvas implements Runnable, ClientConstants{

	private static final long serialVersionUID = -6608737580938432523L;

	private Thread thread;
	private boolean running = false;
	private ClientHandler handler;
	
	private ClientConnection client;
	
	/**
	 * constructor 
	 */
	public ClientUI(){
		new ClientWindow(this);
		
		handler = new ClientHandler();
		
		this.addKeyListener(new KeyInput(handler));
		
		
		try{
			client = new ClientConnection(this);
		}catch (IOException e){
			e.printStackTrace();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
	
	/**
	 * inicializa el thread del programa
	 */
	public synchronized void start(){
		
		thread = new Thread(this);
		thread.start();
		running = true;
		
	}
	
	/**
	 * Detiene el thread del programa
	 */
	public synchronized void stop(){
		try{
			thread.join();
			running = false;
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * Loop del programa, tomado del usuario de youtube RealTutsGML
	 */
	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		
		while (running){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1){
				tick();
				delta--;
			}
			if (running){
				render();
			}
			frames++;
			
			
			if (System.currentTimeMillis() - timer > 1000){
				
				timer+= 1000;
				System.out.println("FPS: " + frames);
				frames = 0;
			}
			
		}
		stop();
	}
	
	
	
	
	
	
	/**
	 * dibuja los elementos en la interfaz
	 */
	
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs ==null){
			this.createBufferStrategy(2);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.black);
		g.fillRect(0, 0, CLIENT_WIDTH, CLIENT_HEIGHT);
		
		handler.render(g);
		
		
		g.dispose();
		bs.show();
	}

	/**
	 * actualiza los elementos de la interfaz
	 */
	private void tick() {

		handler.tick();
	}

/**
 * main del programa
 * @param args
 */
	public static void main(String args[]){
		
		new ClientUI();
	}

/**
 * Obtiene el handler del cliente
 * @return
 */
	public ClientHandler getHandler() {
	
		return handler;
	}

}
