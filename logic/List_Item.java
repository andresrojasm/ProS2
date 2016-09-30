package Logic;

/**
 * 
 * @author Andres Rojas
 *
 */

public class List_Item {
	private iNodo_Item head;
	private iNodo_Item tail;
	
	public List_Item(){
		this.head = null;
		this.tail = null;
		
	}
	
	public iNodo_Item getHead() {
		return head;
		
	}

	public void setHead(iNodo_Item head) {
		this.head = head;
		
	}

	public iNodo_Item getTail() {
		return tail;
		
	}

	public void setTail(iNodo_Item tail) {
		this.tail = tail;
		
	}

	public boolean isEmpty(){
		if(head == null && tail == null){
			return true;
			
		}else{
			return false;
			
		}
		
	}
	
	public void enqueue(iNodo_Item item){
		if (isEmpty()){
			this.head = this.tail = item;
			
		}else{
			item.setAnte(this.tail);
			this.tail = item;
			
		}
		
	}
	
	public iNodo_Item dequeue(){
		iNodo_Item tmp = head;
		
		if (head == tail){
			head = tail = null;
			return tmp;
			
		}else{
			this.head = head.getSig();
			return tmp;
			
		}
		
	}
	
	public iNodo_Item show(){
		return head;
	}

	public void rotar_Item(){
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
