package com.cg.project.collectiondemo;
import java.util.Comparator;
import com.cg.project.beans.Associate;
public class AssociateComparator implements Comparator<Associate>{

	@Override
	public int compare(Associate e1	, Associate e2) {
		return e1.getSalary() - e2.getSalary();
	}

}
