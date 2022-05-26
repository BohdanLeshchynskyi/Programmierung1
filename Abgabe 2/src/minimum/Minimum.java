package minimum;

public class Minimum {
    public static void main(String[] args) {
        int x = 0;
        int y = -1;
        int z = 2;

        int minimum = x > y ? y : x;
        minimum = minimum < z ? minimum : z;

        System.out.println("x ist " + x);
        System.out.println("y ist " + y);
        System.out.println("z ist " + z);
        System.out.println("Das Minimum ist " + minimum);
    }
}
