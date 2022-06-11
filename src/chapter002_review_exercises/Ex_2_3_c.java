package chapter002_review_exercises;
import java.util.Scanner;

public class Ex_2_3_c {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int value;
		
		System.out.print("Enter an integer: ");
		value = input.nextInt();
		
		System.out.printf("%d", value);
		
		input.close();
	}	
	
}
