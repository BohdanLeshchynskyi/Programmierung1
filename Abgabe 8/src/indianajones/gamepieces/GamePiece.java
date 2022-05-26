package indianajones.gamepieces;

public abstract class GamePiece {
    protected int lines;
    protected int columns;
    protected int line;
    protected int column;
    protected char display;

    protected GamePiece(int lines, int columns) {
        this.lines = lines;
        this.columns = columns;
    }

    public abstract void move();

    public int getLine() {
        return line;
    }
    public int getColumn() {
        return column;
    }
    public char getDisplay() {
        return display;
    }
}