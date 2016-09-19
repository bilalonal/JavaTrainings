package labprojects;
import javax.swing.JOptionPane;
// import for scanner
public class DollarAssigmentWindow {
	public static void main(String[]args){
		String s = JOptionPane.showInputDialog("How much money do you have?");
		//Getting the user's input
		double money = Double.parseDouble(s);
		//changing the user's string input to double		
		
		int  twenty = (int)(money / 20); // Calculating the how many 20 dollar bills we have
					
		money = money % 20.0;//Calculating the how much money left
		int ten = (int)(money / 10); //Calculating the how many 10 dollar bills we have
		
		money = money % 10.0; //Calculating the how much money left
		int five = (int)(money / 5); //Calculating the how many 5 dollar bills we have
		
		money = money % 5.0;//Calculating the how much money left
		int one = (int)money; // % to something by 1 is not changing anything so we just turn our money variable to integer for the good output.  
				
		money = money % 1.0; //Calculating the how much money left
		if(money % 0.01 > 0.0099999999) money += 0.01;//Sometimes compiler count the solution wrongly and it does not count just 1 penny.
		//I added this lane for the missing penny
		
		int quarter = (int)(money * 4);// dividing by 0.25 means multiple by 4. On this step we are calculating the how many quarters we have.
		
		money = money % 0.25; //Calculating the how much money left
		int dime = (int)(money * 10); // dividing by 0.10 means multiple by 10. On this step we are calculating the how many dimes we have.

		money = money % 0.1;//Calculating the how much money left
		int nickel = (int)(money * 20);// dividing by 0.05 means multiple by 20. On this step we are calculating the how many nickels we have.
		
		money = money % 0.05;//Calculating the how much money left
		int penny = (int)(money * 100);// dividing by 0.01 means multiple by 100. On this step we are calculating the how many pennies we have.
						
		JOptionPane.showMessageDialog(null, twenty + " Twenty Dollar Bills\n" +  ten + " Ten Dollar Bills\n" + five + " Five Dollar Bills\n" 
		+ one + " One Dollar Bills\n" + quarter + " Quarters\n" + dime + " Dimes\n"+ nickel + " Nickels\n" + penny + " Pennies" );
	}
}

	
	
				
		
	


