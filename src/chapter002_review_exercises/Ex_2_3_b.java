package chapter002_review_exercises;
import java.util.Scanner;

public class Ex_2_3_b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.print("Enter an integer: ");
		number = input.nextInt();
		
		System.out.printf("%d", number);
		
		input.close();
	}

}
