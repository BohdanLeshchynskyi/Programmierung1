package indianajones.bin;

import indianajones.gamelogic.GameLogic;

public class IndianaJones {
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic(27, 48, 25);
        gameLogic.gameLoop();
    }
}