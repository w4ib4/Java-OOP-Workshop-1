package workshop1oop;

import java.util.Scanner;

public class Week1q12 {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the radius :");
		double radius = scan.nextDouble();
		double area = Math.PI * radius * radius;
		System.out.println("The area of circle is : " + area);
		scan.close();
	}

}
