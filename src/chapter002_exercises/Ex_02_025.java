package chapter002_exercises;
import java.util.Scanner;

public class Ex_02_025 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.print("Enter first integer: ");
		number = input.nextInt();
		
		if(number % 2 == 0) {
			System.out.print("This number is even");
		} else {
			System.out.print("This number is odd");
		}
		
		input.close();	
	}

}
