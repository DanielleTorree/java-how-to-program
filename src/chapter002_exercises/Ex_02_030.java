package chapter002_exercises;
import java.util.Scanner;

public class Ex_02_030 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number, digit1, digit2, digit3, digit4, digit5;
		
		System.out.print("Enter a five-digit integer: ");
		number = input.nextInt();
		input.close();
		
		digit1 = number % 10;
		number = number / 10;
		digit2 = number % 10;
		number = number / 10;
		digit3 = number % 10;
		number = number / 10;
		digit4 = number % 10;
		number = number / 10;
		digit5 = number % 10;
		number = number / 10;
		
		System.out.printf("%d %d %d %d %d", digit5, digit4, digit3, digit2, digit1);
	}

}
