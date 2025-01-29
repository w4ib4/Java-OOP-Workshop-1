package workshop1oop;

import java.util.Scanner;

public class Week1q15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the first integer : ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second integer : ");
		int num2 = scan.nextInt();
		int sum, difference, product;
		sum = num1 + num2;
		System.out.println("The sum is : " + sum);
		difference = num1 - num2;
		System.out.println("The differnce is : " + difference);
		product = num1 * num2;
		System.out.println("The product is : " + product);
		float quotient = num1 / num2;
		System.out.println("The quotient is : " + quotient);
		scan.close();
		
	}

}
