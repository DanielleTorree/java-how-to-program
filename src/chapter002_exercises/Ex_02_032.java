package chapter002_exercises;
import java.util.Scanner;

public class Ex_02_032 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		System.out.print("Enter third integer: ");
		int n3 = input.nextInt();
		System.out.print("Enter fourth integer: ");
		int n4 = input.nextInt();
		System.out.print("Enter fifth integer: ");
		int n5 = input.nextInt();
		input.close();
		
		int negatives = 0;
		int positives = 0;
		int zeros = 0;
		
		if(n1 < 0) {
			negatives += 1;
		} else if(n1 == 0) {
			zeros += 1;
		} else {
			positives += 1;
		}
		
		if(n2 < 0) {
			negatives += 1;
		} else if(n2 == 0) {
			zeros += 1;
		} else {
			positives += 1;
		}
		
		if(n3 < 0) {
			negatives += 1;
		} else if(n3 == 0) {
			zeros += 1;
		} else {
			positives += 1;
		}
		
		if(n4 < 0) {
			negatives += 1;
		} else if(n4 == 0) {
			zeros += 1;
		} else {
			positives += 1;
		}
		
		if(n5 < 0) {
			negatives += 1;
		} else if(n5 == 0) {
			zeros += 1;
		} else {
			positives += 1;
		}
		
		System.out.printf("Number of positive numbers %d%n", positives);
		System.out.printf("Number of negative numbers %d%n", negatives);
		System.out.printf("Number of zero numbers %d%n", zeros);
	}

}
