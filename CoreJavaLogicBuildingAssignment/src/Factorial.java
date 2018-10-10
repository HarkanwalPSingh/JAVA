import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {

		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(),i,factNumber=1;
		if (number !=0)
			for (i=number;i>0;i--){
				factNumber *= i;
			}
		else factNumber = 1;
		System.out.println("Factorial of "+number+" is "+factNumber);
	}

}
