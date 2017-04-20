package behavioral.memento;

import java.awt.geom.Point2D;

public class ConnectionSolver {

    private Point2D firstPoint;
    private Point2D secondPoint;

    public ConnectionSolver(Point2D firstPoint, Point2D secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public void calculateLine() {
        System.out.println("Calculate line between " + firstPoint + " and " + secondPoint);
    }

    public ConnectionSolverMemento createMemento() {
        return new ConnectionSolverMemento(firstPoint, secondPoint);
    }

    public void setMemento(ConnectionSolverMemento memento) {
        this.firstPoint = memento.getFirstPoint();
        this.secondPoint = memento.getSecondPoint();
    }

}
