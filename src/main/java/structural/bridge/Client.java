package structural.bridge;

public class Client {

    public static void main(String[] args) {

        IconWindow iconWindow = new IconWindow();
        iconWindow.setWindow(new DirectXWindowImpl());
        iconWindow.drawIcon();
        iconWindow.setWindow(new LinuxWindowImpl());
        iconWindow.drawIcon();
    }
}
