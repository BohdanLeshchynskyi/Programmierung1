package triplets;

public class Triplets {
    public static void main(String[] args) {
        int first;
        int second;
        int third;
        int counter = 1;
        boolean einser = false;
        boolean zweier =  false;
        boolean dreier = false;
        double summe = 0;
        while (true) {
            first = 1 + (int) (Math.random() * 6);
            second = 1 + (int) (Math.random() * 6);
            third = 1 + (int) (Math.random() * 6);
            summe = summe + first + second + third;
            System.out.println("Wurf " + counter + ": " + first + ", " + second + ", " + third);
            if (first == second && second == third) {
                System.out.println("Pasch!");
                if (first == 1) {
                    einser = true;
                } else if (first == 2) {
                    zweier = true;
                } else if (first == 3) {
                    dreier = true;
                }
            }
            if (einser && zweier && dreier) {
                double mittelWert = summe / counter;
                System.out.println("\nEinser-, Zweier-, und Dreier - Pasch waren dabei!");
                System.out.println("Mittelwert aller gewürfelten Zahlen: " + mittelWert);
                break;
            }
            counter++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
