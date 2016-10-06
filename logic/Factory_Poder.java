package Logic;

/**
 * 
 * @author Andres Rojas
 *
 */

public class Factory_Poder extends iFactory_Poder{
	
	public Factory_Poder(){
		super();
	
	}
	
	/**
	 * Da la orden de crear un Poder, el cual es creado tanto en categoria como
	 * en tiempo de manera aleatoria
	 */
	public void create(){
		int num = (int) Math.floor(Math.random()*2);
		
		long time = (long) (Math.floor(Math.random()*(10 - (5+1)) +5));
		time*=1000;
		
		super.generate_Poder(num);
		
		try {
			Thread.sleep(time);
			create();

		} catch (InterruptedException e) {
			create();
		}
	}

}
