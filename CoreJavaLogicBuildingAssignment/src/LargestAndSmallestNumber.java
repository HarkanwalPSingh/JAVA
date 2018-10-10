import java.util.Arrays;


public class LargestAndSmallestNumber {

	public static int Largest_Number(int[] numList,int count){
		int number=0,i;
		for (i=count-1;i>=0;i--)	
			number = number + numList[i]*(int)(Math.pow(10, i));
		return number;
	}
	public static int Smallest_Number(int[] numList, int count){
		int number=0,i,indexForZero=0;
		if(numList[0]==0){
			for(i=0;i<count;i++)
				if(numList[i]!=0){
					indexForZero=i;
					break;
				}
			number = numList[indexForZero]*(int)(Math.pow(10, count-1));
			for(i=indexForZero+1;i<count;i++)
				number += numList[i]*(int)(Math.pow(10, count - i-1));
			return number;
		}
		else{
			for(i=0;i<count;i++)
				number = number + numList[i]*(int)(Math.pow(10, count-i-1));
			return number;
		}

	}

	public static void main(String[] args) {
		int number = 760039,i=0,count=0,remainder;
		int numList[]=new int[6];
		count = numList.length;
		while(i<count){
			remainder = number%10;
			number /=10;
			numList[i]=remainder;
			i++;
		}
		Arrays.sort(numList);
		System.out.println("Largest Number : "+Largest_Number(numList,count));
		System.out.println("Smallest Number: "+Smallest_Number(numList,count));

	}

}
