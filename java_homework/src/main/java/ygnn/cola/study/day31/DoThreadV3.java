package ygnn.cola.study.day31;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Cola0817
 * @name DoThreadV2
 * @date 2023/9/27 18:03
 * @since 1.0.0
 */
public class DoThreadV3 {
    private static Object lock = new Object();
    private static final File FILE = new File("./sin-num.csv");
    private static final List<List<Integer>> subList = new ArrayList<>();
    private static final int NUM_COUNT = 1000_0000;
    private static final int NUM_THREAD = 4;

    private static double TOTAL_SUM = 0.0;
    private static final int count = NUM_COUNT / NUM_THREAD;
    private static SinThread[] threads = null;


    static {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            List<Integer> totalList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                totalList.add(Integer.parseInt(line));
            }
            for (int i = 0; i < totalList.size(); i += count) {
                int endIndex = Math.min(i + count, totalList.size());
                List<Integer> group = totalList.subList(i, endIndex);
                subList.add(group);
            }
            threads = new SinThread[NUM_THREAD];
            for (int i = 0; i < NUM_THREAD; i++) {
                threads[i] = new SinThread(
                    subList.get(i),
                    "Thread-" + i
                );
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        for (SinThread thread : threads) {
            thread.start();
        }
        for (SinThread thread : threads) {
            thread.join();
        }
        System.out.println("TOTAL_SUM = " + TOTAL_SUM);
        long end = System.currentTimeMillis();
        System.out.println("time = " + (end - start) + "ms");

    }

    static class SinThread extends Thread {
        List<Integer> nums;
        String name;


        public SinThread(List<Integer> nums, String name) {
            this.nums = nums;
            this.name = name;
        }


        @Override
        public void run() {
            double sum = 0.0;
            for (Integer num : nums) {
                sum += Math.sin(num);
            }
            System.out.println(name + " sum = " + sum);

            synchronized (lock) {
                TOTAL_SUM += sum;
            }
        }


    }
}
