package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Seems like you have more friends! Please enter their names below.");
		System.out.print("Friend 1: ");
		String s0 = in.nextLine();
		System.out.print("Friend 2: ");
		String s1 = in.nextLine();
		System.out.print("Friend 3: ");
		String s2 = in.nextLine();
		System.out.print("Friend 4: ");
		String s3 = in.nextLine();
		//
		// Say hello to the names in s0 through s3.
		//

		System.out.print("Hello " + s0 + ", " + s1 + ", " + s2 + ", and " + s3);
	}
}
