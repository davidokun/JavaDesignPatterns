package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Car {

    List<CarPart> carParts = new ArrayList<>();

    public void print() {
        PrintCarPartVisitor visitor = new PrintCarPartVisitor();
        carParts.forEach(cp -> cp.acceptCarPartVisitor(visitor));
    }

    public void render() {
        RenderCarPartVisitor visitor = new RenderCarPartVisitor();
        carParts.forEach(cp -> cp.acceptCarPartVisitor(visitor));
    }

    public void upgrade() {
        UpgradeCarPartVisitor visitor = new UpgradeCarPartVisitor();
        carParts.forEach(cp -> cp.acceptCarPartVisitor(visitor));
    }


    public List<CarPart> getCarParts() {
        return carParts;
    }

    public void setCarParts(List<CarPart> carParts) {
        this.carParts = carParts;
    }
}
