package ygnn.cola.study.day28.Demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Cola0817
 * @name FileOutputStreamDemo
 * @date 2023/9/27 12:26
 * @since 1.0.0
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("E:\\work_space\\IDEA\\ygnn_java\\java_basic\\src\\main\\java\\ygnn\\cola\\study\\day28\\Demo01\\day28.csv");
        try (FileOutputStream outputStream = new FileOutputStream(file,true);){
            byte[] bytes = new byte[Byte.MAX_VALUE];
            for (int i = 0; i < Byte.MAX_VALUE; i++) {
                bytes[i] = (byte) i;
            }
            outputStream.write(bytes);
        }catch (IOException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
