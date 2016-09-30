package Logic;

/**
 * 
 * @author Andres Rojas 
 *
 */

public class Factory_Item extends iFactory_Item{
	
	public Factory_Item(){
		super();
		
	}
	
	public void create(){
		int num = (int) Math.random()*4;
		
		super.generate_Item(num);
		
	}
}
