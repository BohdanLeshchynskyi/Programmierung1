package schafkopfen.game;

import schafkopfen.gameview.*;
import java.util.Random;
import static java.util.Arrays.copyOfRange;

public class Dealer {
    private Animations animations;
    private Card[] deck;
    private Player[] players;

    Dealer() {
        this.animations = new Animations();
        this.deck = Card.createFreshDeckWith32Cards();
        this.players = new Player[4];
        for (int i = 0; i < 4; i++) {
            players[i] = new Player(animations, "player" + (i + 1), i + 1);
        }
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ignored) {
        }
    }

    private void play() throws IllegalCardDeckException {
        animations.showCardDeckStraight(deck);
        sleep(2000);
        animations.showShuffleAnimation();
        shuffle(System.nanoTime());
        animations.showCardDeckCurved(deck);
        sleep(2000);
        dealCards();
    }

    Card[] getDeck() {
        return this.deck;
    }

    void shuffle(long seed) {
        Random random = new Random(seed);
        Card temp;
        int randIndex;
        for (int i = 0; i < deck.length - 1; i++) {
            randIndex = random.nextInt(deck.length - (1 + i));
            temp = deck[deck.length - (1 + i)];
            deck[deck.length - (1 + i)] = deck[randIndex];
            deck[randIndex] = temp;
        }
    }

    private void checkCardDeckValidity() throws IllegalCardDeckException {
        for (int i = 0; i < deck.length; i++) {
            for (int j = i + 1; j < deck.length; j++) {
                if (deck[i] == null) {
                    throw new IllegalCardDeckException("" + i);
                } else if (deck[i].equals(deck[j])) {
                    throw new IllegalCardDeckException(i + " " + j);
                }
            }
        }
    }

    void dealCards() throws IllegalCardDeckException {
        checkCardDeckValidity();
        for (int i = 1; i <= 4; i++) {
            players[i - 1].setHand(copyOfRange(deck, 8 * i - 8, 8 * i)); //(i == 1 ? 0 : i + 8 - 2)
        }
        sleep(1000);
        for (Player player: players) {
            player.sortCards();
        }
    }

    public static void main(String[] args) throws IllegalCardDeckException {
        Dealer dealer = new Dealer();
        dealer.play();
    }
}