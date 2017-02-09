package structural.composite;

public class Client {

    public static void main(String[] args) {

        Line line = new Line();
        Rectangle rectangle = new Rectangle();
        GraphicItemGroup group = new GraphicItemGroup();

        group.getGraphics().add(line);
        group.getGraphics().add(rectangle);

        group.draw();

        Line line1 = new Line();
        GraphicItemGroup group2 = new GraphicItemGroup();
        group2.getGraphics().add(line1);

        group2.getGraphics().add(group);

        System.out.println("Drawing group 2");

        group2.draw();
        line.draw();
    }
}
