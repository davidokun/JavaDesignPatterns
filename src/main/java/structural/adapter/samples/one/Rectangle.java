package structural.adapter.samples.one;

public class Rectangle {

    private int side;

    public int determineSize() {
        return side * 2;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
