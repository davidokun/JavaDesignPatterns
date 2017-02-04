package structural.bridge;

public class LinuxWindowImpl extends WindowImpl {

    @Override
    public void draw(int x, int y, int width, int height, String colour) {
        System.out.println("Drawing on Linux x: " + x + " y: " + y + " width: " + width + " height: " + height);
    }
}
