package gameoflife;

class Cell {
    private boolean alive;
    private int livingNeighbours;

    Cell(boolean isAlive) {
        this.alive = isAlive;
    }

    boolean isAlive() {
        return alive;
    }

    void setLivingNeighbours(int livingNeighbours) {
        this.livingNeighbours = livingNeighbours;
    }

    void applyRules() {
        if (alive && livingNeighbours < 2 || alive && livingNeighbours > 3) {
            alive = false;
        } else if (!alive && livingNeighbours == 3) {
            alive = true;
        }
    }
}
