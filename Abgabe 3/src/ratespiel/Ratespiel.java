package ratespiel;
import java.util.Scanner;

public class Ratespiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = 1 + (int) (Math.random() * 1_000);
        int eingabe;
        int anzahlVersuche = 0;
        System.out.println("Teil a)");
        long startZeit = System.currentTimeMillis();
        while (true) {
            System.out.println("Bitte eine Zahl eingeben: ");
            eingabe = scanner.nextInt();
            anzahlVersuche++;
            if (eingabe > random) {
                System.out.println("Ihre Zahl ist zu hoch!");
            } else if (eingabe < random) {
                System.out.println("Ihre Zahl ist zu niedrig!");
            } else {
                System.out.println("Treffer!");
                break;
            }
        }
        scanner.close();
        long zeitEefassung = (System.currentTimeMillis() - startZeit) * 1000;
        System.out.println("Teil b)");
        System.out.println("Sie haben " + anzahlVersuche + " Versuche benötigt");
        System.out.println("Es hat " + zeitEefassung + " Sekunden gedauert");
    }
}
