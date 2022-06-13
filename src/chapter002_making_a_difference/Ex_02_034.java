package chapter002_making_a_difference;
import java.util.Scanner;

public class Ex_02_034 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the current world population number: ");
		float popNumber = input.nextFloat();
		
		System.out.print("Enter world population growth rate number: ");
		float growthNumber = input.nextFloat();

		popNumber = popNumber * growthNumber;
		System.out.printf("First year: %f%n", popNumber);
		popNumber = popNumber * growthNumber;
		System.out.printf("Second year: %f%n", popNumber);
		popNumber  = popNumber * growthNumber;
		System.out.printf("Third year: %f%n", popNumber);
		popNumber = popNumber * growthNumber;
		System.out.printf("Fourth year: %f%n", popNumber);
		popNumber = popNumber * growthNumber;
		System.out.printf("Fifth year: %f%n", popNumber);
		
		input.close();
		
	}

}
