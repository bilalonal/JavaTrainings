package thenewbostonAndBook;
import javax.swing.JOptionPane;
public class SimpleAveragingProgram {
	public static void main (String[]args){
		int counter = 0;
		int total = 0;
		int average;
		
		
		while(counter < 10){
		String s = JOptionPane.showInputDialog("Enter a Number");
		int grade = Integer.parseInt(s);
		total=total+grade;
		counter++;
		}
		average = total/10;
		JOptionPane.showMessageDialog(null, "Your Average is " + average);
		
		}
}
