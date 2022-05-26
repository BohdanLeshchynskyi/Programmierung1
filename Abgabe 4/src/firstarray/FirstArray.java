package firstarray;

public class FirstArray {
    public static void main(String[] args) {
        String[] strings = new String[100];
        strings[0] = "Anfang";
        strings[99] = "Ende";
        for (int i = 1; i < 99; i++) {
            strings[i] = "Mitte";
        }
        for (String word: strings) {
            System.out.println(word);
        }
    }
}
