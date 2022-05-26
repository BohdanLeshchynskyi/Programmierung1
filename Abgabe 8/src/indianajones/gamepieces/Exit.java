package indianajones.gamepieces;

public class Exit extends GamePiece {
    public Exit(int lines, int columns) {
        super(lines, columns);
        this.display = 'E';
        this.line = lines / 2;
        this.column = columns - 1;
    }

    @Override
    public void move() { }
}
