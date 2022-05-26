package schaltjahr;

public class Schaltjahr {
    public static void main(String[] args) {
        int jahr = 1999;
        String ausgabe = "Das Jahr " + jahr + " ist ";
        boolean schaltjahr = (jahr % 4 == 0) && (jahr % 100 != 0) || (jahr % 400 == 0);

        if (schaltjahr) {
            ausgabe += "ein Schaltjahr.";
        } else {
            ausgabe += "kein Schaltjahr.";
        }

        System.out.println(ausgabe);
    }
}
