package hmllm;

import java.util.Iterator;

/**
 * HomemadeLLMap
 * 
 * An implementation of the HomemadeMap class that uses
 * a completely-homemade linked list on the inside.
 * 
 * @author Thomas VanDrunen
 * CSCI 245, Wheaton College
 * June 30, 2014
 */

public class HomemadeLLMap implements HomemadeMap {
	private Node head; //Head of the linked list.
	
	/*
	 * The constructor.
	 * Starts out initially empty.
	 */
	public HomemadeLLMap() {
		head = null;
		
	}
	/**
	 * 
	 * @param key the desired key to return.
	 * @return Node indicated by the key
	 */
	public Node getNode(String key) {
		Node current = head; 
		while(current != null) {
			if(current.getKey().equals(key)) {
				return current;
			}
			current = current.next(); 
		}
		return current; 
	}
    /**
     * Test whether an association exists for this key.
     * @param key The key to remove
     * @return true if there is an association for this key, false otherwise
     */
    public boolean containsKey(String key) {
    	if(this.getNode(key) != null) {
    		return true; 
    	}
        return false; 
    	
        
    }

    /**
     * Add an association to the map.
     * @param key The key to this association
     * @param val The value to which this key is associated
     */
    public void put(String key, String val) {
    	Node current = head;
   
    	if(this.containsKey(key) == false) {
    		Node toAdd = new Node(key, val, head); 
    		head = toAdd; 
    	}
    	else {
    		current = this.getNode(key); 
    		current.setVal(val);
    	}
    	
    }  

    /**
     * Get the value for a key.
     * @param key The key whose value we're retrieving.
     * @return The value associated with this key, null if none exists
     */
    public String get(String key) {
    	
    	Node current = this.getNode(key); 
    	if(current != null) {
    		return current.getVal(); 
    	}
    	return null; 
    	
    }

    /**
     * Get an iterator for all the keys in this map.
     * @return An iterator over the set of keys.
     */
    public Iterator<String> keyIterator() {
    	return new MapIterator<String>(head); 
    }

    
    /**
     * Remove the association for this key.
     * @param key The key to remove
     */   
    public void remove(String key) {
    	Node current = head; 
    	if(current != null) {
    		
    		if(current.getKey().equals(key)) {
    			head = head.next();
    			return; 
    		}
    		while(current.next() != null) {
    			if(current.next().getKey().equals(key)) {
    				current.setNext(current.next().next());
    				return; 
    			}
    			current = current.next(); 
    			
    		}
    		
    	}
    }


	
}
