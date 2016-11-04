package com.capgemini.service;

import java.util.List;

import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientInitialBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.model.Account;
import com.capgemini.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {

	AccountRepository accountRepository;
	public AccountServiceImpl(AccountRepository accountRepository)
	{
		this.accountRepository=accountRepository;
	}
	@Override
	public Account createAccount(int accountNumber, int amount) throws InsufficientInitialBalanceException {
		
		if(amount<500)
		{
			throw new InsufficientInitialBalanceException();
		}
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setAmount(amount);
		
		if(accountRepository.save(account))
		{
			return account;
		}
		
		
		return null;
	}

	@Override
	public Account depositAmount(int accountNumber, int amount) throws InvalidAccountNumberException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account withdrawAmount(int accountNumber, int amount)
			throws InvalidAccountNumberException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> fundTransfer(int fromAccount, int toAccount, int amount)
			throws InvalidAccountNumberException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		return null;
	}

}
