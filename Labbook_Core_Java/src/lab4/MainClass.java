package lab4;
import lab4.UserExceptions;
public class MainClass {
	public static void validate(float age) throws UserExceptions {
		if(age<15)
			throw new UserExceptions("Age not valid");
	}
	public static void main(String[] args) {
		Person person1 = new Person("Smith", 10);
		Person person2 = new Person("Kathy",21);
		
		// MODIFIED FOR PROBLEM 5.3
		/*Account account1 = new Account(1234567891L, 2000, person1);
		Account account2 = new Account(9875641231L, 3000, person2);
		account1.deposit(2000);
		account2.withdraw(2000);
		System.out.println(account1);
		System.out.println(account2);*/
		
		SavingsAccount account3 = new SavingsAccount(1234567891L, 2000, person1, 1000);
		try {
			validate(account3.getAccHolder().getAge());
			account3.withdraw(1500);
			System.out.println(account3);
		} catch (UserExceptions e) {
			e.printStackTrace();
		}
		
		
		
	}

}
