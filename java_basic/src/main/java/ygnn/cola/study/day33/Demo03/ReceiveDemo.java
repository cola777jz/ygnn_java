package ygnn.cola.study.day33.Demo03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author Cola0817
 * @name ReceiveDemo
 * @date 2023/9/27 12:14
 * @since 1.0.0
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(7777);

        while (true){
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            socket.receive(packet);
            String line = new String(packet.getData()).trim();
            if (line.equals("886")){
                break;
            }
            System.out.println("line = " + line);
        }

        socket.close();
    }
}
