package ygnn.cola.study.day33.Demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author Cola0817
 * @name UDPListenerDemo
 * @date 2023/9/27 12:02
 * @since 1.0.0
 */
public class UDPListenerDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(7777);
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        socket.receive(packet);

        System.out.println("packet = " + new String(packet.getData()).trim());

        socket.close();
    }
}
