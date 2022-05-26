package indianajones.gamepieces;

import indianajones.gamelogic.GameView;
import java.awt.event.KeyEvent;

public class Jones extends GamePiece {
    public boolean grailCaptured;
    private GameView gameView;

    public Jones(int lines, int columns, GameView gameView) {
        super(lines, columns);
        this.display = 'J';
        this.line = lines / 2;
        this.column = 0;
        this.gameView = gameView;
    }

    @Override
    public void move() {
        Integer[] pressedKeys = gameView.getKeyCodesOfCurrentlyPressedKeys();
        for (int keyCode : pressedKeys) {
            if (keyCode == KeyEvent.VK_UP) {
                if (line > 0) {
                    line--;
                }
            } else if (keyCode == KeyEvent.VK_DOWN) {
                if (line < lines - 1) {
                    line++;
                }
            } else if (keyCode == KeyEvent.VK_LEFT) {
                if (column > 0) {
                    column--;
                }
            } else if (keyCode == KeyEvent.VK_RIGHT) {
                if (column < columns - 1) {
                    column++;
                }
            }
        }
    }
}
