package chapter002_exercises;
import java.util.Scanner;

public class Ex_02_016 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Enter first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter first integer: ");
		y = input.nextInt();
		
		if(x == y) {
			System.out.println("These numbers are equal");
		} else if(x > y) {
			System.out.printf("%d is larger than %d%n", x, y);
		} else {
			System.out.printf("%d is larger than %d%n", y, x);
		}
		
		input.close();
	}

}
