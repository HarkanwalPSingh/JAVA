package lab3;

import java.util.*;

public class MainClassLab3 {

	public static void main(String[] args) {
		String str1 = "Mississippi";
		String str2 = "AXC";
		Date date1 = new Date();
		System.out.println(Lab3_1.solution(str1, 4));
		
		System.out.println(Lab3_2.positiveString(str2));
		
		Lab3_3.dateFunction(date1);
		
		Date date2 = new Date(1996, 11, 30);
		
		Lab3_4.dateFunction(date1, date2);
		
		Lab3_5.warrantee(date1, 12);
		
		Lab3_6.formatDateToString(date1, "dd-MM-yyyy hh:mm:ss a", "Europe/London");
		
		
	}

}
