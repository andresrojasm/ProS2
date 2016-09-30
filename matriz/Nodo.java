package Matrix;
/**
 * Clase que representa cada nodo de la matriz
 * @author Carlos Alberto
 *
 */
public class Nodo {
	
	private Nodo up,down,left,right;
	private int data, x, y;
	
	/**
	 * Constructor
	 * @param px	posicion x en el mapa
	 * @param py	posicion y en el mapa
	 */
	public Nodo(int px, int py){
		data = 0;
		x = px; 							/** posicion en x*/
		y = py;								/** posicion en y*/
		up = down = left = right = null;	/** referencias a los nodos siguientes*/
	}

	/**
	 * obtiene al nodo que esta arriba de este
	 * @return
	 */
	public Nodo getUp() {
		return up;
	}

	/**
	 * define al nodo que esta arriba de este
	 * @param up
	 */
	public void setUp(Nodo up) {
		this.up = up;
	}

	/**
	 * obtiene al nodo que esta abajo de este
	 * @return
	 */
	public Nodo getDown() {
		return down;
	}

	/**
	 * define al nodo que esta abajo de este
	 * @param down
	 */
	public void setDown(Nodo down) {
		this.down = down;
	}

	/**
	 * obtiene al nodo que esta a la izquierda de este
	 * @return
	 */
	public Nodo getLeft() {
		return left;
	}

	/**
	 * define al nodo que esta a la izquierda de este
	 * @param left
	 */
	public void setLeft(Nodo left) {
		this.left = left;
	}

	/**
	 * obtiene al nodo que esta a la derecha de este
	 * @return
	 */
	public Nodo getRight() {
		return right;
	}

	/**
	 * define al nodo que esta a la derecha de este
	 * @param right
	 */
	public void setRight(Nodo right) {
		this.right = right;
	}

	/**
	 * obtiene el dato de este nodo
	 * @return
	 */
	public int getData() {
		return data;
	}

	/**
	 * define el dato de este nodo
	 * @param data
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * obtiene la posicion x de este nodo
	 * @return
	 */
	public int getX() {
		return x;
	}

	/**
	 * define la posicion en x de este nodo
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * obtiene la posicion y de este nodo
	 * @return
	 */
	public int getY() {
		return y;
	}

	/**
	 * define la posicion y de este nodo
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	
}
