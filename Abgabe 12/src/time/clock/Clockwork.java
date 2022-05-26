package time.clock;

class Clockwork {
    private Time startTime;
    private long startPoint;
    int speedFactor;

    Clockwork(Time startTime) {
        this.startTime = startTime;
        this.startPoint = System.currentTimeMillis();
        this.speedFactor = 1000;
    }

    Time retrieveCurrentTime() {
        long currentTime = System.currentTimeMillis();
        return new Time(startTime.asMilliseconds() + speedFactor * (currentTime - startPoint));
    }
}
