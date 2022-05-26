package cake;

public class Cake {
    String name;
    int pieces;
    double priceOfPiece;

    public Cake(String name, int pieces, double priceOfPiece) {
        this.name = name;
        this.pieces = pieces;
        this.priceOfPiece = priceOfPiece;
    }

    public void takeOneAway() {
        if (pieces > 0) {
            pieces--;
        }
    }

    public void print() {
        System.out.println(name + " mit " + pieces + " Stücken. Restwert: " + restPrice() + " Euro.");
    }

    public double restPrice() {
        return Math.round(priceOfPiece * pieces * 10) / 10.0;
    }
}
