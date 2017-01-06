package creational.abstracfactory;

public class Client {

    public static void initializeGUI(WidgetFactory factory) {
        initializeGUI(factory.createScrollBar(), factory.createWindow());
    }

    private static void initializeGUI(ScrollBar scrollBar, Window window) {
        System.out.println("Do initialization logic here : " + scrollBar.themeType() + " and " + window.themeType());
    }

    public static void main(String[] args) {

        WidgetFactory factory = new PinkThemeWidgetFactory();
        initializeGUI(factory);

        factory = new YellowThemeWidgetFactory();
        initializeGUI(factory);
    }
}
