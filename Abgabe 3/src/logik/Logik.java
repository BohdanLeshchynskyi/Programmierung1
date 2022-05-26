package logik;

public class Logik {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        boolean ergebnis1 = a && b && (c || !a);
        boolean ergebnis2 = a || (!b && c);
        boolean ergebnis3 = !a || !b || c;

        System.out.println("a && b && (c || !a) = " + ergebnis1);
        System.out.println("a || (!b && c) = " + ergebnis2);
        System.out.println("a! || !b || c = " + ergebnis3);
    }
}
