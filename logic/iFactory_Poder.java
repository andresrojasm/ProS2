package Logic;

/**
 * 
 * @author Andres Rojas
 *
 */

public class iFactory_Poder {
	
	public iFactory_Poder(){}
	
	/**
	 * 
	 * @param numero para determinar que objeto se creara
	 * @return un poder
	 */
	
	public iNodo_Poder generate_Poder(int num){
		
		switch (num){
			case 0:return new Nodo_Escudo();
			default:return new Nodo_Hipervelocidad();
		}
		
	}

}
