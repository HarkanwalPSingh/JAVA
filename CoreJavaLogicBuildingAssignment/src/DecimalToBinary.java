
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int i = 0,count=0;
		int [] binaryArray = new int[1000];
		while(number>0){
			binaryArray[i]=number%2;
			number/=2;
			i++;
			count++;
		}
		for(i=(count-1);i>=0;i--)
			System.out.print(binaryArray[i]);


	}

}
