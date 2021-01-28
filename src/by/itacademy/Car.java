package by.itacademy;

public class Car {

    private final Engine engine;

    public Car(final Engine engine) {
        this.engine = new Engine(engine.getModel());
    }

    public Engine getEngine() {
        return new Engine(engine.getModel());
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
