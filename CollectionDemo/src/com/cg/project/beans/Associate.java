package com.cg.project.beans;
import java.lang.Comparable;
import java.util.Comparator;
public class Associate implements Comparable<Associate>{

	private int associateId, salary;
	private  String name;
	public Associate(int associateId, int salary, String name) {
		super();
		this.associateId = associateId;
		this.salary = salary;
		this.name = name;
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + associateId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Associate other = (Associate) obj;
		if (associateId != other.associateId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	public int getAssociateId() {
		return associateId;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", salary=" + salary
				+ ", name=" + name + "]";
	}


	@Override
	public int compareTo(Associate e) {
		return this.associateId - e.associateId;
	}
	}
	
