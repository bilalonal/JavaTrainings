package hackerrank;
import java.util.Scanner;
public class lengthOfString {
	public static void main(String[]args){
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        int i = A.length();
	        int j = B.length();
	        int total = i + j;
	        
	        System.out.println(A.compareTo(B));
		
		
		
	}
}
