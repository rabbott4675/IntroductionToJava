package ChapterTwo;

import java.util.Scanner;

public class TwoTwentyThree {

	public static void main(String[] Strings) {

		Scanner input = new Scanner(System.in);

		double distance;
		double milesPerGallon;
		double pricePerGallon;

		System.out.print("Enter the driving distance: ");
		distance = input.nextDouble();

		System.out.print("Enter miles per gallon: ");
		milesPerGallon = input.nextDouble();

		System.out.print("Enter price per gallon: ");
		pricePerGallon = input.nextDouble();

		input.close();

		double total = distance / milesPerGallon * pricePerGallon;

        System.out.printf("The cost of driving is $%.2f", total);
	}
}
