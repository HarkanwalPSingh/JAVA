package lab3;
import java.text.SimpleDateFormat;
import java.util.*;
public class Lab3_5 {
	public static void warrantee(Date date, int period){
		Long periodInMilli = period*30*24*60*60*1000L;
		SimpleDateFormat ft = new SimpleDateFormat("MM-yyyy");
		Date dateExpire = new Date(date.getTime()+periodInMilli);
		System.out.println(ft.format(dateExpire));
	}
}
