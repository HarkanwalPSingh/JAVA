import java.io.*;
import java.util.Scanner;
public class ArmstrongNumber {


	public static void main(String[] args) {
		int num1=0, num2=0,n,power=0,remainder=0;
		/* 
			num1=new Scanner(System.in).nextInt();
		 */
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt(); 
		n = num1;
		while(n!=0){
			power++;
			n/=10;
		}
		n=num1;
		while(n!=0){
			remainder = n%10;
			num2 += Math.pow(remainder, power);
			n /=10;
		}
		if(num1==num2)
			System.out.println(num1+" is an example of Armstrong Number");
		else
			System.out.println(num1+" is not an Armstrong Number");
	}

}
