package frograce;

import javax.swing.JOptionPane;

public class FrogManager {
    public static void main(String[] args) throws RaceLengthException {
        FrogManager frogManager = new FrogManager();
        frogManager.manageFrogs();
    }

    private void manageFrogs() throws RaceLengthException {
        //GameView gameView = new GameView();
        String input = JOptionPane.showInputDialog("Bitte Länge der Rennstrecke in cm eingeben: ");
        int lengthByUser = Integer.parseInt(input);
        Frog hugo = new Frog("Hugo");
        Frog martin = new Frog("Martin");
        Frog faber = new Frog("Faber");
        RaceTrack raceTrack;
        try {
            raceTrack = new RaceTrack("Monte Carlo", lengthByUser);
        } catch (RaceLengthException e) {
            raceTrack = new RaceTrack("Monte Carlo", 600);
        }
        Frog[] frogs = new Frog[3];
        frogs[0] = hugo;
        frogs[1] = martin;
        frogs[2] = faber;
        raceTrack.setFrogs(frogs);
        Race race = new Race(raceTrack, frogs);
        race.startRace();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        race.repeatLastRaceInSlowMotion();
    }
}
