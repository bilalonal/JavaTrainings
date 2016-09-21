package cs2classprojects;
import java.util.Scanner;
public class IdealWeight {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
			System.out.println("Feet: " );
			int feet = sc.nextInt();
			
			System.out.println("Inches: ");
			int inc = sc.nextInt();
			
			int idealMale = 106 + feet * 6;
			
			System.out.println("Ideal weight for a " + feet + " foot, " + inc + " inc for male is " + idealMale + " pounds");
			
			double minIM = idealMale - (0.15 * idealMale);
			double maxIM = idealMale + (0.15 * idealMale);
			System.out.println("Ideal weight for male should be between " + minIM + " and " + maxIM + " pounds.");
			
			int idealFemale = 100 + feet * 5;
			
			System.out.println("Ideal weight for a " + feet + " foot, " + inc + " inc for female is " + idealFemale + " pounds");
			
			minIM = idealFemale - (0.15 * idealFemale);
			maxIM = idealFemale + (0.15 * idealFemale);
			System.out.println("Ideal weight for female should be between " + minIM + " and " + maxIM + " pounds.");
						
	}
}
