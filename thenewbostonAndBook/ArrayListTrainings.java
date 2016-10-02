package thenewbostonAndBook;
import java.util.ArrayList;
public class ArrayListTrainings {
	public static void main (String[]args){
		ArrayList <Integer> weeklyTemperatures = new ArrayList<Integer>();
			weeklyTemperatures.add(78);
			weeklyTemperatures.add(67);
			weeklyTemperatures.add(89);
			weeklyTemperatures.add(94);
			weeklyTemperatures.add(2,100);
			
			System.out.println(weeklyTemperatures.get(0));
			System.out.println(weeklyTemperatures.get(3));
			System.out.println();
		for(int j = 0 ; j<weeklyTemperatures.size();j++){
			System.out.println(weeklyTemperatures.get(j));
			
		}
		
	}
}
