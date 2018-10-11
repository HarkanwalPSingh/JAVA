package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

enum Gender {
	M, F;
}

public class PersonClass {

	public PersonClass(String firstName, String lastName, Gender gender,
			long phoneNum, Date dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.dob = dob;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public PersonClass() {
		super();
	}

	String firstName, lastName;
	Gender gender;
	long phoneNum;
	Date dob;

	
	@Override
	public String toString() {
		return "PersonClass\nFirst Name: " + firstName + "\nLast Name: "
				+ lastName + "\nGender: " + gender + "\nPhone Number: "
				+ phoneNum + "\n" + fullName()+"\nage: "+ age();
	}

	public int age(){
		Period p = Period.between(LocalDate.of(dob.getYear(), dob.getMonth(), dob.getDate()), LocalDate.now());
		return p.getYears();
	}

	public String fullName() {
		return "Full Name: " + firstName + " " + lastName;
	}

}
