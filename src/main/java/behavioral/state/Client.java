package behavioral.state;

public class Client {

    public static void main(String[] args) throws Exception {

        TCPConnection tcpConnection = new TCPConnection();

        tcpConnection.open();
        tcpConnection.acknowledge();
        tcpConnection.close();

        tcpConnection.acknowledge();
    }
}
