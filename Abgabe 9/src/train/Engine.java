package train;

class Engine extends Wagon {
    Engine(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return "Lok Nr. " + number + (nextWagon != null ? nextWagon.toString() : "");
    }
}
