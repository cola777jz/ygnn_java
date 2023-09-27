package ygnn.cola.study.day28.Demo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Cola0817
 * @name FileInputStreamDemo
 * @date 2023/9/27 12:25
 * @since 1.0.0
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("E:\\work_space\\IDEA\\ygnn_java\\java_basic\\src\\main\\java\\ygnn\\cola\\study\\day28\\Demo01\\day28.csv");
        try (FileInputStream inputStream = new FileInputStream(file);){
            byte[] bytes = new byte[1024];
            int read = 0;
            while ((read = inputStream.read(bytes)) != -1){
                for (int i = 0; i < read; i++) {
                    System.out.println(bytes[i]);
                }
            }

        }catch (IOException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
