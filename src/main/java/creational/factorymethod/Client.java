package creational.factorymethod;

public class Client {

    public static void main(String[] args) {

        // Using BikeFactory
        TransportFactory factory = new BikeFactory();

        Transport transport = factory.create();

        System.out.println(transport.drive());

        // Using CarFactory
        factory = new CarFactory();

        transport = factory.create();

        System.out.println(transport.drive());

    }
}
