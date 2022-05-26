package methods;

public class Methods {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        printInfo();
        printVariable("a = " + a);
        printVariable("b = " + b);
        printVariable("c = " + c);
        printBoolean("isEven(a)", isEven(a));
        printDouble("pythagoras(a, b)", pythagoras(a, b));
        printInt("minimum(a, b, c)", minimum(a, b, c));
        printInfo();
    }

    static boolean isEven(int x) {
        return x % 2 == 0;
    }

    static double pythagoras(int x, int y) {
        return Math.round(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) * 100) / 100.0;
    }

    static int minimum(int x, int y, int z) {
        return Math.min(Math.min(x, y), z);
    }

    static void printInfo() {
        System.out.println("--- Abgabe 5 ---");
    }

    static void printVariable(String initialization) {
        System.out.println("Initialisierung: " + initialization);
    }

    static void printBoolean(String task, boolean result) {
        System.out.println("Die Aussage " + task + " ist " + result);
    }

    static void printDouble(String task, double result) {
        System.out.println(task + " = " + result + " (gerundet)");
    }

    static void printInt(String task, int result) {
        System.out.println(task + " = " + result);
    }
}
