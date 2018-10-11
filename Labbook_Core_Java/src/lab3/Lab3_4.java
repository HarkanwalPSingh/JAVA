	package lab3;
	
	import java.text.SimpleDateFormat;
	import java.util.Date;
	
	public class Lab3_4 {
		public static void dateFunction(Date date1, Date date2){
			
			Long timeElapsed = date2.getTime() - date1.getTime();
			Date result = new Date(timeElapsed);
			SimpleDateFormat ft = new SimpleDateFormat("'Days: 'dd 'Months: ' MM 'Years: ' yy");
			System.out.println(ft.format(result));
	//		System.out.println(timeElapsed);
			
		}
	}
