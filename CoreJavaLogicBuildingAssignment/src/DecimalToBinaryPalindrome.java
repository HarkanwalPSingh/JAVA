import java.util.Scanner;


public class DecimalToBinaryPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*int number = scanner.nextInt();
		int i = 0,j,count=0,tempNumber;
		int [] binaryArray = new int[1000];

		while(number>0){
			binaryArray[i]=number%2;
			number/=2;
			i++;
			count++;
		}
		for(i=0,j=(count-i);i<(count-1);i++){
			tempNumber=binaryArray[i];
			binaryArray[i]=binaryArray[j];
			binaryArray[j]=tempNumber;
		}
		for(i=0;i<(count-1);i++)
			System.out.print(binaryArray[i]);
		int binaryNumber=0;
		for(i=0;i<count;i++){
			if(binaryArray[i]!=0)
			binaryNumber += Math.pow(10, (count-1-i));
			System.out.println(binaryNumber);
		}

		int revNumber=0, remainder;

		int n = binaryNumber;
		while(n!=0){
			remainder = n%10;
			revNumber = revNumber*10 + remainder;
			n = n/10;
		}
		if(binaryNumber==revNumber)
			System.out.println(binaryNumber+" is a palindrome");
		else 
			System.out.println(binaryNumber+" is not a palindrome");*/
	}
}
