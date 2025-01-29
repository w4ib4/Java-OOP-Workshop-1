package workshop1oop;

import java.util.Scanner;

public class Week1q11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the distance in miles : ");
		double miles = scan.nextDouble();
		double kilometers = miles * 1.609344;
		System.out.println("The miles in kilometer is : " + kilometers);
		scan.close();

	}
	

}
