package xmastree;

public class XMasTree {
    public static void main(String[] args) {
        int height = 7;
        for (int i = 1; i <= height - 1; i++) {
            System.out.print(' ');
        }
        System.out.println('+');
        for (int i = 1; i <= height; i++) {
            for (int j = i; j <= height - 1; j++) {
                System.out.print(' ');
            }
            System.out.print('*');
            for (int k = 1; k < i; k++) {
                System.out.print("**");
            }
            System.out.println();
        }
        for (int i = 1; i <= height - 1; i++) {
            System.out.print(' ');
        }
        System.out.println('V');
    }
}
