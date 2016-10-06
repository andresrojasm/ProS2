package Matrix;

/**
 * Clase que crea una matriz a partir de nodos enlazados cuadruplemente
 * @author Carlos Alberto
 *
 */
public class Matriz {
	
	public Columna start, end;
	public int m , n;
	public int contadorx,contadory;
	
	
	
	/**
	 * Constructor
	 * @param pn	cantidad de filas
	 * @param pm	cantidad de columnas
	 */
	public Matriz(int pn, int pm){
		m = pm;
		n = pn;
		contadorx = contadory = 10;
		start = null;
		
		for( int i = 0; i < n; i++){
			if (start == null){
				start = end = new Columna();
				CrearColumna(start, m);
				System.out.println(" ");
				contadorx += 20;
			}
			else{
				Columna tmp = new Columna();
				CrearColumna(tmp, m);
				Nodo tmp1 = end.getHead();
				Nodo tmp2 = tmp.getHead();
				for( int j = 0; j < m; j++){
					tmp1.setRight(tmp2);
					tmp2.setLeft(tmp1);
					tmp1 = tmp1.getDown();
					tmp2 = tmp2.getDown();
						
				}
				end.setNext(tmp);
				end = tmp;
				System.out.println(" ");
				contadorx += 20;
			}
			
		}
	}

	/**
	 * Inserta en la columna la cantidad de filas
	 * @param pcolumna	columna a la que se le insertaran los nodos
	 * @param pm	cantidad de filas
	 */
	private void CrearColumna(Columna pcolumna , int pm) {
		for( int i = 0; i < pm; i++){
			pcolumna.Insert(contadorx, contadory);
			contadory += 20;
		}
		contadory = 10;
	}
	
	
	/**encuentra la posicion del nodo nxm y lo devuelve
	 * 
	 * @param pm columna
	 * @param pn fila
	 * @return	nodo accesado
	 */
	
	public Nodo Search(int pm,int pn){ 
		if(pm<n && pn<m){
			Columna tmpColum = start;
			for( int i = 0; i < pm; i++){
				tmpColum = tmpColum.getNext();
			}
			Nodo tmpNodo = tmpColum.getHead();
			for( int j = 0; j < pn; j++){
				tmpNodo =tmpNodo.getDown();
			}
			System.out.println("Nodo Accesado: ("+tmpNodo.getX()+ "," + tmpNodo.getY() + ") ");
			return tmpNodo;
		}
		else{
			return null;
		}
		
	}
	
	/**
	 * Devuelve todos los nodos de la matriz
	 * @param pm	cantidad de filas de la matriz
	 * @param pn	cantidad de columnas de la matriz
	 */
	public void SearchAll(int pm,int pn){ 
		for( int i = 0; i < pm; i++){
			for( int j = 0; j < pn; j++){
				Search(i,j);
			}
		}
		
	}
	
	
	
	
	/*public static void main(String args[]){
		
		Matriz matriz = new Matriz(5,4);
		
		matriz.SearchAll(3, 4);
	}
	*/
	
	
	
}
