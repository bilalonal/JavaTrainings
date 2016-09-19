package labprojects;

import java.util.Scanner;

public class DistanceBetween2pts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first point's cordinate: \n" + "x: ");
		int x1 = sc.nextInt();
		System.out.print("y: ");
		int y1 = sc.nextInt();
		System.out.print("Enter your second point's cordinate: \n" + "x: ");
		int x2 = sc.nextInt();
		System.out.print("y: ");
		int y2 = sc.nextInt();

		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println(distance);

	}

}
