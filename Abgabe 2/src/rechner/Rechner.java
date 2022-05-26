package rechner;

public class Rechner {
    public static void main(String[] args) {
        double x = 1.9;
        double y = -.1;
        double resultat = 0;
        String rechenVorschrift = "+";

        if (rechenVorschrift.equals("+")) {
            resultat = x + y;
        } else if (rechenVorschrift.equals("-")) {
            resultat = x - y;
        } else if (rechenVorschrift.equals("*")) {
            resultat = x * y;
        } else if (rechenVorschrift.equals("/") && y != 0) {
            resultat = x / y;
        } else {
            rechenVorschrift = "undefiniert";
        }

        String ausgabe;
        if (rechenVorschrift.equals("undefiniert")) {
            ausgabe = "undefiniert";
        } else {
            ausgabe = x + " " + rechenVorschrift + " " +  y + " = " + resultat;
        }

        System.out.println(ausgabe);
    }
}
