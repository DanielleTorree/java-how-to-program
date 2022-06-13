package chapter002_making_a_difference;
import 	java.util.Scanner;

public class Ex_02_035 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float kilometers, gasoline, avarage, parking, toll, result;
		
		System.out.print("How many kilometers driven per day: ");
		kilometers = input.nextFloat();
		
		System.out.print("Price per liter of gasoline: ");
		gasoline = input.nextFloat();
		
		System.out.print("Avarage kilometers per liter: ");
		avarage = input.nextFloat();
		
		System.out.print("Parking fee per day: ");
		parking = input.nextFloat();
		
		System.out.print("Toll per day: ");
		toll = input.nextFloat();
		input.close();

		result = toll + parking + ((kilometers/avarage)*gasoline);
		
		System.out.printf("Your daily spend is U$%f", result);
	}

}
