package lab2;

import java.util.Scanner;

public class Lab2_2 {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);

		System.out.println("Enter your an integer number: ");
		int number = ref.nextInt();

		if (number > 0)
			System.out.println("The number is positive");
		else if (number == 0)
			System.out.println("The number is zero");
		else
			System.out.println("The number is negative");

	}

}
