package Server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import org.json.JSONException;
import org.json.JSONObject;

import GameServer.Player;
import GameServer.ServerHandler;
import GameServer.ServerUI;
import GameServer.ServerUIObject;
import Matrix.Nodo;

/**
 * Crea el hilo que conectara con el cliente
 * @author pablo
 *
 */

public class ServerThread extends Thread{

	private Socket _socket;
	private JSONObject _jsonObject;
	
	private BufferedReader reader;
	private PrintWriter printWriter;
	private DataInputStream input;
	private DataOutputStream output;
	
	private ServerUI UI;
	private int matrizM;
	private int matrizN;
	
	
	
	/**
	 * Constructor
	 * @param psocket socket del servidor
	 * @param UI	Interfaz del servidor
	 * @param matrizM	valor M de la matriz
	 * @param matrizN	valor N de la matriz
	 */
	public ServerThread(Socket psocket, ServerUI UI, int matrizM, int matrizN){
		this.UI = UI;
		this._socket = psocket;
		this.matrizM = matrizM;
		this.matrizN = matrizN;
	}
	
	

	/**
	 * se encarga del envio y llegada de datos por parte de los clientes
	 */
	public void run(){
		try {
			
			if(UI.player1 ==false){
				Nodo tmp1 = UI.matriz.Search(0,0);
				UI.getHandler().addObject(new Player(tmp1,"right"));
				UI.player1 = true;
			}
			/*String tempInfoMatriz = Integer.toString(matrizM)+","+Integer.toString(matrizN)+","+"Matriz";
			String msgMatriz = null;
			JSONObject jo; // declared locally so that it destroys after serving its purpose
			jo = new JSONObject();
			jo.put("msg", tempInfoMatriz);
			
			input = new DataInputStream(_socket.getInputStream());
			
			msgMatriz = jo.toString();
			
			output = new DataOutputStream(_socket.getOutputStream());
			output.writeUTF(jo.toString());
			*/
			
			
			while(true){
			String message = null;
			/*printWriter = new PrintWriter(_socket.getOutputStream(),true);
			reader = new BufferedReader(new InputStreamReader(_socket.getInputStream()));
			System.out.println("user "+ reader.readLine()+" connected");*/
			
			//while((message = reader.readLine()) != null){
				//System.out.println(message);
				//SendJSON();
				//printWriter.println("Server Response: "+"Client Message: " + message);
			for (int i = 0; i <UI.getHandler().getObjects().size(); i++){	
				ServerUIObject temp = UI.getHandler().getObjects().get(i);
				
				String tempID = temp.getID().toString();
				String tempInfo = Integer.toString(temp.getX())+","+Integer.toString(temp.getY())+","+tempID+","+temp.getState();
				
				JSONObject jo1; // declared locally so that it destroys after serving its purpose
				jo1 = new JSONObject();
				jo1.put("msg", tempInfo);
	            
				System.out.println("sending JSON: " + jo1);
				input = new DataInputStream(_socket.getInputStream());
				
				message = jo1.toString();
				
				output = new DataOutputStream(_socket.getOutputStream());
				//printWriter = new PrintWriter(output);
				//printWriter.println(output);
				//printWriter.flush();
				//output.writeBytes(message + "\n");
				
				//reader= new BufferedReader(new InputStreamReader(input));
				//printWriter.println(message);
				
				output.writeUTF(jo1.toString());
				//System.out.println("sent JSON: " + output);
			
				//_socket.close();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public void SendJSON(){
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("a", "150,170,ground");
			
			DataOutputStream output = new DataOutputStream(_socket.getOutputStream());
			
			output.writeUTF(jsonObject.toString());
			System.out.println(output.toString());
			
			
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
