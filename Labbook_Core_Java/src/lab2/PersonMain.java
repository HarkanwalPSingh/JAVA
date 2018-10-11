package lab2;

public class PersonMain {
	public static void main(String[] args) {
		try {
			PersonClass person1 = new PersonClass("Sahil", "", Gender.M, 9448562278L);
			if (person1.getFirstName() == null || person1.getFirstName() == "")
				throw new Exception("First Name can't be empty");
			if (person1.getLastName() == null || person1.getLastName() == "")
				throw new Exception("Last Name can't be empty");
			System.out.println(person1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
