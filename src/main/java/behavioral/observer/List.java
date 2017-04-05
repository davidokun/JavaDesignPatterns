package behavioral.observer;

public class List implements Observer {

    public void setListValue(int value) {
        System.out.println("Set List value: " + value);
    }

    @Override
    public void update() {
        this.setListValue(1);
    }
}
