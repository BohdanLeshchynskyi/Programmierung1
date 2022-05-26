package einmaleins;

public class Einmaleins {
    public static void main(String[] args) {
        int anfang = 1;
        int ende = 9;
        System.out.println("Anfang: " + anfang);
        System.out.println("Ende: " + ende);
        System.out.println("Einmaleins von " + anfang + " * " + anfang + " bis " + ende + " * " + ende + ":");
        for (int i = anfang; i <= ende; i++) {
            for (int j = 0; j <= (ende - anfang); j++) {
                System.out.print((i + i * j) + "\t");
            }
            System.out.print("\n");
        }
    }
}
