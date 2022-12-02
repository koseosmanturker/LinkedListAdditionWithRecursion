
public class LinkedList<T>{
	
	public Node<T> head;
	
	
	public LinkedList() {
		head = null;
	}

	
	public boolean add(T newEntry) {

		Node<T> newNode = new Node<>(newEntry);
		if(head == null) {
			head = newNode;
			return true;
		}
		
		Node<T> walk = head;
		while(walk != null) {
			if(walk.next == null) {
				walk.next = newNode;
				return true;
			}
			walk = walk.next;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		
		String str = "{";
		
		Node<T> walk = head;
		while(walk != null) {
			str += walk.data;
			if(walk.next != null) {
				str += "->";
			}
			walk = walk.next;
		}
		
		str += "}";
		
		return str;
	}



}
