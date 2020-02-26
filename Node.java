package hmllm;

public class Node {
	private String key; //Key of the node
	private String val; //Value of the node
	private Node next; //Node is linked by its reference to its next
	/**
	 * The constructor. 
	 * @param key the key of the node
	 * @param val the value of the node
	 * @param next Node that is referenced
	 */
	public Node(String key, String val, Node next) {
		this.setKey(key); 
		this.setVal(val); 
		this.setNext(next);
	}
	/**
	 * Accessor method for val. 
	 * @return String of val.
	 */
	public String getVal() {
		return val;
	}
	/*
	 * Mutator method for val.
	 */
	public void setVal(String val) {
		this.val = val;
	}

	/**
	 * Returns the linked node.
	 * @return the next Node.
	 */
	public Node next() {
		return next;
	}

	/**
	 * Sets the next node.
	 * @param next the Node to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * Accesor method for key.
	 * @return String val of key. 
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Mutator method for key.
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

}
