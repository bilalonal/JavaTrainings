package thenewbostonAndBook;
import java.util.Scanner;
public class BasicCalculator {
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter the first number: ");
		fnum = sc.nextDouble();
		System.out.println("Enter the second number: ");
		snum = sc.nextDouble();
		answer = snum + fnum;
		System.out.println(answer);
		
		
		
}
}
