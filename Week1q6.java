package workshop1oop;

import java.util.Scanner;

public class Week1q6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length");
		double length = scan.nextDouble();
		double area = Math.pow(length,2);
		System.out.println("The area of square is " + area);
		scan.close();
	}

}
