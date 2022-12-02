# LinkedListSumWithRecursion
Perform addition with a single-digit number and a linked list representing a number

Given a single-digit number K and a singly linked list whose nodes stores digits of a non-negative number, add K to the linked list. 
For example, consider the linked list  “9 —> 9 —> 9 —> 4 —> NULL “ which represents the number 9993. Adding a single-digit number 6 to it should result in the linked list  “1 —> 0 —> 0 —> 0 —> 0 —> NULL” which corresponds to the number 10000.
Use recursion in your solution.

Tips
Traverse the linked list recursively until the last node is reached. Add the value of K to the last node.
Do not forget about the carry value.
If there is a carry after the addition is completed, create a new node with the carry value and make it point to the head of the linked list.
You can use the Node and LinkedList classes we implemented on the previous labs.
Example output is given below.
Main Class
	public static void main(String[] args){
		LinkedList ll new LinkedList();
		ll.add(9);
		ll.add(9);
		ll.add(4);
		// Digit to be added
		int k = 6;
		System.out.print("Before addition: ");
		printLinkedList(ll);
		System.out.println("Added value: " + k);
		ll2 = addValue(ll, k);
		System.out.print("After addition: ");
		printLinkedList(ll2);
	}

Output
Before addition: 9 -> 9 -> 4 -> NULL
Added value: 6
Result: 1 -> 0 -> 0 -> 0 -> NULL
