package workshop1oop;

import java.util.Scanner;

public class Week1q8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		float radius = scan.nextFloat();
		System.out.println("Enter the height");
		float height = scan.nextFloat();
		double volume = Math.PI * Math.pow(radius,2) * height;
		System.out.println("The volume of cylinder is: " + volume);
		scan.close();
		
	}

}
