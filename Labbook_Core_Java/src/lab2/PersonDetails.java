package lab2;

public class PersonDetails {

	public PersonDetails(String firstName, String lastName, char gender,
			int age, double weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	String firstName,lastName;
	char gender;
	int age;
	double weight;
	@Override
	public String toString() {
		return "PersonDetails: \n-------------------\nFirstname: " + firstName + "\nLastname: "
				+ lastName + "\nGender: " + gender + "\nAge: " + age
				+ "\nWeight: " + weight;
	}
	
	}
	
	


