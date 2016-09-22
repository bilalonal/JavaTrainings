package cs2classprojects;

import java.util.Random;

public class RollingDice {

    public static void main(String[] args) {
        Random rd = new Random();
        int dice1, dice2, total;

        dice1 = rd.nextInt(6) + 1;
        dice2 = rd.nextInt(6) + 1;

        total = dice1 + dice2;
        System.out.println("First number is " + dice1 + " and Second number is " + dice2 + " and their total is " + total);

    }

}
