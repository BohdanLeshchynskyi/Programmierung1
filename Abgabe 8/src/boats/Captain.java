package boats;

public class Captain {
    public static void main(String[] args) {
        Boat boat1 = new Boat("Titanic", "rot");
        Boat boat2;
        Boat boat3;

        print(1, boat1);
        boat2 = boat1;
        boat3 = boat1.clone();
        RepairShop repairShop = new RepairShop();
        repairShop.lackieren(boat2, "schwarz");
        repairShop.lackieren(boat3, "grün");
        print(1, boat1);
        print(2, boat2);
        print(3, boat3);
    }

    private static void print(int boatNumber, Boat boat) {
        System.out.println("Boot Nr: " + boatNumber + " Name: " + boat.name + ", Farbe: " + boat.color);
    }
}
