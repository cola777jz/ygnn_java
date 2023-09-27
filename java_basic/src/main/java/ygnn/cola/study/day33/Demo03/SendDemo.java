package ygnn.cola.study.day33.Demo03;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author Cola0817
 * @name SendDemo
 * @date 2023/9/27 12:11
 * @since 1.0.0
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.nextLine();

            if (line.equals("886")){
                break;
            }
            byte[] bytes = line.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("127.0.0.1"),7777);

            socket.send(packet);
        }

        socket.close();
    }
}
