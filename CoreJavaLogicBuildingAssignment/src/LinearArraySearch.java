
public class LinearArraySearch {

	public static void main(String[] args) {
		int numList[]={1,3,5,7,9,11,13,15,9,19};
		for(int i=0,count=0;i<=numList.length;i++){
			if(numList[i]==9){
				if(count==0){
					System.out.println("The number 9 is at "+i+" Index of the array numList[]");
					count++;
				}
				else
					System.out.println("The number 9 is also at "+i+" Index of the array numList[]");	
			}	
		}
	}

}
