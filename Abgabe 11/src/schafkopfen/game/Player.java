package schafkopfen.game;

import schafkopfen.gameview.Animations;
import schafkopfen.gameview.Card;

class Player {
    private Animations animations;
    private String name;
    private int playerNumber;
    private Card[] hand;

    Player(Animations animations, String name, int playerNumber) {
        this.animations = animations;
        this.name = name;
        this.playerNumber = playerNumber;
    }

    void setHand(Card[] hand) {
        this.hand = hand;
        animations.showPlayersHand(playerNumber, name, this.hand);
    }

    void sortCards() {
        CardSorter cardSorter = new CardSorter(hand);
        if (playerNumber % 2 == 0) {
            cardSorter.bubbleSort();
        } else {
            cardSorter.selectionSort();
        }
        hand = cardSorter.getHand();
        animations.showPlayersHand(playerNumber, name, hand);
    }
}
