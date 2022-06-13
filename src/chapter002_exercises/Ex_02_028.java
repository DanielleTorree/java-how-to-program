package chapter002_exercises;
import java.util.Scanner;

public class Ex_02_028 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int r;
		double d, c, a;
		
		// d = 2 . r
		// c = 2 * pi * r
		// a = pi * r²
	
		System.out.print("Enter radius: ");
		r = input.nextInt();
		
		d = 2 * r;
		c = 2 * Math.PI * r;
		a = Math.PI * r * r;
		
		System.out.printf("Diameter is %f%n", d);
		System.out.printf("Circunference is %f%n", c);
		System.out.printf("Area is %f%n", a);
		
		input.close();
	}

}
