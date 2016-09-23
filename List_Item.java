package Logic;

public class List_Item {
	private Nodo_Item head;
	private Nodo_Item tail;
	
	public List_Item(){
		this.head = null;
		this.tail = null;
		
	}
	
	public boolean isEmpty(){
		if(head == null && tail == null){
			return true;
			
		}else{
			return false;
			
		}
		
	}
	
	public void enqueue(Nodo_Item item){
		if (isEmpty()){
			this.head = this.tail = item;
			
		}else{
			item.ante = this.tail;
			this.tail.sig = item;
			this.tail = item;
		}
		
	}
	
	public Nodo_Item dequeue(){
		if (isEmpty()){
			return null;
			
		}else{
			Nodo_Item tmp = head;
			this.head = head.getSig();
			return tmp;
			
		}
		
	}
	
}
