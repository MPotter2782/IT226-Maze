

public interface stackInt<E> {
	
	
	/**
	 * Pushes an item onto top of the stack and returns the item pushed
	 * @param obj The object to be inserted
	 * @return The object inserted
	 */
	
	//E push(E obj);
	
	/**
	 * Returns the object at the top of the stack without removing it
	 * @post The stack remains unchanged
	 * @return Returns the top of the stack
	 * @throws NoSuchElementException if the stack is empty
	 */
	
	
	E peek();
	
	/**
	 * Returns the object at the top of the stack and removes it
	 * @post The stack is one item smaller
	 * @return Returns the popped object
	 * @throws NoSuchElementException if the stack is empty
	 */
	
	E pop();
	
	/**
	 * Returns true if the stack is empty; otherwise, returns false
	 * @return true or false depending on if the stack is empty
	 */
	
	boolean isEmpty();
	
	
	
}
