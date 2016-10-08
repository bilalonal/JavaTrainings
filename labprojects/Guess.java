package labprojects;

import java.util.Scanner;
import java.util.Random;

public class Guess {
	public static void main(String[] args) {
		int numToGuess;
		int guess;

		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		// randomly generate the number to guess
		numToGuess = generator.nextInt(10) + 1;

		// print message asking user to enter a guess
		System.out.print("Please enter a number between 1 to 10: ");
		// read in guess
		guess = scan.nextInt();
		int countHigh = 0;
		int countLow = 0;
		if (guess > 0 && guess < 11) {

			while (guess != numToGuess) {
				// keep going as long as the guess is wrong

				if (guess < numToGuess) {
					// print message saying guess is wrong
					System.out.print("Your guess is wrong. Try a bigger number: ");
					countLow++;
					// print message saying guess is wrong
					guess = scan.nextInt();
				} else {
					// print message saying guess is wrong
					System.out.print("Your guess is wrong. Try a smaller number: ");
					countHigh++;
					// print message saying guess is wrong
					guess = scan.nextInt();

				}
			}
			// print message sating guess is right
			System.out.println("Congratulations!! Your guess is right.");
			int total = countLow + countHigh + 1;
			// don't forget to write that how many times user tried
			if (countLow > 0) {
				System.out.println("you guessed " + countLow + " times lower number");
			}
			if (countHigh > 0) {
				System.out.println("You guessed " + countHigh + " times higher number");
			}
			if (countHigh > 0 || countLow > 0) {
				System.out.println("You tried totally " + total + " times.");
			}
			if (countHigh == 0 && countLow == 0) {
				System.out.println("You know the number on your first time!!");
			}
		} else {

			System.out.println("Invalid number!");
			System.out.print("Game Over!!!");
		}
	}
}
