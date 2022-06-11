package chapter002_questions;
import java.util.Scanner;

public class Ex_02_015 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, y, sum, product, difference;
		double quotient;
		
		System.out.print("Enter first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter second integer: ");
		y = input.nextInt();
		
		sum = x + y;
		difference = x - y;
		product = x * y;
		quotient = x / y;
		
		System.out.printf("The sum is %d%n", sum);
		System.out.printf("The difference is %d%n", difference);
		System.out.printf("The product is %d%n", product);
		System.out.printf("The quotient is %2f%n", quotient);
		
		input.close();
	}

}
