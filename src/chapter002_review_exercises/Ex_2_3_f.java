package chapter002_review_exercises;
import java.util.Scanner;

public class Ex_2_3_f {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.print("Enter an integer: ");
		number = input.nextInt();
		
		if(number == 7) { 
			System.out.print("The variable number is iqual to 7.");
		} else {
			System.out.print("The variable number is not iqual to 7.");
		}
		
		input.close();
	}

}
