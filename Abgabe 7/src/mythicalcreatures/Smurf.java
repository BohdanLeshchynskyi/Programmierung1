package mythicalcreatures;

class Smurf extends MythicalCreature {
    private boolean female;

    Smurf(String name, String color, boolean female) {
        super(name, color);
        this.female = female;
    }

    @Override
    protected String whatAmI() {
        return super.whatAmI() + " Ich bin ein " + (female ? "Mädchen." : "Junge.");
    }
}
