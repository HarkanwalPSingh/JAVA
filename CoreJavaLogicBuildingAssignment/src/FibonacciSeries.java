import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0,num2=1,num3,i=0;
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();
		System.out.print(num1+"\t");
		System.out.print(num2+"\t");
		while(i<index-2){
			num3 =num1 + num2;
			System.out.print(num3+"\t");
			num1=num2;
			num2=num3;
			i++;
		}
	}
}
