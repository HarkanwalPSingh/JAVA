package lab4;

public class CurrentAccount extends Account {
	public CurrentAccount(long accNum, double balance, Person accHolder,
			double overDraftLimit) {
		super(accNum, balance, accHolder);
		this.overDraftLimit = overDraftLimit;
	}

	private final double overDraftLimit;

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	@Override
	public void withdraw(double sum) {
		if(getBalance()>overDraftLimit && (getBalance()-overDraftLimit)>=0)
			setBalance(getBalance()-sum);	
	}
	
	
}
