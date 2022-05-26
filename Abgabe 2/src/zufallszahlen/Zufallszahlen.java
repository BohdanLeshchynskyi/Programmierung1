package zufallszahlen;

public class Zufallszahlen {
    public static void main(String[] args) {
        int i = 1;
        int random = 0;
        while (random != 10000) {
            random = (int) (Math.random() * 100_000);
            System.out.println(i + ": " + random);
            i++;
        }
    }
}
