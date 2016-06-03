package at.fhj.itm15.api;

public interface Stack {

	/**
	 * Tests if this stack is empty.
	 * @return true if empty, false if not.
	 */
	public abstract boolean isEmpty();

	/**
	 * Pushes an item onto the top of this stack.
	 * 
	 * if Stack is full return an error message
	 * 
	 * @param  gets pushed to the stack.
	 */
	public abstract void push(String item);

	/**
	 * Removes the object at the top of this stack and returns that
	 * object as the value of this function.
	 * 
	 * @return "Empty stack." if no element in stack, else returns first object on top of the stack.
	 */
	public abstract String pop();

}
