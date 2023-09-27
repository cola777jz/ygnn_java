package ygnn.cola.study.chapter12.example;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Cola0817
 * @name Example_01
 * @date 2023/9/27 21:57
 * @since 1.0.0
 */
public class Example_01 {

    /**
     * 读取文件相关属性 如果不存在 则 创建
     * @param args args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input filename: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.length() = " + file.length());
        System.out.println("file.getAbsoluteFile() = " + file.getAbsoluteFile());

        if (file.isHidden()){
            System.out.println("file is hidden");
        }else {
            System.out.println("file is not hidden");
        }

        if (!file.exists()){
            System.out.println("file is not exist|");
            try {
                if (file.createNewFile()) {
                    System.out.println("create successful");
                }else {
                    System.out.println("create fail");
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
