package tv;

public class TV {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.zap();
    }

    private void printTVImage(Pixel[][] tvImage) {
        for (int line = 0; line < tvImage.length; line++) {
            for (int column = 0; column < tvImage[0].length; column++) {
                System.out.print(tvImage[line][column]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private void zap() {
        Pixel pixel1 = new Pixel("O");
        Pixel pixel2 = new Pixel("X");
        pixel1.on = true;
        pixel2.on = true;
        Pixel[][] pixelImange = new Pixel[5][20];
        for (int i = 0; i < pixelImange.length; i++) {
            for (int j = 0; j < pixelImange[0].length; j++) {
                pixelImange[i][j] = j % 2 == 0 ? pixel1 : pixel2;
            }
        }
        printTVImage(pixelImange);
        pixel2.on = false;
        printTVImage(pixelImange);
    }
}
