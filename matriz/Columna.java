package Matrix;

/**
 * Lista que representara una columna en la matriz
 * @author Carlos Alberto
 *
 */
public class Columna {

	 public Columna next;		/** siguiente columna*/
	 public Nodo head,tail;		/** nodo inicial y nodo final*/
	 
	 
	 /**
	  * Constructor
	  */
	 public Columna(){
		 head = tail = null;
	 }


	 /**
	  * Inserta un Nodo en la columna
	  * @param contadorx
	  * @param contadory
	  */
	public void Insert(int posx, int posy) {
		Nodo tmp = new Nodo(posx, posy);
		if (head == null){			// si no hay elementos
			head = tail = tmp;
			System.out.print("("+tmp.getX()+ "," + tmp.getY() + ") ");
			
		}
		else{
			tail.setDown(tmp);		// insertar al final
			tmp.setUp(tail);
			tail = tmp;
			System.out.print("("+tmp.getX()+ "," + tmp.getY() + ") ");
			
		}
		
	}


	
	
	/**
	 * Obtiene el inicio de la columna
	 * @return
	 */
	public Nodo getHead() {
		return head;
	}


	/**
	 * Define el inicio de la columna
	 * @param head nodo que sera el inicio de la columna
	 */
	public void setHead(Nodo head) {
		this.head = head;
	}


	/**
	 * Obtiene el final de la columna
	 * @return	tail. el final de la columna
	 */
	public Nodo getTail() {
		return tail;
	}


	/**
	 * Define el final de la columna
	 * @param tail	nodo que sera el final de la columna
	 */
	public void setTail(Nodo tail) {
		this.tail = tail;
	}


	/**
	 * Obtiene la siguiente columna
	 * @return	Siguiente columna
	 */
	public Columna getNext() {
		return next;
	}


	/**
	 * define la siguiente columna
	 * @param next	columna que sera la siguiente
	 */
	public void setNext(Columna next) {
		this.next = next;
	}
	 
	
	
	 
}
