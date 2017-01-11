package creational.prototype;

public class Client {

    public static void main(String[] args) {

        Image image = new Image();
        image.setUrl("http://image.com");

        GraphicTool tool = new GraphicTool(image);

        Graphic graphic = tool.createGraphic();

        System.out.println("Graphic instance : " + graphic.getClass());
        System.out.println("Graphic Url : " + graphic.getUrl());

        image.setUrl("http://another-image.com");

        graphic = tool.createGraphic();
        System.out.println("Graphic url : " + graphic.getUrl());

        Video video = new Video();
        video.setUrl("http://video.com");

        tool.setPrototype(video);

        graphic = tool.createGraphic();

        System.out.println("Graphic instance : " + graphic.getClass());
        System.out.println("Graphic url : " + graphic.getUrl());
    }
}
