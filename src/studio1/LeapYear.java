package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Write in a year you want to test.");
		int year = in.nextInt();
		
		int Test1 = year % 4; 
		int Test2 = year % 100;
		int Test3 = year % 400; 
		
		boolean isLeapYear = (Test1 == 0 && Test2 != 0 || Test3 == 0);
		
		System.out.println("leapYear? " + isLeapYear);
		
	}

}
