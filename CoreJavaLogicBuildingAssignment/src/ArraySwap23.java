
public class ArraySwap23 {

	public static void main(String[] args) {
		int numList[]={1,2,3,4,5,6,7,8,9,10},tempList[] = new int[10] ;
		int lengthOfArray=numList.length,i,count,j;

		for(i=lengthOfArray-1,j=0;i>0;i=i-2,j++){
			tempList[j]=numList[i];
			/*System.out.println(tempList[j]);*/
		}


		for(i=0,j=(lengthOfArray-1);i<lengthOfArray ;i=i+2,j--){
			tempList[j]=numList[i];
			/*System.out.println(tempList[j]);*/
		}
		for(i=0;i<lengthOfArray;i++,j++)
			System.out.print(tempList[i]+" ");

		/*for(i=0;i<lengthOfArray;i++)
		System.out.println(tempList[i]);*/
	}

}
