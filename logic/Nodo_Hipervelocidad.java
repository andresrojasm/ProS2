package Logic;

/**
 * 
 * @author Andres Rojas
 *
 */

public class Nodo_Hipervelocidad extends iNodo_Poder {
	int velocidad = (int) Math.floor(Math.random()*11);
	
	public Nodo_Hipervelocidad(){
		super("poderHipervelocidad");
	}
	
	/**
	 * 
	 * @return int
	 */
	
	public int getVelocidad(){
		return velocidad;
	}
	

}
