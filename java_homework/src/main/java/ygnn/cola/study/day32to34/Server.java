package ygnn.cola.study.day32to34;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Cola0817
 * @name Server
 * @date 2023/9/27 19:26
 * @since 1.0.0
 */
public class Server {
    public static void main(String[] args) {
        try (
            ServerSocket socket = new ServerSocket(7777);
            Socket accept = socket.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            PrintWriter writer = new PrintWriter(accept.getOutputStream(),true)
        ) {
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println("server = " + line);
            }
            writer.println("I am Server");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
