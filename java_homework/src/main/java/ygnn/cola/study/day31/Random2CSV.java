package ygnn.cola.study.day31;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Cola0817
 * @name Random2CSV
 * @date 2023/9/27 17:41
 * @since 1.0.0
 */
public class Random2CSV {
    private static final File FILE = new File("./sin-num.csv");

    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE))) {
            for (int i = 1; i <= 1000_0000; i++) {
                writer.write(i + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
