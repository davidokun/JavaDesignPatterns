package structural.proxy;

import java.util.List;

public class Application {

    private List<Image> images;

    public Application(List<Image> images) {
        this.images = images;
    }

    public void draw() {
        for (Image image : images) {
            image.draw();
        }
    }
}
