package lab2;

enum Gender {
	M, F;
}

public class PersonClass {

	public PersonClass(String firstName, String lastName, Gender gender,
			long phoneNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNum = phoneNum;
	}

	public PersonClass() {
		super();
	}

	String firstName, lastName;
	Gender gender;
	long phoneNum;

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

	@Override
	public String toString() {
		return "PersonClass\nFirst Name: " + firstName + "\nLast Name: "
				+ lastName + "\nGender: " + gender + "\nPhone Number: "
				+ phoneNum;
	}

}
