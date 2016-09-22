package thenewbostonAndBook;
import java.lang.Math;
public class CompoundInterestProgram {
	public static void main (String[]args){
		double amount;
		double rate = .01;
		double principal=100;
		
		for(int day=1;day<=365;day++){
			amount = principal * Math.pow(1+rate,day);
			System.out.println((int)amount);
		}
	}
}
