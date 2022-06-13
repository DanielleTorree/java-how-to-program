package chapter002_making_a_difference;
import java.util.Scanner;

public class Ex_02_033 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float bmi, weight, height;
		
		System.out.println("BMI Calculator");
		System.out.print("Do you want to put your weight in pounds [1] or kilogram [2]? *digit the number: ");
		int type = input.nextInt();
		
		if(type == 1) {
			System.out.print("Enter your weight in pounds: ");
			weight = input.nextFloat();
			System.out.print("Enter your height in inches: ");
			height = input.nextFloat();
			
			bmi = (weight * 703)/(height*height);
		} else {
			System.out.print("Enter your weight in kilograms: ");
			weight = input.nextFloat();
			System.out.print("Enter your height in meters: ");
			height = input.nextFloat();
			
			bmi = weight/(height*height);
		}
		input.close();
		
		System.out.print("BMI Value: ");
		if(bmi < 18.5) {
			System.out.println("Underweight");
		} else if(bmi < 24.9) {
			System.out.println("Normal");
		} else if(bmi < 29.9) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}
		
		System.out.printf("Your body mass index is %f", bmi);
		
	}

}
