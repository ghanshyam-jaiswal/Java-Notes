package com.bank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "account_seq")
	@SequenceGenerator(name="account_seq",initialValue = 100000000,allocationSize = 1)
	private long account_number;
	private String bank_name;
	private String IFSC;
	private double balance;
	private String branch;
	private int pin;
	private AccountType type;
	@ManyToOne
	private User user;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(long account_number, String bank_name, String iFSC, double balance, String branch, int pin,
			AccountType type, User user) {
		super();
		this.account_number = account_number;
		this.bank_name = bank_name;
		IFSC = iFSC;
		this.balance = balance;
		this.branch = branch;
		this.pin = pin;
		this.type = type;
		this.user = user;
	}
	public long getAccount_number() {
		return account_number;
	}
	public String getBank_name() {
		return bank_name;
	}
	public String getIFSC() {
		return IFSC;
	}
	public double getBalance() {
		return balance;
	}
	public String getBranch() {
		return branch;
	}
	public int getPin() {
		return pin;
	}
	public AccountType getType() {
		return type;
	}
	public User getUser() {
		return user;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public void setType(AccountType type) {
		this.type = type;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	
	
	
	
}
