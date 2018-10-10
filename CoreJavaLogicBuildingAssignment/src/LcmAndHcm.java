import java.util.Scanner;
public class LcmAndHcm {

	public static void main(String[] args) {
		int lcm,hcm;
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int temp1=number1,temp2=number2,temp;
		
		while(temp2!=0){
			temp = temp2;
			temp2 = temp1%temp2;
			temp1=temp;
		}
		hcm = temp1;
		lcm  = (number1*number2)/hcm;
		System.out.println("LCM : "+lcm);
		System.out.println("HCM : "+hcm);
	}

}
