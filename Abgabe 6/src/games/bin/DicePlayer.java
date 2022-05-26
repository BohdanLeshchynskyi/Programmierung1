package games.bin;

import games.dice.Dice;

public class DicePlayer {
    public static void main(String[] args) {
        Dice dice1 = new Dice("rot");
        Dice dice2 = new Dice("grün");

        double summe1 = 0;
        double summe2 = 0;
        for (int i = 0; i < 5; i++) {
            dice1.toPlayDice();
            dice2.toPlayDice();
            summe1 += dice1.getDotsNum();
            summe2 += dice2.getDotsNum();
            dice1.print();
            dice2.print();
        }

        System.out.println("Mittelwert Würfel " + dice1.getColor() + ": " + (Math.round(summe1 / 4 * 10) / 10.0));
        System.out.println("Mittelwert Würfel " + dice2.getColor() + ": " + (Math.round(summe2 / 4 * 10) / 10.0));
    }
}
