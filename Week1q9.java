package workshop1oop;

import java.util.Scanner;

public class Week1q9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the principal amount");
		double principal = scan.nextDouble();
		System.out.println("Enter the rate of interest");
		double rate = scan.nextDouble();
		System.out.println("Enter the time period");
		double time = scan.nextDouble();
		double simpleInterest;
		simpleInterest = (principal * time * rate) / 100;
		System.out.println("The simple interest is " + simpleInterest);
		scan.close();
	}

}
