package progressbar;

class ProgressBar {
    private int width;
    private String text;
    private int percentage;

    ProgressBar(int width, String text) {
        this.width = width;
        this.text = text;
    }

    void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    private String starLine() {
        return "*".repeat(width);
    }

    private String emptyLine() {
        return "*" + " ".repeat(width - 2) + "*";
    }

    private String percentageLine() {
        int whitespacesNumber = (width - text.length() - 5) / 2;
        return " ".repeat(whitespacesNumber) + text + " " + percentage + " %" + " ".repeat(whitespacesNumber);
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder("");
        display.append(starLine()).append("\n").append(emptyLine()).append("\n").append(emptyLine()).append("\n");
        display.append(percentageLine()).append("\n");
        display.append(emptyLine()).append("\n").append(emptyLine()).append("\n").append(starLine()).append("\n\n");
        return display.toString();
    }
}
