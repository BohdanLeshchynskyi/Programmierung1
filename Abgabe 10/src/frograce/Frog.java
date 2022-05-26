package frograce;

import java.util.Random;

class Frog {
    private String name;
    private int maxJumpDistanceInCm;
    private int currentDistanceInCm;

    Frog(String name) {
        this.name = name;
        this.maxJumpDistanceInCm = 50;
    }

    void jump(Random random) {
        //currentDistanceInCm += (int) (Math.random() * maxJumpDistanceInCm);
        currentDistanceInCm += (int) (random.nextDouble() * maxJumpDistanceInCm);
    }

    void setCurrentDistanceInCm(int currentDistanceInCm) {
        this.currentDistanceInCm = 0;
    }

    String getName() {
        return this.name;
    }

    int getCurrentDistanceInCm() {
        return this.currentDistanceInCm;
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder("");
        for (int i = 0; i < currentDistanceInCm / 10; i++) {
            display.append("=");
        }
        display.append("> ").append(name).append("\n");
        return display.toString();
    }
}

