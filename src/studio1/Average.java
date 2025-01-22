package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter two integers to be averaged.");
		
		System.out.print("Integer One: ");
		int n1 = in.nextInt();

		System.out.print("Integer Two: ");
		int n2 = in.nextInt();

		System.out.println("Your integers are " + n1 + " and " + n2 + "." );
		
		double average = ((n1 + n2) / 2.0); //any double in the eq. with switch it to a double
		System.out.println("The average is " + average);
		
	}

}
