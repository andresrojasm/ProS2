package Client;


import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import GameClient.ClientHandler;
import GameClient.ClientID;
import GameClient.ClientUI;
import GameClient.ClientUIObject;
import GameClient.GamePosition;
import GameClient.Player;

/**
 * se encarga de la conexion con el servidor
 * @author pablo
 *
 */
public class ClientConnection {
	
	public boolean player = false;
	public boolean matrixready = false;

	private ClientUI UI;
	
	private Socket socket;
	
	/**
	 * Constructor
	 * @param clientUI instancia de la interfaz del cliente
	 * @return 
	 * @throws UnknownHostException
	 * @throws IOException
	 * @throws ParseException
	 */
	public ClientConnection(ClientUI clientUI) throws UnknownHostException, IOException, ParseException {
		this.UI = clientUI;
		
		Run();
	}


	/**
	 * Se encarga del envio y llegada de datos de parte del servidor
	 * @throws UnknownHostException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void Run() throws UnknownHostException, IOException, ParseException{
		
		//this.UI.getHandler() = handler;
		
		socket = new Socket("127.0.0.1",8080);
	
		while(true){
			
			
			
			
           /* String readerInput = bufferedReaderFromCommand.readLine();
			printWriter.println("name: "+name+ ", input: " + readerInput);
			System.out.println("desde el server: " + bufferedReaderFromServer.readLine());
			*/
			
			InputStream in = socket.getInputStream();
			//System.out.println("recibido: " + in);
            DataInputStream inx = new DataInputStream(in);
            
            
            JSONParser pa = new JSONParser();
            JSONObject jo1= (JSONObject) pa.parse(inx.readUTF());
            
            
           // System.out.println(jo1.get("msg").toString());
            String[] parts;

            String pos = jo1.get("msg").toString();
            parts = pos.split(",");
            int x = Integer.valueOf(parts[0]);
            int y = Integer.valueOf(parts[1]);
            String ID = parts[2];
            String state = parts[3];
            //System.out.println("Position X:"+x + "     Position Y:"+y );
            
            
            if(matrixready == false){
            	if(ID.equals("Field")){
            		UI.getHandler().getObjects().add(new GamePosition(x,y,ClientID.Field));
            		System.out.println("added field");
            	}
            }
            
            if(ID.equals("Player")){
            	if (player == false){
            		UI.getHandler().getObjects().add(new Player(x,y));
            		player = true;
            		matrixready = true;
            	}
            	else{
            		for(int i = 0; i< UI.getHandler().getObjects().size(); i++){
            			ClientUIObject temp = UI.getHandler().getObjects().get(i);
            			
            			if(temp.getID() == ClientID.Player){
            				temp.setX(x);
            				temp.setY(y);
            			}
            	}
            }
		}
		
	}
	}

}
