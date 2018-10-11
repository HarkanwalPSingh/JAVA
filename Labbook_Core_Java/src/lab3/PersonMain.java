package lab3;

import java.util.*;

public class PersonMain {

	public static void main(String[] args) {
		Date dob1 = new Date(1996, 11, 30);
		PersonClass person1 = new PersonClass("Sahil", "Singh", Gender.M, 9448562278L,dob1);
		System.out.println(person1);
//		System.out.println(person1.fullName());

	}

}
