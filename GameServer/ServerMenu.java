package GameServer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.LinkedList;

import GameServer.ServerUI.STATE;
import Matrix.Matriz;
import Matrix.Nodo;
import Server.Server;

public class ServerMenu extends MouseAdapter implements ServerConstants{
	
	private ServerUI UI;
	private ServerHandler handler;
	private int matrizM = 6;
	private int matrizN = 6;
	
	
	/**
	 * constructor
	 * @param pUI	clase principal que la instancia
	 * @param phandler	handler que se encarga de actualizar los objetos
	 */
	public ServerMenu(ServerUI pUI, ServerHandler phandler){
		UI = pUI;
		handler = phandler;
	}
	
	/**
	 * accion para cuando el mouse es presionado
	 */
	public void mousePressed(MouseEvent e){
		int mx = e.getX();
		int my = e.getY();
		
		if(UI.gameState == STATE.Menu){
		
			//boton RUN
		if(mouseOver(mx, my, 250, 200, 200, 64)){
			UI.gameState = STATE.Game;
			
			
			UI.matriz = new Matriz(matrizM, matrizN);
			
			
			
			
			for( int i = 0; i < matrizM; i++){
				for( int j = 0; j < matrizN; j++){
					Nodo tmp = UI.matriz.Search(i,j);
					handler.addObject(new GamePosition(tmp.getX(),tmp.getY(),ID.Field));
				}
			}
			Nodo tmp1 = UI.matriz.Search(0,0);
			handler.addObject(new Player(tmp1));
			
			
			
		}
		
		if(mouseOver(mx, my, 350, 350, 30, 20)){
			if (matrizM ==18){
				matrizM += 0;
			}else matrizM +=1;
		}
		if(mouseOver(mx, my, 350, 380, 30, 20)){
			if (matrizM ==4){
				matrizM -= 0;
			}else matrizM -=1;
		}
		if(mouseOver(mx, my, 430, 350, 30, 20)){
			if (matrizN ==15){
				matrizN += 0;
			}else matrizN +=1;
		}
		if(mouseOver(mx, my, 430, 380, 30, 20)){
			if (matrizN ==4){
				matrizN -= 0;
			}else matrizN -=1;
		}
		if(mouseOver(mx, my, 590, 420, 80, 40)){
			System.exit(1);
		}
		}
		if(mouseOver(mx, my, 590, 420, 80, 40)){
			UI.gameState = STATE.Menu;
			handler.getObjects().clear();
		}
	}
	
	/**
	 * accion para cuando el mouse deja de presionarse
	 */
	public void mouseReleased(MouseEvent e){
		
		
	}
	
	/**
	 * determina si el mouse esta en cierta posicion para presionar un boton
	 * @param mx	x del mouse
	 * @param my	y del mouse
	 * @param x		x inicial del boton
	 * @param y		y iniciarl del boton
	 * @param width		x final del boton
	 * @param height	y final del boton
	 * @return	boolean
	 */
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height){
		if(mx > x && mx< x + width){
			if(my > y && my < y + height){
				return true;
			}
			else return false;
		}
		else return false; 
		
	}
	
	/**
	 * actualiza las funciones de la clase
	 */
	public void tick(){
		
		
		
	}

	/**
	 * se encarga de dibujar en la interfaz
	 * @param g
	 */
	public void render(Graphics g){
		Font fnt = new Font("Calibri",1,50);
		Font fnt2 = new Font("Calibri",1,30);

		
		g.setColor(Color.black);
		g.fillRect(0, 0, SERVER_WIDTH, SERVER_HEIGHT);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("TRON SERVER", 220,100);
		
		
		
		g.drawRect(250, 200, 200, 64);
		g.drawString("RUN",300,250);
		
		//g.drawRect(580, 400, 100, 64);
		//g.drawString("Exit",585,450);
		
		g.setFont(fnt2);
		g.drawString("MAPA",250,320);
		g.drawString(String.valueOf(matrizM),360,320);
		g.drawString("x",400,320);
		g.drawString(String.valueOf(matrizN),440,320);
		
		g.drawRect(590, 420, 80, 40);
		g.drawString("EXIT",600,450);
		
		g.drawRect(350, 350, 30, 20);
		g.drawRect(350, 380, 30, 20);
		g.drawRect(430, 350, 30, 20);
		g.drawRect(430, 380, 30, 20);
		
		g.setFont(fnt2);
		g.drawString("+",358,369);
		g.drawString("+",438,369);
		
		g.drawString("-",360,399);
		g.drawString("-",440,399);
		
		
	}

	
	
	/**
	 * obtiene la cantidad de filas de la matriz
	 * @return	cantidad de filas
	 */
	
	public int getMatrizM() {
		return matrizM;
	}
	
	/**
	 * define la cantidad de filas de la matriz
	 * @param matrizM	cantidad de filas
	 */
	public void setMatrizM(int matrizM) {
		this.matrizM = matrizM;
	}

	/**
	 * obtiene la cantidad de columnas de la matriz
	 * @return	cantidad de columnas
	 */
	public int getMatrizN() {
		return matrizN;
	}
	/**
	 * define la cantidad de columnas de la matriz
	 * @param matrizN	cantidad de columnas
	 */
	public void setMatrizN(int matrizN) {
		this.matrizN = matrizN;
	}
	
	
	
	
}
