package structural.adapter;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();

        Rectangle rectangle = new Rectangle();
        rectangle.setSide(5);

        client.calculateRectangleSize(rectangle);

        LegacyRectangle legacyRectangle = new LegacyRectangle();
        legacyRectangle.setSide(5);

        LegacyRectangleAdapter adapter = new LegacyRectangleAdapter(legacyRectangle);

        client.calculateRectangleSize(adapter);

    }

    public void calculateRectangleSize(Rectangle rectangle) {
        System.out.println("Rectangle size: " + rectangle.determineSize());
    }
}
