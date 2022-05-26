package indianajones.gamepieces;

public class Grail extends GamePiece {
    public Grail(int lines, int columns) {
        super(lines, columns);
        this.display = 'G';
        this.line = (int) (Math.random() * (lines - 1));
        this.column = (int) (Math.random() * (columns - 1));
    }

    public void makeInvisible() {
        display = ' ';
    }

    @Override
    public void move() { }
}
