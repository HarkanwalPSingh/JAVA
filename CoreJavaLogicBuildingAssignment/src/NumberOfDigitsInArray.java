import java.util.Arrays;


public class NumberOfDigitsInArray {

	public static void main(String[] args) {
		int numList[]={1,1,1,7,9,9,13,2,9,19,19};
		int i=0,j,n=numList.length,count=0;
		Arrays.sort(numList);
		for(j=i;j<n;j++){
			if(numList[j]==numList[i])
				count++;
			else{
				i=j;
				System.out.println("The number of occurences of digit "+numList[j-1]+" is "+count);
				count = 1;
			}
		}
		System.out.println("The number of occurences of digit "+numList[j-1]+" is "+count);
	}	
}

