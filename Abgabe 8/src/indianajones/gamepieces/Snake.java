package indianajones.gamepieces;

public class Snake extends GamePiece {
    private Jones jones;

    public Snake(int lines, int columns, Jones jones) {
        super(lines, columns);
        this.display = 'S';
        this.line = (int) (Math.random() * (lines - 1));
        this.column = columns - 1;
        this.jones = jones;
    }

    @Override
    public void move() {
        if ((double) Math.random() < 0.5) {
            if (line <= jones.line && line < lines - 1) {
                line++;
            } else {
                line--;
            }
        } else {
            if (column <= jones.column && column < columns - 1) {
                column++;
            } else {
                column--;
            }
        }
    }
}