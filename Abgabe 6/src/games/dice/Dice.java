package games.dice;

public class Dice {
    private String color;
    private int dotsNum;

    public Dice(String color) {
        this.color = color;
        this.dotsNum = 6;
    }

    public String getColor() {
        return color;
    }

    public int getDotsNum() {
        return dotsNum;
    }

    public void print() {
        System.out.println("Würfel " + color + ": " + dotsNum);
    }

    public void toPlayDice() {
        dotsNum = 1 + (int) (Math.random() * 6);
    }
}
