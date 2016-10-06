package Server;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import GameServer.ServerHandler;
import GameServer.ServerUI;


/**
 * Crea el socket del servidor
 * @author pablo
 *
 */

public class ServerConnection{
	
	private ServerUI UI;
	private int matrizM, matrizN;
	
	private static int PORT = 8080;
	private ServerSocket serverSocket;
	
	public ServerConnection(ServerUI serverUI, int matrizM, int matrizN) throws IOException{
		this.UI = serverUI;
		this.matrizM = matrizM;
		this.matrizN = matrizN;
		this.RunServer();
		
	}
	
	/**
	 * Inicializa el socket del servidor
	 * @throws IOException
	 */
	public void RunServer() throws IOException{
		
		serverSocket = new ServerSocket(PORT);
		System.out.println("Server Ready for Connections...");
		
		while(true){
			Socket socket = serverSocket.accept();
			new ServerThread(socket, UI, matrizM, matrizN).start();
			System.out.println("Cliente Conectado");
		}
	}
		
	
	
	
}