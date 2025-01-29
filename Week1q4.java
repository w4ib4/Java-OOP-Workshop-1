package workshop1oop;

public class Week1q4 {
	public static void main(String[] args) {
		int a = 3, b = 4, c = 5;
		int s;
		s = (a+b+c) / 2;
		double result = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area is " + result);
	}

}
