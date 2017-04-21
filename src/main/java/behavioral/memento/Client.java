package behavioral.memento;

import java.awt.geom.Point2D;

public class Client {

    public static void main(String[] args) {

        ConnectionSolver connectionSolver =
                new ConnectionSolver(new Point2D.Double(1.0, 2.0), new Point2D.Double(3.0, 4.0));

        ConnectionSolverCaretaker caretaker = new ConnectionSolverCaretaker();

        caretaker.saveState(connectionSolver);

        connectionSolver.calculateLine();

        ConnectionSolver newConnectionSolver = new
                ConnectionSolver(new Point2D.Double(5.0, 6.0), new Point2D.Double(7.0, 8.0));

        newConnectionSolver.calculateLine();

        caretaker.restoreState(newConnectionSolver);

        newConnectionSolver.calculateLine();

        caretaker.restoreState(connectionSolver);

        connectionSolver.calculateLine();
    }
}
