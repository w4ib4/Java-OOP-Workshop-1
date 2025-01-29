package workshop1oop;

import java.util.Scanner;

public class Week1q5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length: ");
		double length = scan.nextDouble();
		System.out.println("Enter the breadth: ");
		double breadth = scan.nextDouble();
		double perimeter = 2 * (length + breadth);
		System.out.println("The perimeter of rectangle is: " + perimeter);
		scan.close();
	}

}
