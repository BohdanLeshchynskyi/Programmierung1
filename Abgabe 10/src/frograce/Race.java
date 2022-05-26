package frograce;

import java.util.Random;

class Race {
    private RaceTrack raceTrack;
    private Frog[] frogs;
    private int winningFrogIndex;
    private GameView gameView;
    private Random random;
    private long lastSeed;

    Race(RaceTrack raceTrack, Frog[] frogs) {
        this.raceTrack = raceTrack;
        this.frogs = frogs;
        this.winningFrogIndex = -1;
        this.gameView = new GameView();
        this.random = new Random();
    }

    @Override
    public String toString() {
        if (winningFrogIndex == -1) {
            return raceTrack.toString();
        } else {
            return raceTrack.toString() + (winningFrogIndex == -1 ? "" : frogs[winningFrogIndex].getName() + " hat gewonnen!");
        }
    }

    void startRace() {
        raceTrack.setFrogs(frogs);
        lastSeed = System.nanoTime();
        random.setSeed(lastSeed);
        while (winningFrogIndex == -1) {
            round();
        }
    }

    private void roundHelper(int waitingTimeMiliseconds) {
        for (int j = 0; j < frogs.length; j++) {
            frogs[j].jump(random);
            if (frogs[j].getCurrentDistanceInCm() >= raceTrack.getLengthInCm()) {
                winningFrogIndex = j;
                break;
            }
        }
        gameView.print(this.toString(), 3);
        try {
            Thread.sleep(waitingTimeMiliseconds);
        } catch (InterruptedException ignored) {
        }
    }

    private void round() {
        roundHelper(200);
    }

    private void roundSlowMotion() {
        roundHelper(500);
    }

    int getWinningFrogIndex() {
        return winningFrogIndex;
    }

    void repeatLastRaceInSlowMotion() {
        for (int j = 0; j < frogs.length; j++) {
            frogs[j].setCurrentDistanceInCm(0);
        }
        winningFrogIndex = -1;
        random.setSeed(lastSeed);
        while (winningFrogIndex == -1) {
            roundSlowMotion();
        }
    }
}
