package time.clock;

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Time(long miliseconds) {
        long secondsCalc = miliseconds / 1000;
        long minutesCalc = secondsCalc / 60;
        long hoursCalc = (minutesCalc / 60);

        this.hours = (int) (hoursCalc % 24);
        this.minutes = (int) (minutesCalc - hoursCalc * 60);
        this.seconds = (int) (secondsCalc - minutesCalc * 60);
    }

    long asMilliseconds() {
        return  hours * 60 * 60 * 1000 +  minutes * 60 * 1000 + seconds * 1000;
    }

    int secondsAsDegrees() {
        return seconds * 6;
    }

    int minutesAsDegrees() {
        return minutes * 6;
    }

    int hoursAsDegrees() {
        if (hours >= 12) {
            if ((int) ((hours - 12) * 30 + 30 * (minutes / 60.0)) >= 360) {
                return (int) ((hours - 12) * 30 + 30 * (minutes / 60.0) - 360 * ((hours - 12) / 12));
            } else {
                return (int) ((hours - 12) * 30 + 30 * (minutes / 60.0));
            }
        } else {
            if ((int) (hours * 30 + 30 * (minutes / 60.0)) >= 360) {
                return (int) (hours * 30 + 30 * (minutes / 60.0)) - 360 * ((hours - 12) / 12);
            } else {
                return (int) (hours * 30 + 30 * (minutes / 60.0));
            }
        }
    }

    String asFormattedString() {
        String format = "";
        if (hours < 10) {
            format += "0" + hours + ":";
        } else {
            format += hours + ":";
        }
        if (minutes < 10) {
            format += "0" + minutes + ":";
        } else {
            format += minutes + ":";
        }
        if (seconds < 10) {
            format += "0" + seconds;
        } else {
            format = format + seconds;
        }
        return format;
    }


}
