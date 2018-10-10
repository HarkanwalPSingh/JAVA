package com.cg.banking.services;
import java.util.List;
import com.cg.banking.beans.Account;
import com.cg.banking.beans.Transaction;
import com.cg.banking.exceptions.AccountBlockedException;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.exceptions.InsufficientAmountException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.exceptions.InvalidPinNumberException;

public class BankingServicesImpl implements BankingServices {

	@Override
	public long openAccount(String accountType, float initBalance)
			throws InvalidAmountException, InvalidAccountTypeException, BankingServicesDownException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float depositAmount(long accountNo, float amount)
			throws AccountNotFoundException, BankingServicesDownException, AccountBlockedException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float withdrawAmount(long accountNo, float amount, int pinNumber) throws InsufficientAmountException,
			AccountNotFoundException, InvalidPinNumberException, BankingServicesDownException, AccountBlockedException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean fundTransfer(long accountNoTo, long accountNoFrom, float transferAmount, int pinNumber)
			throws InsufficientAmountException, AccountNotFoundException, InvalidPinNumberException,
			BankingServicesDownException, AccountBlockedException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account getAccountDetails(long accountNo) throws AccountNotFoundException, BankingServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllAccountDetails() throws BankingServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> getAccountAllTransaction(long accountNo)
			throws BankingServicesDownException, AccountNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String accountStatus(long accountNo)
			throws BankingServicesDownException, AccountNotFoundException, AccountBlockedException {
		// TODO Auto-generated method stub
		return null;
	}

}
