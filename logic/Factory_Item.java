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
	/**
	 * Da la orden de crear un Item, el cual es creado tanto en categoria como
	 * en tiempo de manera aleatoria
	 */
	public void create(){
		int num = (int) Math.floor(Math.random()*3);
		
		long time = (long) (Math.floor(Math.random()*(10 -(5+1)) +5));
		time*=1000;
		
		super.generate_Item(num);
		
		try {
			Thread.sleep(time);
			create();

		} catch (InterruptedException e) {
			create();
		}
		
	}
}
