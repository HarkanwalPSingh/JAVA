package lab4;

public class SavingsAccount extends Account{
	
	public SavingsAccount(long accNum, double balance, Person accHolder,
			double minimumBalance) {
		super(accNum, balance, accHolder);
		this.minimumBalance = minimumBalance;
	}

	private final double minimumBalance;

	public double getMinimumBalance() {
		return minimumBalance;
	
	
	}

	@Override
	public void withdraw(double sum) {
		if(getBalance()>getMinimumBalance() && (getBalance()-sum)>=getMinimumBalance())
			setBalance(getBalance()-sum);	
	}
	
	

	
	
	
	}
	
