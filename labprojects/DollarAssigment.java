package labprojects;
import java.util.Scanner;
// import for scanner

public class DollarAssigment {
	public static void main(String[]args){
		
		Scanner bilal = new Scanner(System.in);
		//Defining the scanner "bilal"
		double money = bilal.nextDouble();
		//Getting the user's input
		
		int  twenty = (int)(money / 20); // Calculating the how many 20 dollar bills we have
			if (twenty != 0){// With this line, if we don't have any 20 dollar bills, the program does not print anything about 20 dollar bills.
				System.out.println(twenty + " Twenty Dollar Bills");
			}
			
		money = money % 20.0;//Calculating the how much money left
		int ten = (int)(money / 10); //Calculating the how many 10 dollar bills we have
			if (ten != 0){
				System.out.println(ten + " Ten Dollar Bills");
			}

		money = money % 10.0; //Calculating the how much money left
		int five = (int)(money / 5); //Calculating the how many 5 dollar bills we have
			if (five != 0){
				System.out.println(five + " Five Dollar Bills");
			}

		money = money % 5.0;//Calculating the how much money left
		int one = (int)money; // % to something by 1 is not changing anything so we just turn our money variable to integer for the good output.  
			if (one != 0){
				System.out.println(one + " One Dollar Bills");
			}
		
		money = money % 1.0; //Calculating the how much money left
		if(money % 0.01 > 0.0099999999) money += 0.01;//Sometimes compiler count the solution wrongly and it does not count just 1 penny.
		// I added this lane for the missing penny
		int quarter = (int)(money * 4);// dividing by 0.25 means multiple by 4. On this step we are calculating the how many quarters we have.
			if (quarter != 0){
				System.out.println(quarter + " Quarters");
			}

		money = money % 0.25; //Calculating the how much money left
		int dime = (int)(money * 10); // dividing by 0.10 means multiple by 10. On this step we are calculating the how many dimes we have.
			if (dime != 0){
				System.out.println( dime + " Dimes");
			}

		money = money % 0.1;//Calculating the how much money left
		int nickel = (int)(money * 20);// dividing by 0.05 means multiple by 20. On this step we are calculating the how many nickels we have.
			if (nickel != 0){
				System.out.println(nickel + " Nickels");
			}
		
		money = money % 0.05;//Calculating the how much money left
		
		int penny = (int)(money * 100);// dividing by 0.01 means multiple by 100. On this step we are calculating the how many pennies we have.
			if (penny != 0){
				System.out.println(penny + " Pennies");
			}		
	}
}

	
	
				
		
	


