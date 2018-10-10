import java.util.Scanner;


public class BinarySearch {
	public static int binarySearch(int [] numList, int index, int number){
		int leftIndex=0, rightIndex=index-1,middleIndex;
		while (leftIndex<=rightIndex){
			middleIndex=(leftIndex+rightIndex)/2;
			if(numList[middleIndex]<number)
				leftIndex = middleIndex + 1;
			else if (numList[middleIndex]>number)
				rightIndex = middleIndex;
			else
				return middleIndex;
		}

		return 0;
	}
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

		/* Sorting Part */

		for(i=0;i<lengthOfArray;i++){
			for(j=0;j<lengthOfArray-i-1;j++){
				if(numList[j]>numList[j+1]){
					temp=numList[j];
					numList[j]=numList[j+1];
					numList[j+1]=temp;
				}
			}
		}
		System.out.println("\nAfter Bubble Sort your number series is as follows: ");
		for(i=0;i<lengthOfArray;i++)
			System.out.print(numList[i]+" ");

		System.out.println("\nType the element to be found: ");
		int number = scanner.nextInt();
		int index =binarySearch(numList, lengthOfArray, number);
		System.out.println("The index of the element is : "+ index);


	}
}
/*System.out.println("Type the element to be found: ");
int number = scanner.nextInt();
int index =BinarySearch(numList[],lengthOfArray,number);*/