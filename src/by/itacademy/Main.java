package by.itacademy;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("BMW");
        Car car = new Car(engine);
        car.getEngine().setModel("VW");

        Car car1 = new Car(engine);

        System.out.println(car);
        System.out.println(car1);
    }
}
