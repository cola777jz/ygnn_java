package ygnn.cola.study.day32to34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Cola0817
 * @name Client
 * @date 2023/9/27 19:26
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (
            Socket socket = new Socket("127.0.0.1", 7777);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true)
        ) {
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println("client = " + line);
            }
            System.out.println("Please Input msg: (end with 886)");
            String text = scanner.nextLine();
            while (!text.equals("886")){
                writer.write(text);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
