package Logic;

/**
 * 
 * @author Andres Rojas
 *
 */

public class Nodo_Combustible extends iNodo_Item{
	private int combustible = (int) Math.random()*101;

	public Nodo_Combustible() {
		super("itemCombustible");
	}	
	
	/**
	 * 
	 * @return int
	 */
	
	public int getCombustible(){
		return combustible;
	}

}
