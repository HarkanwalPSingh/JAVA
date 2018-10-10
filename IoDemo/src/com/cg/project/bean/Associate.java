package com.cg.project.bean;
import java.io.Serializable;
public class Associate implements Serializable{
	public Associate(int associateId, int salary, String name, Address address) {
		super();
		this.associateId = associateId;
		this.salary = salary;
		this.name = name;
		this.address = address;
	}
	private int associateId;
	transient private int salary;
	private String name;
	private Address address;
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", salary=" + salary
				+ ", name=" + name + ", address=" + address + "]";
	}
	
	

}
