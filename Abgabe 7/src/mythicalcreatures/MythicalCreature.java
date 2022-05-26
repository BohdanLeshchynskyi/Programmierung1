package mythicalcreatures;

class MythicalCreature {
    private String name;
    private String color;

    MythicalCreature(String name, String color) {
        this.name = name;
        this.color = color;
    }

    protected String whatAmI() {
        return "Mein Name ist " + name + " und ich bin " + color + ".";
    }
}
