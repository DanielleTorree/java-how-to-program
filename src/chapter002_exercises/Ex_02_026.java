package chapter002_exercises;
import java.util.Scanner;

public class Ex_02_026 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		
		if(num2 % num1 == 0) {
			System.out.printf("%d is multiple of %d%n", num1, num2);			
		} else {
			System.out.printf("%d is not multiple of %d%n", num1, num2);	
		}
		

		
		input.close();
	}

}
