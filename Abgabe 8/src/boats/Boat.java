package boats;

class Boat {
    String name;
    String color;

    Boat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public Boat clone() {
        Boat clone = new Boat(name, color);
        return clone;
    }
}
