package jahreszeiten;

public class Jahreszeiten {
    public static void main(String[] args) {
        int monat = 4;
        String ausgabe = "Der " + monat + ". Monat ist im ";

        switch (monat) {
            case 1:
            case 2:
            case 12:
                ausgabe += "Winter.";
                break;
            case 3:
            case 4:
            case 5:
                ausgabe += "Frühling.";
                break;
            case 6:
            case 7:
            case 8:
                ausgabe += "Sommer.";
                break;
            case 9:
            case 10:
            case 11:
                ausgabe += "Herbst.";
            default:
                ausgabe = "Falsche Eingabe";
        }

        System.out.println(ausgabe);
    }
}

