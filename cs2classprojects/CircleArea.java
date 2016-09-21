package cs2classprojects;
import java.text.DecimalFormat;
public class CircleArea {
	public static void main(String[]args){
		int radius = 2;
		final double PI = 3.14159;
		double area = PI * radius*radius;
		System.out.println(area);
		
		radius = 7;
		area = PI * radius*radius;
		System.out.println(area);
		DecimalFormat fmt = new DecimalFormat("0.##");		
		
		
		System.out.println("The area of the circle is " + fmt.format(area));
		
		DecimalFormat dc = new DecimalFormat ("0.####");
		System.out.println (dc.format(area));
		


	}

}
