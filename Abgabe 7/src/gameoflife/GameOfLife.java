package gameoflife;

public class GameOfLife {
    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.startGame();
    }

    static final int NUMBEROFGENERATIONS = 10000;

    private void startGame() {
        PetriDish petriDish = new PetriDish(90, 160, 0.6);
        petriDish.print();

        for (int generation = 0; generation < NUMBEROFGENERATIONS - 1; generation++) {
            petriDish.calculateNextGeneration();
            petriDish.print();
        }
    }
}
