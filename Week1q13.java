package workshop1oop;

import java.util.Scanner;

public class Week1q13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the price : ");
		double price = scan.nextDouble();
		System.out.println("Enter the total quantity : ");
		double quantity = scan.nextDouble();
		double totalCost = price * quantity;
		System.out.println("Your total cost is : " + totalCost);
		scan.close();
	}

}
