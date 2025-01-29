package workshop1oop;

import java.util.Scanner;

public class Week1q7 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature: ");
		double temperature = scan.nextDouble();
		double fahrenheit = (temperature * 9/5 + 32);
		System.out.println("The temperature in Celsius converted to Fahrenheit is : " + fahrenheit);
		scan.close();
		
	}

}
