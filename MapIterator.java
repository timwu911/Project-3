package hmllm;

import java.util.Iterator;

public class MapIterator<T> implements Iterator<String> { 
	
	private Node head; //the head of the Linked List
	
	/**
	 * The constructor. 
	 * @param head the head node.
	 */
	public MapIterator(Node head) {
		this.head = head; 
	
	}

	/**
	 * Returns true if there is a next node, else false.
	 */
	public boolean hasNext() {
		if(head == null) {
			return false; 
		}
		return true; 
	}

	/**
	 * Returns the Key value of the next node.
	 * @return String of key value.
	 */
	public String next() {
		
		if(hasNext()) {
			 String temp = head.getKey(); 
			 head = head.next(); 
			 return temp; 
		}
		return head.getKey(); 
	}
}
