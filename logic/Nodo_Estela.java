package Logic;

/**
 * 
 * @author Andres Rojas
 *
 */

public class Nodo_Estela extends iNodo_Item {
	private int tama_o = (int) Math.random()*11;
	
	public Nodo_Estela(){
		super("itemEstela");
	}
	
	public int getTama_o(){
		return tama_o;
	}

}
