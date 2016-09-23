package bankAccount;

public class ManageAccounts {
	public static void main(String[] args) {
		Account acct1, acct2;
		
		
		//create account1 for Sally with $1000
		acct1= new Account (1000,"Sally", 1111);
		
		
		//create account2 for Joe with $500
		acct2= new Account (500,"Joe",12345);
		
		//deposit $100 to joe's account
		acct2.deposit(100);
			
		//print joe's new balance (use get balance())
		System.out.println("Joe's new balance is $" + acct2.getBalance());
		
		//withdraw $50 from Sally's account
		acct1.withdraw(50);
		
		//print Sally's new balance (use get balance())
		System.out.println("Sally's new balance is $" + acct1.getBalance());
		
		//charge fees to both accounts
		acct1.chargeFee();
		System.out.println("Sally's new balance after charging a fee is $" + acct1.getBalance());
		acct2.chargeFee();
		System.out.println("Joe's new balance after charging a fee is $" + acct2.getBalance());
		
		//Change the name on Joe's account to Joseph
		acct2.changeName("Joseph");
		
		//print summary for both account
		System.out.println(acct1.toString());
		System.out.println(acct2.toString());
		
		
		
	}
}
