package Logic;

/**
 * 
 * @author Andres Rojas
 *
 */

public class iNodo_Poder {
	private iNodo_Poder sig;
	private iNodo_Poder ante;
	private String dato;
	
	public iNodo_Poder(String dato){
		this.sig = null;
		this.ante = null;
		this.dato = dato;
		
	}

	public iNodo_Poder getSig() {
		return sig;
		
	}

	public void setSig(iNodo_Poder sig) {
		this.sig = sig;
		
	}

	public iNodo_Poder getAnte() {
		return ante;
		
	}

	public void setAnte(iNodo_Poder ante) {
		this.ante = ante;
		
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
		
	}

}
