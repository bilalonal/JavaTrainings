package cs2classprojects;

import java.util.Scanner;

public class factorials {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		long fac;
		System.out.print("please enter a nonnegative integer: ");
		num = sc.nextInt();
		while (num < 0) {
			System.out.println("factorial is undefined for negative numbers");
			System.out.print("please enter a non-negative number: ");
			num = sc.nextInt();
		}
		System.out.print(num + "! = ");
		fac = 1;
		while (num > 0) {
			fac *= num;
			num--;
		}
		System.out.println(fac);
	}

}
