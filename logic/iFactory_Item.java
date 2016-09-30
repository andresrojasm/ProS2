package Logic;

/**
 * 
 * @author Andres Rojas
 *
 */

public class iFactory_Item {
	
	public iFactory_Item(){}
	
	/**
	 * 
	 * @param numero para determinar que objeto se creara
	 * @return un item
	 */
	
	public iNodo_Item generate_Item(int num){
		
		switch (num){
			case 0: return new Nodo_Combustible();
			case 1: return new Nodo_Estela();
			default: return new Nodo_Bomba();
		}
		
	}

}
