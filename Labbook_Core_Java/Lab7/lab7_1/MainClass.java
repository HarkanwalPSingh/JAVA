package lab7_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("KitKat");
		list.add("Bounty");
		list.add("Snickers");
		list.add("FiveStar");
		list.add("Dairy Milk");
		list.add("KitKat");
//	Collections.sort(list, new CollectionComparator());

		Collections.sort(list);

		/*
		 * Iterator<String> itr = list.iterator(); while (itr.hasNext())
		 * System.out.println(itr.next());
		 */

		for (String str : list) {
			System.out.println(str);
		}
		
		
	}

}
