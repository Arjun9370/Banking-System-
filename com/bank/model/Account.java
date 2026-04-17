package com.bank.model;
public class Account 
{
	private int account_no;
	private String name;
	private double balance;

	// constructor 
	public Account(int account_no , String name , double balance)
	{
		this.account_no = account_no;
		this.name = name;
		this.balance=balance;
	}
	//get and set account number 
	public int getAccount_no()
	{
		return account_no;
	}
	public void setAccount_no(int account_no)
	{
		this.account_no=account_no;
	}
	//get and set account holder name 
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	//get and set the "Balance"
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}


	 public void show()
	{
		System.out.println("Account class say everthing is ok !");
		// System.out.println("avalaible balance : " +	balance);

	}
}