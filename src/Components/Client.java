package Components;

import java.net.InetAddress;
import java.net.Socket;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client {
    private String nickname;
    private Socket socket;
    private DatagramSocket datagramSocket;
    private DatagramPacket datagramPacket;
    private InetAddress ip;

    //TODO: More Data Load

    public Client(String nickname){
        this.nickname = nickname;
        this.socket = null;
        this.datagramSocket = null;
        this.datagramPacket = null;
        this.ip = InetAddress.getLoopbackAddress();
    }
}
