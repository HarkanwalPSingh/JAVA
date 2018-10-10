
public class NumberOfPrimeOddEvenArmstrongPalindrome {
	
public static int primeNumbers(int num1,int num2){
	int i,j,count=0,primeNum=0;
	
	for(i=num1;i<=num2;i++){
		for(j=i;j>1;j--)
			if(i%j==0)
				count++;
		if(count==1)
			primeNum++;
		count = 0;
	}
	return primeNum;
}

public static int oddNumbers(int num1,int num2){
	int i,oddNum=0;
	for(i=num1;i<=num2;i++)
		if(i%2!=0)
			oddNum++;
	return oddNum;
}

public static int evenNumbers(int num1,int num2){
	int i,evenNum=0;
	for(i=num1;i<=num2;i++)
		if(i%2==0)
			evenNum++;
	return evenNum;
}

public static int armstrongNumbers(int num1,int num2){
	int i,armstrongNum=0;
	for(i=num1;i<=num2;i++){
		int n = i,remainder,power=0,tempNum=0;
		while(n!=0){
			power++;
			n/=10;
		}
		n=i;
		while(n!=0){
			remainder = n%10;
			tempNum += Math.pow(remainder, power);
			n /=10;
		}
		if(i==tempNum)
			armstrongNum++;
	}
	return armstrongNum;
}

public static int palindromeNumbers(int num1,int num2){
	int i,palindromeNum=0;
	for(i=num1;i<=num2;i++){
		int n = i,remainder=0,tempNum=0;
		while(n!=0){
			remainder = n%10;
			tempNum = tempNum*10 + remainder;
			n = n/10;
		}
		if(i==tempNum)
			palindromeNum++;
	}
	return palindromeNum;
}

	public static void main(String[] args) {
		int num1 = 5;
		int num2 =200;
		
		System.out.println("No of prime numbers between "+num1+" and "+num2+" are "+primeNumbers(num1, num2));
		System.out.println("No of odd numbers between "+num1+" and "+num2+" are "+oddNumbers(num1, num2));
		System.out.println("No of even numbers between "+num1+" and "+num2+" are "+evenNumbers(num1, num2));
		System.out.println("No of armstrong numbers between "+num1+" and "+num2+" are "+armstrongNumbers(num1, num2));
		System.out.println("No of palindrome numbers between "+num1+" and "+num2+" are "+palindromeNumbers(num1, num2));

	}

}
