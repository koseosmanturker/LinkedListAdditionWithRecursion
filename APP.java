
public class APP {
	public static void main(String[] args) {
		
		LinkedList<Integer> ll =  new LinkedList<>();
		ll.add(9);
		ll.add(9);
		ll.add(4);
		
		int k = 7;
		System.out.print("Before addition: ");
		System.out.println(ll);
		System.out.println("Added value: " + k);
		ll = addValue(ll, k);
		System.out.print("After addition: ");
		System.out.println(ll);

		
	}

	private static LinkedList<Integer> addValue(LinkedList<Integer> ll, int k) {
		
		int carry = carry(ll.head, k);
		
		if(carry == 1) {
			Node<Integer> carryNode = new Node<>(1);
			carryNode.next = ll.head;
			ll.head = carryNode;
		}
		
		return ll;
	}
	
	private static int carry(Node<Integer> node, int k) {
		
		if(node == null) {
			return 0;	
		}
		
		int carry = carry(node.next,k);
		
		if(node.next == null) {
			node.data = node.data + k + carry;
		}
		
		else {
			node.data = node.data + carry;
		}
		
		if(node.data >= 10) {
			node.data = node.data % 10;
			return 1;
		}

		return 0;
	}
	
	

}
