package labprojects;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class GuessWindow {

	public static void main(String[] args) {
		int numToGuess;
		int guess;

		Random generator = new Random();

		numToGuess = generator.nextInt(10) + 1;
		String s = JOptionPane.showInputDialog("Please enter a number between 1 to 10: ");
		guess = Integer.parseInt(s);

		int countHigh = 0;
		int countLow = 0;
		if (guess > 0 && guess < 11) {

			while (guess != numToGuess) {
				if (guess < numToGuess) {
					s = JOptionPane.showInputDialog("Your guess is wrong. Try a bigger number: ");
					countLow++;
					guess = Integer.parseInt(s);

				} else {
					s = JOptionPane.showInputDialog("Your guess is wrong. Try a smaller number: ");
					countHigh++;
					guess = Integer.parseInt(s);
				}
			}
			ArrayList<String> printings = new ArrayList<String>();

			int total = countLow + countHigh + 1;

			if (countLow > 0)
				printings.add("You guessed " + countLow + " times lower number.\n");

			if (countHigh > 0)
				printings.add("You guessed " + countHigh + " times higher number.\n");

			if (countHigh > 0 || countLow > 0)
				printings.add("You tried totally " + total + " times.\n");

			if (countHigh == 0 && countLow == 0)
				printings.add("You know the number on your first time!!\n");

			JOptionPane.showMessageDialog(null, printings.toString().replace("[", "").replace("]", "").replace(",", ""),
					"Congratulations!!", JOptionPane.INFORMATION_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(null, "Invalid Number!!", "Game Over", JOptionPane.ERROR_MESSAGE);
		}
	}
}
