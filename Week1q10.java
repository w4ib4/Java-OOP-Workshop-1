package workshop1oop;

import java.util.Scanner;

public class Week1q10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the first integer: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second integer: ");
		int num2 = scan.nextInt();
		int addition, subtraction, multiplication;
		addition = num1 + num2;
		System.out.println("The sum is : " + addition);
		subtraction = num1 - num2;
		System.out.println("The difference is : " + subtraction);
		multiplication = num1 * num2;
		System.out.println("The product is : " + multiplication);
		float division;
		division = num1 / num2;
		System.out.println("The sum is : " + division);
		
		scan.close();
	}

}
