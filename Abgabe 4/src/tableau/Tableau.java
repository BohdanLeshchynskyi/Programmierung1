package tableau;

public class Tableau {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 8 + i; j++) {
                System.out.print(j + " ");
            }
        System.out.println();
        }
    }
}
