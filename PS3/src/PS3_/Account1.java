package PS3_;
import java.util.Date;

import PS3_.InsufficientFundsException;

public class Account1 {
	private int ID=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreated;
	
	public Account1() {
		
	}
	
//account
	public void Account(int ID, double balance){
		this.ID=ID;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
		this.dateCreated=new Date();
		
	}
//access ID
	public int setID(){
		return ID;
	}
	
//accessBalance
	public double setBalance(){
		return balance;
	}
	
//accessInterest
	public double getInterest(){
		return annualInterestRate;
				
	}
	
//get ID
	public void getID(int ID) {
		this.ID=ID;
		
	}

//get Balance
	public void getBalance(double balance) {
		this.balance=balance;
		
	}
	
//getAnnualInterestRate
	public void getAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
//access date
	public Date accessDate() {
		return dateCreated;
	}
	
//Monthly Interest
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
		
	}

//Withdraw
	 public void withdraw(double amount) throws InsufficientFundsException {
		 
		 if(amount <= balance)
	{
			 balance -= amount;
	}
		 else
		 {
			 double needs = amount - balance;
			 throw new InsufficientFundsException();
		}	
		}
//deposit	
	public void deposit(double amountDeposited) {		
		double updatedBalance=balance+amountDeposited;
		
	}
}