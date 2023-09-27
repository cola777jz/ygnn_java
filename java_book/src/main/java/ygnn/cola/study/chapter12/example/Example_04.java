package ygnn.cola.study.chapter12.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Cola0817
 * @name Example_04
 * @date 2023/9/27 22:51
 * @since 1.0.0
 */
public class Example_04 {
    /**
     * 统计 record.txt 中的数据
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("E:\\work_space\\IDEA\\ygnn_java\\java_book\\src\\main\\java\\ygnn\\cola\\study\\chapter12\\example\\record.txt"));
        double price, total = 0.0;

        reader.useDelimiter("[^0-9.]+");

        while (reader.hasNext()){
            price = reader.nextDouble();
            total += price;
        }
        System.out.println("total = " + total);


    }
}
