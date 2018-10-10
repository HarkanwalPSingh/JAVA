package com.cg.project.collectiondemo;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Stream;

import javax.naming.ldap.SortControl;

/*import com.cg.project.collectiondemo.AssociateComparator;*/
import com.cg.project.beans.Associate;

public class ListClassesDemo {

	public static void arrayListClass() {

		ArrayList<Associate> associateList = new ArrayList<>();

		associateList.add(new Associate(101, 15000, "Sahil"));
		associateList.add(new Associate(102, 13000, "Kumar"));
		associateList.add(new Associate(103, 12000, "Suresh"));
		associateList.add(new Associate(100, 12000, "Lukesh"));
		// associateList.remove(2);
		// Associate associateToBeSearched = new Associate(102, 13000, "Kumar");

		// System.out.println(associateList.contains(associateToBeSearched));
		// System.out.println(associateList.indexOf(associateToBeSearched));
		//
		// Collections.sort(associateList);
		Collections.sort(associateList);

		for (Associate associate : associateList) {
			System.out.println(associate);
			/*
			 * if(associate.getAssociateId()==103 &&
			 * associate.getName().equals("Suresh"))
			 * System.out.println(associateList.indexOf(associate));
			 */
		}
	}

	public static void linkedListClass() {
		LinkedList<Associate> associateList = new LinkedList<>();

		associateList.add(new Associate(101, 15000, "Sahil"));
		associateList.add(new Associate(102, 13000, "Kumar"));
		associateList.add(new Associate(100, 12000, "Lukesh"));
		associateList.add(new Associate(102, 13000, "Kumar"));
		associateList.add(new Associate(103, 12000, "Suresh"));

		// Collections.sort(associateList, new AssociateComparator());

		// Collections.sort(associateList);
		// Comparator<Associate> compare
		// =(a1,a2)->a1.getSalary()-a2.getSalary();
		Collections.sort(associateList,
				(a1, a2) -> a1.getSalary() - a2.getSalary());
		/*
		 * The below statement is consolidated one for this statement:
		 * Stream<Associate> stream1 = associateList.stream(); Stream<Associate>
		 * stream2 = stream1.distinct(); Stream<Associate> stream3 =
		 * stream2.filter(e->e.getName().startsWith("S"));
		 * stream3.forEach(associate->System.out.println(associate));
		 */

		associateList.stream().distinct()
				.filter(e -> e.getName().startsWith("S"))
				.forEach(associate -> System.out.println(associate));

		/*
		 * for(Associate a : associateList){ System.out.println(a); }
		 */

	}

	public static void hastSetClass() {
		HashSet<Associate> associateSet = new HashSet<>();
		associateSet.add(new Associate(101, 15000, "Sahil"));
		associateSet.add(new Associate(102, 13000, "Kumar"));
		associateSet.add(new Associate(100, 12000, "Lukesh"));
		associateSet.add(new Associate(102, 13000, "Kumar"));
		associateSet.add(new Associate(103, 12000, "Suresh"));

		for (Associate associate : associateSet)
			System.out.println(associate);

	}
}
