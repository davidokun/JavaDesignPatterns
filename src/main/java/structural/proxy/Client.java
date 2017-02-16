package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        ImageProxy image = new ImageProxy("http://image1.com");
        ImageProxy image2 = new ImageProxy("http://image2.com");

        List<Image> images = new ArrayList<>();
        images.add(image);
        images.add(image2);

        Application application = new Application(images);

        System.out.println("Application setup");

        application.draw();
    }
}
