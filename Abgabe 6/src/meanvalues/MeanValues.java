package meanvalues;

public class MeanValues {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Mean: " + mean(a, b, c));
        System.out.println("Median: " + median(a, b, c));
        System.out.println("Modal: " + modal(a, b, c));
    }

    static double mean(int x, int y, int z) {
        return (double) Math.round((x + y + z) / 3.0 * 10) / 10;
    }

    static int median(int x, int y, int z) {
        int foundMedian;
        if (x <= y && x >= z || x <= z && x >= y) {
            foundMedian = x;
        } else if (y <= x && y >= z || y <= z && y >= x) {
            foundMedian = y;
        } else {
            foundMedian = z;
        }
        return  foundMedian;
    }

    static int modal(int x, int y, int z) {
        int mostCommon;
        if (x == y) {
            mostCommon = x;
        } else if (x == z) {
            mostCommon = x;
        } else {
            if (y == z) {
                mostCommon = y;
            } else {
                mostCommon = x;
            }
        }
        return mostCommon;
    }
}
