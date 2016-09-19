package labprojects;

import java.util.Random;

public class TelephoneNumberCreator {

	public static void main(String[] args) {
		int e, f;
		Random rndm = new Random();
		int a = rndm.nextInt(8);
		int b = rndm.nextInt(8);
		int c = rndm.nextInt(8);

		int d = rndm.nextInt(8);
		if (d == 7) {
			e = rndm.nextInt(5);
			if (e == 4) {
				f = rndm.nextInt(3);
			} else {
				f = rndm.nextInt(10);
			}
		} else {
			e = rndm.nextInt(10);
			f = rndm.nextInt(10);
		}
		int g = rndm.nextInt(10);
		int h = rndm.nextInt(10);
		int i = rndm.nextInt(10);
		int j = rndm.nextInt(10);

		System.out.println(a + "" + b + "" + c + " " + d + "" + e + "" + f + " " + g + "" + h + "" + i + "" + "" + j);
	}
}
