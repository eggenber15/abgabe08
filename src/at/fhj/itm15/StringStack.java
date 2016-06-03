package at.fhj.itm15;

import at.fhj.itm15.api.Stack;

/**
 * Implements Methods, that offer a stack-functionality by adding strings to the array <code>String</code>.
 * @author danieleggenberger
 *
 */
public class StringStack implements Stack {

	private int current;
	private String[] stack;
	private boolean check;

	/**
	 * Constructor.
	 * 
	 * @param length Defines stack-size (arary-length).
	 */
	public StringStack(int length) {
		this.current = 0;
		this.stack = new String[length];
	}

	/* (non-Javadoc)
	 * @see at.fhj.itm15.api.Stack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		if(current == 0){
			return true;
		} else {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see at.fhj.itm15.api.Stack#push(java.lang.String)
	 */
	@Override
	public void push(String item) {
		if(current < this.stack.length) {
			this.stack[current] = item;
			current++;
		} else {
			System.out.println("Stack is full.");
		}
	}

	/* (non-Javadoc)
	 * @see at.fhj.itm15.api.Stack#pop()
	 */
	@Override
	public String pop() {
		if(isEmpty()) {
			return "Empty stack.";
		} else {
			current--;
			String str = this.stack[current];
			this.stack[current] = null;
			return str;
		}
	}

}
