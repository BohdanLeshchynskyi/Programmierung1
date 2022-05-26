package time.clock;

import time.gameview.Animations;
import java.time.LocalTime;

class Clock {
    private Animations animations;
    private Clockwork clockWork;

    Clock() {
        this.animations = new Animations();
        this.clockWork = new Clockwork(new Time(LocalTime.now().getHour(), LocalTime.now().getMinute(), LocalTime.now().getSecond()));
    }

    private void startClock() {
        Time currentTime;
        while (true) {
            currentTime = clockWork.retrieveCurrentTime();
            animations.showClock(currentTime.asFormattedString(), currentTime.hoursAsDegrees(),
                    currentTime.minutesAsDegrees(), currentTime.secondsAsDegrees());
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.startClock();
    }
}
