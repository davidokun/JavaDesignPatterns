package behavioral.state;

public class OpenTCPConnectionState implements TCPConnectionState {

    private TCPConnection connection;

    public OpenTCPConnectionState(TCPConnection connection) {
        this.connection = connection;
    }

    @Override
    public void open() {
        System.out.println("Opening connection.");
    }

    @Override
    public void close() {
        System.out.println("Closing connection");
        connection.setTcpConnectionState(new ClosedTCPConnectionState(connection));
    }

    @Override
    public void acknowledge() {
        System.out.println("Acknowledge");
    }
}
