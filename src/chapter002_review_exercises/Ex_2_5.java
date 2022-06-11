package chapter002_review_exercises;
import java.util.Scanner;

public class Ex_2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x, y, z, result;
		
		System.out.print("Enter first integer: ");
		x = input.nextInt();
		System.out.print("Enter second integer: ");
		y = input.nextInt();
		System.out.print("Enter third integer: ");
		z = input.nextInt();
		
		result = x * y * z;
		
		System.out.printf("Produt is %d%n", result);

		input.close();
	}

}
