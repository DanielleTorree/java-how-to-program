package chapter002_questions;
import java.util.Scanner;

public class Ex_02_008_b {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Enter firs integer: ");
		b = input.nextInt();

		System.out.print("Enter second integer: ");
		c = input.nextInt();
		
		a = b * c;
		
		System.out.printf("Product is %d%n", a);		
		
		input.close();		
	} 	

}
