package quadrieren;

public class Quadrieren {
    public static void main(String[] args) {
        int anfang = 7;
        int grenze = 10000;
        int ergebniss = anfang;
        int mal = 0;

        while (ergebniss < grenze) {
            ergebniss *= ergebniss;
            mal++;
        }

        System.out.println("Anfang: " + anfang);
        System.out.println("Grenze: " + grenze);
        System.out.println("Ergebnis: " + ergebniss);
        System.out.println("Die Zahl wurde insgesamt " + mal + " mal quadriert.");

    }
}
