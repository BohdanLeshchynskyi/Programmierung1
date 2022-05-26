package schafkopfen.game;

import schafkopfen.gameview.Card;

class CardSorter {
    private Card[] hand;
    private String[] colors;
    private String[] schafkopfColors;
    private String[] ranks;

    CardSorter(Card[] hand) {
        this.hand = hand;
        this.colors = new String[] {"Eichel", "Gruen", "Herz", "Schelln"};
        this.schafkopfColors = new String[] {"Herz", "Eichel", "Gruen", "Schelln"};
        this.ranks = new String[] {"O", "U", "A", "K", "10", "9", "8", "7"};
    }

    Card[] getHand() {
        return this.hand;
    }

    private int indexOf(String toFind, String[] list) {
        for (int i = 0; i < list.length; i++) {
            if (toFind.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    /*private boolean firstCardIsHigherThanSecondCard(Card firstCard, Card secondCard) {
        return indexOf(firstCard.rank, ranks) < indexOf(secondCard.rank, ranks) ||
                indexOf(firstCard.rank, ranks) == indexOf(secondCard.rank, ranks) &&
                indexOf(firstCard.color, colors) < indexOf(secondCard.color, colors);
    }*/

    private boolean firstCardIsHigherThanSecondCard(Card firstCard, Card secondCard) {
        int indexOfFirstCardRank = indexOf(firstCard.rank, ranks);
        int indexOfSecondCardRank = indexOf(secondCard.rank, ranks);
        int indexOfFirstCardColor = indexOf(firstCard.color, colors);
        int indexOfSecondCardColor = indexOf(secondCard.color, colors);
        return  indexOfSecondCardRank <= 1 && (indexOfFirstCardRank < indexOfSecondCardRank
                || indexOfFirstCardRank == indexOfSecondCardRank
                   && indexOfFirstCardColor < indexOfSecondCardColor) // checking case of to cards being O or U
                || indexOfFirstCardRank <= 1 && indexOfSecondCardRank > 1 // checking first being O or U and the second some other card(not O or U)
                || indexOfFirstCardRank > 1 && indexOfSecondCardRank > 1  // checking other cards(not O or U)
                   && (indexOf(firstCard.color, schafkopfColors) < indexOf(secondCard.color, schafkopfColors)
                     || indexOf(firstCard.color, schafkopfColors) == indexOf(secondCard.color, schafkopfColors)
                        && indexOfFirstCardRank < indexOfSecondCardRank);
    }

    void selectionSort() {
        for (int i = 0; i < hand.length - 1; i++) {
            Card iThBiggestCard = hand[i];
            int iThBigggestIndex = i;
            for (int j = i + 1; j < hand.length; j++) {
                if (firstCardIsHigherThanSecondCard(hand[j], iThBiggestCard)) {
                    iThBiggestCard = hand[j];
                    iThBigggestIndex = j;
                }
            }
            Card temp = hand[i];
            hand[i] = iThBiggestCard;
            hand[iThBigggestIndex] = temp;
        }
    }

    void bubbleSort() {
        for (int i = 0; i < hand.length; i++) {
            for (int j = hand.length - 1; j > i; j--) {
                if (firstCardIsHigherThanSecondCard(hand[j], hand[j - 1])) {
                  Card temp = hand[j - 1];
                  hand[j - 1] = hand[j];
                  hand[j] = temp;
                }
            }
        }
    }
}
