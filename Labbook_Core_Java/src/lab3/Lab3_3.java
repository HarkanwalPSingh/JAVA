	package lab3;
	
	import java.util.*;
	import java.text.SimpleDateFormat;
	
	public class Lab3_3 {
		public static void dateFunction(Date date){
			SimpleDateFormat ft = new SimpleDateFormat("'Days: 'dd 'Months: ' MM 'Years: ' yyyy '\nSystem time: 'hh:mm:ss");
			System.out.println(ft.format(date));
			
		}
	
	}
