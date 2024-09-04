package studio1;

import java.util.Scanner;

public class LeapYearclass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the year?");
		int year = in.nextInt();
		boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
		 System.out.println(isLeapYear);
		 // TODO Auto-generated method stub
	}


}
