package ocp.string_data_and_resource_bundles;

public class StringFormatting {

	public static void main(String[] args) {
		printingWithPrintF();
	}
	
	/* format() and printf() behave exactly the same. */
	
	/* FORMATTING
	 * 
	 * 	%[arg_index] [flags] [width] [.precision] conversion char
	 * 		[] are optional
	 * 	
	 * 	arg_index = int followed by a $, indicates which argument should be printed.
	 * 	flags = 
	 * 				- = left justify
	 * 				+ = include a sign (+ or -)
	 * 				0 = pad with zeros
	 * 				, = use local-specific grouping, i.e. 1,000,000
	 * 				( = enclose negative numbers in parentheses
	 * 	width = minimum number of characters to print, used for formatting
	 * 	precision = for floats, number of decimal places to the right of '.'
	 * 	conversion = 
	 * 				b = boolean
	 * 				c = char
	 * 				d = integer
	 * 				f = floating point
	 * 				s = string
	 * 			
	 *  */
	
	private static void printingWithPrintF() {
		System.out.printf("%2$d + %1$d \n", 123, 456); // Prints "456 + 123"
		
		int i1 = -123, i2 = 12345;
		System.out.printf(">%1$(7d< \n", i1); // Prints ">  (123)<"
		System.out.printf(">%0,7d< \n", i2);  // Prints ">012,345<"
		System.out.printf(">%+-7d< \n", i2);  // Prints ">+12345 <"
		System.out.printf(">%2$b + %1$5d< \n", i1, false); // Prints "false +  -123"
	}
}
