package mythicalcreatures;

public class PuppetPlayer {
    public static void main(String[] args) {
        MythicalCreature[] mythicalCreatures = {new Smurf("Schlaubischlumpf", "blau", false),
                                                new Smurf("Schlumpfine", "blau", true),
                                                new Ghost("Caspar", "weiß")};
        for (MythicalCreature mythicalCreature: mythicalCreatures) {
            System.out.println(mythicalCreature.whatAmI());
        }
    }
}
