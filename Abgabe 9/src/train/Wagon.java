package train;

class Wagon {
    protected int number;
    protected Wagon nextWagon;

    Wagon(int number) {
        this.number = number;
        this.nextWagon = null;
    }

    void setNextWagon(Wagon nextWagon) {
        this.nextWagon = nextWagon;
    }

    @Override
    public String toString() {
        return " <- Waggon Nr. " + number + (nextWagon != null ? nextWagon.toString() : "");
    }
}
