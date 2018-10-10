
public class InsertionSort {
	public static void insertionSort(int arr[],int n){
		int i,j,tempNum=0;
		for(i=1;i<n;i++){
			tempNum = arr[i];
			j=i-1;
			
			while(j>=0 && arr[j]>tempNum){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=tempNum;
		}
		
	}
	public static void main(String[] args) {
		int[] arrayList = {12,11,13,5,6};
		int length = arrayList.length;
		insertionSort(arrayList, length);
		for(int i=0;i<length;i++)
			System.out.print(arrayList[i]+" ");
		

	}

}
