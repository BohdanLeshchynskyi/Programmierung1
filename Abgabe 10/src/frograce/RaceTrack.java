package frograce;

class RaceTrack {
    private String name;
    private int lengthInCm;
    private Frog[] frogs;

    RaceTrack(String name, int lengthInCm) throws RaceLengthException {
        this.name = name;
        if (lengthInCm < 50) {
            throw new RaceLengthException("A race track needs to have at least a length of 50 cm");
        } else {
            this.lengthInCm = lengthInCm;
        }
    }

    void setFrogs(Frog[] frogs) {
        this.frogs = frogs;
    }

    int getLengthInCm() {
        return lengthInCm;
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder("");
        display.append(name).append(": ").append(lengthInCm).append(" Zentimeter\n\n\n");
        createEdgeLine(display);
        for (Frog frog: frogs) {
            display.append(" ".repeat(8)).append(frog.toString());
        }
        display.append("\n");
        createEdgeLine(display);
        return display.toString();
    }

    private void createEdgeLine(StringBuilder display) {
        display.append(" Start |").append("-".repeat(lengthInCm / 10)).append("| Ziel\n\n\n");
    }
}
