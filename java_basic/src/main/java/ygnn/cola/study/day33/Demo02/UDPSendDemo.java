package ygnn.cola.study.day33.Demo02;

import java.io.IOException;
import java.net.*;

/**
 * @author Cola0817
 * @name UDPSendDemo
 * @date 2023/9/27 11:58
 * @since 1.0.0
 */
public class UDPSendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String text = "Hello I am UDP sender";
        DatagramPacket packet = new DatagramPacket(text.getBytes(), text.getBytes().length, InetAddress.getByName("127.0.0.1"), 7777);

        socket.send(packet);

        socket.close();
    }
}
