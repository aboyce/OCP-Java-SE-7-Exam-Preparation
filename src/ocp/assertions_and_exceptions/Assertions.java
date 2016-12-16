package ocp.assertions_and_exceptions;

public class Assertions {

	public static void main(String[] args) {
		assertions();
	}
	
	/**
	 * Used to show Assertions.
	 * You always assert that something is 'true'.
	 * If it is not as you would expect, an 'AssertionError is thrown.
	 * (The error should intentionally not be handled)
	 */
	public static void assertions() {
		
		int x = 5, y = 6;
		
		// A standard assertion
		assert(x < y);
		
		// An assertion with a message
		assert(x < y) : "X should always be less than Y";
	}
}