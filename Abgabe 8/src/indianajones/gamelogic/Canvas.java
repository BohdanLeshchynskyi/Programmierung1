package indianajones.gamelogic;

class Canvas {
    private char[][] canvas;

   Canvas(int lines, int columns) {
       canvas = new char[lines][columns];
       fill(' ');
   }

    void fill(char toFillWith) {
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[0].length; j++) {
                canvas[i][j] = toFillWith;
            }
        }
    }

    void paint(int line, int column, char toPaint) {
       canvas[line][column] = toPaint;
    }

    String asString() {
       String output = "";
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[0].length; j++) {
                output += canvas[i][j];
            }
            output += "\n";
        }
        return output;
    }
}
