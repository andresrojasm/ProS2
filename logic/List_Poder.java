package Logic;

/**
 * 
 * @author Andres Rojas
 *
 */

public class List_Poder {
	private iNodo_Poder head;
	private iNodo_Poder tail;
	
	public List_Poder(){
		this.head = null;
		this.tail = null;
		
	}
	
	public iNodo_Poder getHead() {
		return head;
		
	}

	public void setHead(iNodo_Poder head) {
		this.head = head;
		
	}

	public iNodo_Poder getTail() {
		return tail;
		
	}

	public void setTail(iNodo_Poder tail) {
		this.tail = tail;
	}

	public boolean isEmpty(){
		if(head == null && tail == null){
			return true;
			
		}else{
			return false;
			
		}
		
	}
	
	public iNodo_Poder pop(){
		iNodo_Poder tmp = tail;
		
		tail = tail.getAnte();
		tail.setSig(null);
		
		return tmp;
		
	}
	
	public void push(iNodo_Poder poder){
		if (isEmpty()){
			head = tail = poder;
			
		}else{
		
			tail.setSig(poder);
			tail.getSig().setAnte(tail);
			setTail(tail.getSig());
		}
		
	}
	
	public iNodo_Poder peek(){
		return tail;
		
	}
	
	public void rotar_Poder(){
		if (isEmpty()){}
		else{
			tail.setSig(head);
			tail.getAnte().setSig(null);
			head.setAnte(tail);
			tail = tail.getAnte();
			head = head.getAnte();
		}
		
	}
}
