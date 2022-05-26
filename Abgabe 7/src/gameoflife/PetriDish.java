package gameoflife;

class PetriDish {
    private int height;
    private int width;
    private int generetionNum = 1;
    private Cell[][] cells;
    private GameView gameView;

    PetriDish(int hight, int width, double probabilityAlive) {
        this.height = hight;
        this.width = width;
        gameView = new GameView();
        this.cells = new Cell[this.height][this.width];
        for (int line = 0; line < this.height; line++) {
            for (int colomn = 0; colomn < this.width; colomn++) {
                if ((double) Math.random() <= probabilityAlive) {
                    this.cells[line][colomn] = new Cell(true);
                } else {
                    this.cells[line][colomn] = new Cell(false);
                }
            }
        }
    }

    void print() {
        String display = "";
        for (Cell[] cellsLine: cells) {
            for (Cell someCell: cellsLine) {
                if (someCell.isAlive()) {
                    display = display + "X";
                } else {
                    display = display + " ";
                }
            }
            display = display + "\n";
        }
        gameView.print(display, 1);
    }

    private int countLivingNeighboursOfCell(int colomn, int line) {
        int livingNeigbours = 0;
        int counterLine = line - 1;
        int counterColomn = colomn - 1;
        int bounadryLine = line + 1;
        int boundaryColomn = colomn + 1;
        for (int i = counterLine; i <= bounadryLine; i++) {
            for (int j = counterColomn; j <= boundaryColomn; j++) {
                if (i < height && i > -1 && j < width && j > -1 && (i != line || j != colomn) && cells[i][j].isAlive())  {
                    livingNeigbours++;
                }
            }
        }
        return  livingNeigbours;
    }

    private void updateLivingNeighbours() {
        for (int line = 0; line < height; line++) {
            for (int colomn = 0; colomn < width; colomn++) {
                cells[line][colomn].setLivingNeighbours(countLivingNeighboursOfCell(colomn, line));
            }
        }
    }

    private void applyRulesToUpdatedCells() {
        for (int line = 0; line < height; line++) {
            for (int colomn = 0; colomn < width; colomn++) {
                cells[line][colomn].applyRules();
            }
        }
    }

    void calculateNextGeneration() {
        updateLivingNeighbours();
        applyRulesToUpdatedCells();
        generetionNum++;
    }

    Cell[][] getCells() {
        return cells;
    }

    void setCells(Cell[][] newCells) {
        cells = newCells;
        height = newCells.length;
        width = newCells[0].length;
        generetionNum = 1;
    }
}
