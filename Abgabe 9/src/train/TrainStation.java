package train;

public class TrainStation {
    public static void main(String[] args) {
        TrainStation trainStation = new TrainStation();
        Engine engine = trainStation.createTrain(5);
        System.out.println(engine);
    }

    private Wagon chainWagons(int numberWagons) {
        Wagon wagon1 = new Wagon(1);
        Wagon wagon = wagon1;
        Wagon nextWagon;
        for (int i = 2; i <= numberWagons; i++) {
            nextWagon = new Wagon(i);
            wagon.setNextWagon(nextWagon);
            wagon = nextWagon;
        }
        return wagon1;
    }

    Engine createTrain(int numberWagons) {
        Engine engine = new Engine(1);
        Wagon wagons = chainWagons(numberWagons);
        engine.setNextWagon(wagons);
        return engine;
    }
}
