
public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		int num1=40,num2=10;
		System.out.println("Number 1: "+num1+"Number 2: "+num2);
		num1=num1+num2;
		System.out.println("Number 1: "+num1+"Number 2: "+num2);
		num2=num1-num2;
		System.out.println("Number 1: "+num1+"Number 2: "+num2);
		num1=num1-num2;
		System.out.println("Number 1: "+num1+"Number 2: "+num2);
	}

}
