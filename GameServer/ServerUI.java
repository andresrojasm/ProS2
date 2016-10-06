package GameServer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferStrategy;
import java.io.IOException;


import Matrix.Matriz;
import Server.ServerConnection;

/**
 * Clase que contiene el main del servidor del juego, inicializa la interfaz del servidor
 * @author pablo
 *
 */

public class ServerUI extends Canvas implements Runnable, ServerConstants{

	private Thread thread;
	private boolean running = false;
	private ServerHandler handler;
	public Matriz matriz;
	private ServerMenu menu;
	private int matrizM;
	private int matrizN;
	public ServerConnection server;
	public boolean player1 = false;
	
	/**
	 * enumerador con los estados de la interfaz del servidor
	 * @author pablo
	 *
	 */
	public enum STATE{
		Menu,
		Game;
	};
	
	public STATE gameState = STATE.Menu;	/** estado del servidor */
	
	
	/**
	 * Constructor de la clase
	 * @param none
	 * @throws IOException 
	 */
	public ServerUI() throws IOException{
		
		handler = new ServerHandler();
		this.addKeyListener(new KeyInput(handler));
		menu = new ServerMenu(this, handler);
		this.addMouseListener(menu);
		new ServerWindow(this);
		server = new ServerConnection(this, matrizM, matrizM);
		
		
		
		if (gameState == STATE.Game){
			matrizM = menu.getMatrizM();
			matrizN = menu.getMatrizN();
			matriz = new Matriz(matrizM, matrizN);
			matriz.SearchAll(matrizM, matrizN);
			
			server = new ServerConnection(this,matrizM,matrizN);
			server.RunServer();
			
			
		}
		
		
	}
	
	/**
	 * inicia el hilo del servidor
	 */
	public synchronized void start(){
		thread = new Thread(this);
		thread.start();	// inicializa el thread
		running = true;
	}
	
	/**
	 * detiene el hilo
	 */
	public synchronized void stop(){
		try{
			thread.join();
			running = false;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		running = true;
	}
	
	/**
	 * Game loop. tomado del usuario de Youtube RealTutsGML
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
	 * se encarga de dibujar en la interfaz
	 */
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null){
			this.createBufferStrategy(2);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.gray);
		g.fillRect(0, 0, SERVER_WIDTH, SERVER_HEIGHT);
		
		g.setColor(Color.black);
		g.fillRect(560, 0, SERVER_WIDTH, SERVER_HEIGHT);
		
		handler.render(g);
		
		if (gameState == STATE.Game){
			Font fnt2 = new Font("Calibri",1,30);
			g.setFont(fnt2);
			g.setColor(Color.white);
			g.drawRect(590, 420, 80, 40);
			g.drawString("BACK",600,450);
		}
		else if (gameState == STATE.Menu){
			handler.getObjects().clear();
			menu.render(g);
		}
		
		
		
		g.dispose();
		bs.show();
	}

	/**
	 * actualiza las acciones del objeto
	 */
	private void tick() {
		handler.tick();
		
		if (gameState == STATE.Game){
			
		}
		else if (gameState == STATE.Menu){
			menu.tick();
		}
		
	}

	/**
	 * main de la clase
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException{
		
		new ServerUI();
	}

	/**
	 * obtiene el valor M de la matriz
	 * @return
	 */
	public int getMatrizM() {
		return matrizM;
	}
	/**
	 * Define el valor M de la matriz
	 * @param matrizM
	 */
	public void setMatrizM(int matrizM) {
		this.matrizM = matrizM;
	}

	/**
	 * obtiene el valor N de la matriz
	 * @return
	 */
	public int getMatrizN() {
		return matrizN;
	}
	/**
	 * Define el valor N de la matriz
	 * @param matrizM
	 */
	public void setMatrizN(int matrizN) {
		this.matrizN = matrizN;
	}

	/**
	 * retorna el handler del Servidor
	 * @return
	 */
	public ServerHandler getHandler() {
		return handler;
	}


	
	
	
	

	

	
	
}
