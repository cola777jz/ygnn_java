package ygnn.cola.study.day31;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author Cola0817
 * @name SinThread
 * @date 2023/9/27 17:44
 * @since 1.0.0
 */
public class SinThread extends Thread {
    List<Integer> nums;
    String name;
    private final CountDownLatch latch;
    private double sum;



    public SinThread(List<Integer> nums, String name, CountDownLatch latch) {
        this.nums = nums;
        this.name = name;
        this.latch = latch;
    }

    public double getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (Integer num : nums) {
            sum += Math.sin(num);
        }
        System.out.println(name + " sum = " + sum);
        latch.countDown();
    }


}
