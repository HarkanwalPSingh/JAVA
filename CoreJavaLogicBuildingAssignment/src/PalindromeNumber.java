import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) {
		int number=0, revNumber=0, remainder;
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		int n = number;
		while(n!=0){
			remainder = n%10;
			revNumber = revNumber*10 + remainder;
			n = n/10;
		}
		if(number==revNumber)
			System.out.println(number+" is a palindrome");
		else 
			System.out.println(number+" is not a palindrome");
	}

}
