package bankAccount;

import java.text.NumberFormat;

public class Account {
	private double balance;
	private String name;
	private long acctNum;
	
	//constructor -- initializes balance, owner, account number
	public Account (double initBal, String owner, long number){
		balance= initBal;
		name = owner;
		acctNum= number;
	}
	
	
	//Checks to see if balance is sufficient for withdrawal
	//If so, decrements balance by amount; if not, prints message.
	public void withdraw(double amount){
		if (balance >= amount){
			balance -= amount;
		}
		else{
			System.out.println("Insufficient funds");
		}
	}	
		
		
	//adds deposit amount to balance
	public void deposit(double amount){
		balance += amount;
	}
	
	
	//returns balance.
	public double getBalance(){
		return balance;
	}
	
	
	//Returns a string containing the name, account number, and balance.
	public String toString(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return "Name: " + name + "\n" + "Account number: " + acctNum + "\n" +"Balance : "+ fmt.format(balance);
	}
	
	
	//Deducts $10 service fee.
	public void chargeFee(){
		balance -= 10;
	}
	
	
	//Changes the name on the account.
	public void changeName(String newName){
		name = newName;
	}
}
