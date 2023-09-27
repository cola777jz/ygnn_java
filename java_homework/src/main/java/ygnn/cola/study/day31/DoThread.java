package ygnn.cola.study.day31;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Cola0817
 * @name DoThread
 * @date 2023/9/27 17:47
 * @since 1.0.0
 */
public class DoThread {
    private static final File FILE = new File("./sin-num.csv");
    private static Map<Integer,List<Integer>> map;
    private static final BufferedReader reader;
    private static final int NUM_COUNT = 1000_0000;
    private static final int NUM_THREAD = 4;
    private static final int count = NUM_COUNT / NUM_THREAD;

    static {
        try {
            reader = new BufferedReader(new FileReader(FILE));
            String line;
            for (int i = 0; i < NUM_THREAD; i++) {
                List<Integer> list = new ArrayList<>();
                while ((line = reader.readLine()) != null){
                    list.add(Integer.parseInt(line));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {

    }
}
