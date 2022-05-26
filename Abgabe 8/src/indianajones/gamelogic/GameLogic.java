package indianajones.gamelogic;

import indianajones.gamepieces.*;

public class GameLogic {
    private GameView gameView;
    private Canvas canvas;
    private Jones jones;
    private Snake[] snakes;
    private int numberOfSnakes;
    private Grail grail;
    private Exit exit;
    private GamePiece[] gamePieces;
    private boolean gameOver;

    public GameLogic(int lines, int columns, int numberOfSnakes) {
        this.gameView = new GameView();
        this.canvas = new Canvas(lines, columns);
        this.snakes = new Snake[numberOfSnakes];
        this.gamePieces = new GamePiece[numberOfSnakes + 3];
        this.jones = new Jones(lines, columns, gameView);
        this.grail = new Grail(lines, columns);
        this.exit = new Exit(lines, columns);
        for (int i = 0; i < numberOfSnakes; i++) {
            snakes[i] = new Snake(lines, columns, jones);
            gamePieces[i] = snakes[i];
        }
        gamePieces[numberOfSnakes] = exit;
        gamePieces[numberOfSnakes + 1] = grail;
        gamePieces[numberOfSnakes + 2] = jones;
        this.gameOver = false;

        for (GamePiece gamePiece: gamePieces) {
            canvas.paint(gamePiece.getLine(), gamePiece.getColumn(), gamePiece.getDisplay());
        }
        gameView.print(canvas.asString(), 5);
    }

    private void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) { }
    }

    private boolean jonesIsOnTheSameSpotAs(GamePiece gamePiece) {
        return jones.getLine() == gamePiece.getLine() && jones.getColumn() == gamePiece.getColumn();
    }

    private void gameLogic() {
        if (jonesIsOnTheSameSpotAs(grail)) {
            grail.makeInvisible();
            jones.grailCaptured = true;
        } else if (jones.grailCaptured && jonesIsOnTheSameSpotAs(exit)) {
            canvas.fill('J');
            gameOver = true;
        } else {
            for (Snake snake: snakes) {
                if (jonesIsOnTheSameSpotAs(snake)) {
                    canvas.fill('S');
                    gameOver = true;
                }
            }
        }
    }

    public void gameLoop() {
        while (!gameOver) {
            canvas.fill(' ');
            for (GamePiece gamePiece: gamePieces) {
                gamePiece.move();
            }
            for (GamePiece gamePiece: gamePieces) {
                canvas.paint(gamePiece.getLine(), gamePiece.getColumn(), gamePiece.getDisplay());
            }
            gameView.print(canvas.asString(), 5);
            gameLogic();
            sleep();
        }
    }

    public GamePiece[] getGamePieces() {
        return gamePieces;
    }

    public boolean isGameOver() {
        return gameOver;
    }
}