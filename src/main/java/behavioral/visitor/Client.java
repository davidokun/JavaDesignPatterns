package behavioral.visitor;

public class Client {

    public static void main(String[] args) {

        Car car = new Car();

        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());

        car.getCarParts().add(new Light());
        car.getCarParts().add(new Light());

        car.getCarParts().add(new Engine());

        car.print();
        car.render();
        car.upgrade();
    }
}
