package ygnn.cola.study.day31;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author Cola0817
 * @name DoThreadV2
 * @date 2023/9/27 18:03
 * @since 1.0.0
 */
public class DoThreadV2 {
    private static final File FILE = new File("./sin-num.csv");
    private static final List<List<Integer>> subList = new ArrayList<>();
    private static final int NUM_COUNT = 1000_0000;
    private static final int NUM_THREAD = 10;
    private static final int count = NUM_COUNT / NUM_THREAD;
    private static final CountDownLatch latch = new CountDownLatch(NUM_THREAD);
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
                    "Thread-" + i,
                    latch
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

        latch.await();

        double totalSum = 0.0;
        for (SinThread thread : threads) {
            totalSum += thread.getSum();
        }
        System.out.println("totalSum = " + totalSum);
        long end = System.currentTimeMillis();
        System.out.println("time = " + (end - start) + "ms");

    }
}
