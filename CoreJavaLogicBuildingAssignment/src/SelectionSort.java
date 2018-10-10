import java.util.Scanner;


public class SelectionSort {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=0,j, lengthOfArray,temp;
		
		System.out.print("Enter the number of elements to be sorted: ");
		
		lengthOfArray = scanner.nextInt();
		int[] numList = new int[lengthOfArray];
		
		System.out.println("Enter the elements: ");
		while (i<lengthOfArray){
			numList[i] = scanner.nextInt();
			i++;
		}
		System.out.println("Your number series is as follows: ");
		for(i=0;i<lengthOfArray;i++)
			System.out.print(numList[i]+" ");
		
		int min,index;
		for(i=0;i<lengthOfArray;i++){
			index = i;
			for(j=i+1;j<lengthOfArray;j++){
				if(numList[j]<numList[index])
					index = j;
			}
			temp = numList[index];
            numList[index] = numList[i];
            numList[i] = temp;
		}
		
		System.out.println("\nAfter Selection Sort your number series is as follows: ");
		for(i=0;i<lengthOfArray;i++)
			System.out.print(numList[i]+" ");
		
	}
		
		

}
