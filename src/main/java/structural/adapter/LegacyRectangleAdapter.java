package structural.adapter;

public class LegacyRectangleAdapter extends Rectangle {

    private LegacyRectangle legacyRectangle;

    public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public int determineSize() {
        return legacyRectangle.calculateSize();
    }
}
