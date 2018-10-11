package lab4;

//This class is made abstract for question in Lab5, Problem 5.3

public abstract class Account {
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public Account(){
		super();
	}
	private long accNum;
	private double balance;
	private Person accHolder = new Person();
	
	public void deposit(double sum){
		setBalance(getBalance()+sum);
	}
	public void withdraw(double sum){
		if(getBalance()>500 && (getBalance()-sum)>=500)
			setBalance(getBalance()-sum);			
	}
	/*public double getBalance(){
		return 0;
	}*/
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder=" + accHolder + "]";
	}
	
}