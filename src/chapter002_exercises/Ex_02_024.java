package chapter002_exercises;
import java.util.Scanner;

public class Ex_02_024 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3, n4, n5, maior, menor;
		
		System.out.print("Enter first integer: ");
		n1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		n2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		n3 = input.nextInt();
		
		System.out.print("Enter fourth integer: ");
		n4= input.nextInt();
		
		System.out.print("Enter fifth integer: ");
		n5= input.nextInt();
		
		maior = n1; 
		menor = n1;
		
		if(maior < n2) {
			maior = n2;
		}
		
		if(maior < n3) {
			maior = n3;
		}
		
		if(maior < n4) {
			maior = n4;
		}
		
		if(maior < n5) {
			maior = n5;
		}
		
		if(menor > n2) {
			menor = n2;
		}
		
		if(menor > n3) {
			menor = n3;
		}
		
		if(menor > n4) {
			menor = n4;
		}
		
		if(menor > n5) {
			menor = n5;
		}
		
		System.out.printf("Largest: %d%n", maior);
		System.out.printf("Smallest: %d%n", menor);
		
		input.close();
	}

}
