import java.security.acl.LastOwnerException;
import java.util.Scanner;


public class PrintOddAndEven {

	public static void main(String[] args) {
		int startNumber,endNumber,tempNumber,i,size;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		startNumber = scanner.nextInt();
		System.out.println("Enter the last number : ");
		endNumber = scanner.nextInt();
		if(endNumber<startNumber){
			tempNumber=startNumber;
			startNumber=endNumber;
			endNumber=tempNumber;
		}
		
		System.out.println("The even numbers are: ");
		for(i=startNumber;i<=endNumber;i++)
			if(i%2==0)
				System.out.print(i+" ");
		System.out.println();
		System.out.println("The odd numbers are: ");
		for(i=startNumber;i<=endNumber;i++)
			if(i%2!=0)
				System.out.print(i+" ");
	}
}
