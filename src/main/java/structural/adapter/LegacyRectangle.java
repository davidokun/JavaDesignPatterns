package structural.adapter;

public class LegacyRectangle {

    private int side;

    public int calculateSize() {
        return side * 4;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
