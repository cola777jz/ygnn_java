package ygnn.cola.study.chapter12.example;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

/**
 * @author Cola0817
 * @name Example_02
 * @date 2023/9/27 22:43
 * @since 1.0.0
 */
public class Example_02 {
    /**
     * 列出给定目录下的所有文件名，并列出给定拓展名的所有文件名
     * @param args args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        String[] fileNameList = file.list();
        if (fileNameList != null){
            for (String s : fileNameList) {
                System.out.println("s = " + s);
            }
        }else {
            System.out.println("no file exist");
        }
        System.out.println("please input extend file prefix:  ");
        String filePrefix = scanner.nextLine();
        String[] filteredList = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(filePrefix);
            }
        });

        if (filteredList != null){
            for (String s : filteredList) {
                System.out.println("s = " + s);
            }
        }else {
            System.out.println("no file exist");
        }


    }
}
