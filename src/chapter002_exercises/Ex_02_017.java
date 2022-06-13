package chapter002_exercises;
import java.util.Scanner;

public class Ex_02_017 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, y, z, sum, product, smaller, larger, middle, flag;
		double average;
		
		System.out.print("Enter first integer: ");
		x = input.nextInt();		
		
		System.out.print("Enter second integer: ");
		y = input.nextInt();
		
		System.out.print("Enter third integer: ");
		z = input.nextInt();
		
		sum = x + y + z;
		product = x * y * z;
		average = sum / 3;
		
		if(x > y) {
			 flag = x;
			 x = y;
			 y = flag;
		}
		
		if(y > z) {
			flag = y;
			y = z;
			z = flag;
		}
		
		if(z > x) {
			flag = z;
			z = x;
			x = flag;
		}
		
		larger = x;
		middle = y;
		smaller = z;
		
		System.out.printf("x: %d%n", x);
		System.out.printf("y: %d%n", y);
		System.out.printf("z: %d%n", z);		
		System.out.printf("Sum: %d%n", sum);
		System.out.printf("Average: %.0f%n", average);
		System.out.printf("Product: %d%n", product);
		System.out.printf("Larger: %d%n", larger);
		System.out.printf("Middle: %d%n", middle);
		System.out.printf("Smaller: %d%n", smaller);

		
		input.close();
	}

}
