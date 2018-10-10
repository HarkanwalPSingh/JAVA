package com.cg.billing.client;

import java.io.ObjectInputStream.GetField;

import com.cg.billing.beans.Address;
import com.cg.billing.beans.Customer;

public class MainClass {

	public static void main(String[] args) {
		Customer customer1 = new Customer(101, 987565412, 15694123, "Sahil", "Singh", "sahil@gmail.com", "ABCD12342", "1996-01-01");
		Address address1=new Address("Ludhiana", "India", "Punjab", 141002);
		customer1 = new Customer(address1);
		System.out.println("The city of customer "+customer1.getFirstName()+" "+customer1.getLastName()+" is "+customer1.getAddress().getCity());
		
	}

}
