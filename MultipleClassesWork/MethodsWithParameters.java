package MultipleClassesWork;
import java.util.Scanner;
public class MethodsWithParameters {
	
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		MwP mwpObject = new MwP();
		
		System.out.println("Enter your Name: ");
		String name = input.nextLine();
		
		mwpObject.sMessage(name);
		
		
		
		
		
	}

}
