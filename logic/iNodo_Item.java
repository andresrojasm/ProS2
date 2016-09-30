package Logic;

/**
 * 
 * @author Andres Rojas
 *
 */

public class iNodo_Item {
	private iNodo_Item sig;
	private iNodo_Item ante;
	private String dato;
	
	public iNodo_Item(String dato){
		this.sig = null;
		this.ante = null;
		this.dato = dato;
		
	}

	public iNodo_Item getSig() {
		return sig;
		
	}

	public void setSig(iNodo_Item sig) {
		this.sig = sig;
		
	}

	public iNodo_Item getAnte() {
		return ante;
		
	}

	public void setAnte(iNodo_Item ante) {
		this.ante = ante;
		
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
		
	}
	
}
