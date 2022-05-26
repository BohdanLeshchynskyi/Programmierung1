package schafkopfen.game;

import schafkopfen.gameview.Card;

import java.util.Random;

class Performance {
    public static void main(String[] args) {
        Card[] deck = Card.createFreshDeckWith32Cards();
        Card[] hand = new Card[8];
        Random random = new Random();
        System.out.println("Starte Selectionsort");
        for (int run = 1; run <= 1_000_000; run++) {
            random.setSeed(run);
            for (int i = 0; i < 8; i++) {
                hand[i] = deck[random.nextInt(32)];
            }
            CardSorter cardSorter = new CardSorter(hand);
            cardSorter.selectionSort();
        }
        System.out.println("Selectionsort beendet");
        random.setSeed(5);
        System.out.println("Starte Bubblesort");
        for (int run = 1; run <= 1_000_000; run++) {
            random.setSeed(run);
            for (int i = 0; i < 8; i++) {
                hand[i] = deck[random.nextInt(32)];
            }
            CardSorter cardSorter = new CardSorter(hand);
            cardSorter.bubbleSort();
        }
        System.out.println("Bubblesort beendet");
    }
}
