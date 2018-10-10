
public class NumberOfOneTwoThreeDigitNumber {
	public static int digits(int number){
		if((number/100)!=0)
			return 3;
		else if ((number/10)!=0)
			return 2;
		else return 1;
	}
	public static void main(String[] args) {
		int numList[] = {12,1,3,4,78,100,154,2,12,741};
		int oneDigits=0,twoDigits=0,threeDigits=0;
		int temp;
		for(int i=0;i<numList.length;i++){
			temp=digits(numList[i]);
			if(temp==3)
				threeDigits++;
			else if(temp==2)
				twoDigits++;
			else
				oneDigits++;	
		}
		System.out.println("Number of three digit number is : "+threeDigits);
		System.out.println("Number of two digit number is : "+twoDigits);
		System.out.println("Number of one digit number is : "+oneDigits);
		

	}

}
