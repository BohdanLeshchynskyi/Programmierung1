package primzahl;

public class Primzahl {
    public static void main(String[] args) {
        int a = 14552147;
        boolean isPrim = true;
        String aussage;
        if (a < 2) {
            isPrim = false;
        } else {
            for (int teiler = 2; teiler < a - 1; teiler++) {
                boolean teilbar = (a % teiler == 0);
                if (teilbar) {
                    isPrim = false;
                    break;
                }
            }
        }
        aussage = isPrim ? "eine" : "keine";
        System.out.println("Die Zahl " + a + " ist " + aussage + " Primzahl.");
    }
}
