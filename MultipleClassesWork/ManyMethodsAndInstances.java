package MultipleClassesWork;
import java.util.Scanner;

public class ManyMethodsAndInstances {
	public  static void main (String[]args){
		Scanner input = new Scanner(System.in);
		MMAI Mobject = new MMAI();
		System.out.println("Enter name of first gf here: ");
		String temp = input.nextLine();
		
		Mobject.setName(temp);
		Mobject.saying();
	}
}
