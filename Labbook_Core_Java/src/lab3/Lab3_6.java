package lab3;
import java.text.SimpleDateFormat;
import java.util.*;
public class Lab3_6 {
	public static void formatDateToString(Date date, String format,
			String timeZone) {
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		if (timeZone == null || "".equalsIgnoreCase(timeZone.trim())) {
			timeZone = Calendar.getInstance().getTimeZone().getID();
		}
	
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		
		System.out.println("The time for Time Zone "+timeZone+" is "+ sdf.format(date));
	}

}
