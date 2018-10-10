import java.util.Arrays;

import javax.naming.ldap.SortControl;


public class ThirdLargestNumberInArray {

	public static void main(String[] args) {
		int array[]={12,45,11,32,55,46};
		Arrays.sort(array);
		int index = array.length;
		int i = index-3;
		System.out.println("Third largest value in array is: "+array[i]);
	}

}
