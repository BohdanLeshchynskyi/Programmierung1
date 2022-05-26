package storage;

public class StorageManager {
    public static void main(String[] args) {
        Storage strings = new Storage("Strings");
        System.out.println(strings);
        strings.add("Eins");
        strings.add("Zwei");
        strings.add("Drei");
        System.out.println(strings);

        Storage mixed1 = new Storage("Mixed");
        mixed1.add("Eins");
        mixed1.add(2);
        mixed1.add(3.0);
        System.out.println(mixed1);

        Storage mixed2 = new Storage("Mixed");
        mixed2.add("Eins");
        mixed2.add(2);
        mixed2.add(3.0);
        System.out.println(mixed2);

        boolean equal = mixed1.equals(mixed2);
        System.out.println(equal);
    }
}
