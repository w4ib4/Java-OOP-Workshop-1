package workshop1oop;

import java.util.Scanner;

public class Week1q14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the amount in US Dollars to be converted to rupees : ");
		double usd = scan.nextDouble();
		double rupees = usd * 132;
		System.out.println("The converted US Dollar in Rupees is : " + rupees);
		scan.close();
	}

}
