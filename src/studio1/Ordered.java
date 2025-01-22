package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();

		boolean isOrdered = ((x < y && y < z) || (z < y && y < x)); 
		System.out.println("Are these numbers ordered? " + isOrdered);
		
		/* Define a boolean variable isOrdered whose value is true if the three values 
		 * are either in strictly ascending order (x < y < z) or in strictly descending order 
		 * (x > y > z), and false otherwise. Print out the variable isOrdered using 
		 * System.out.println(isOrdered).

			Some of you may already know some Java. We have not yet covered the if statement. 
			You must use what has been taught so far (simple expressions and assignment) to 
			accomplish this task.

		You’ll need a new tool to accomplish this! These will be useful operators:

		&& (pronounced “and”) compares two booleans and returns whether they are BOTH true. 
		(true && true makes true but true && false makes false)
		|| (pronounce “or”) compares two booleans and returns whether 
		EITHER boolean is true. (true || true and false || true both make true, 
		but false || false makes false)  
		 
		 */
	}

}
