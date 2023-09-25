package ygnn.cola.study.day05;

import java.util.Random;

/**
 * @author Cola0817
 * @name Random2Array
 * @date 2023/9/25 22:29
 * @since 1.0.0
 */
public class Random2Array {
    public static final int COUNTS = 10;
    public static void main(String[] args) {
        int[] array = new int[COUNTS];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,101);
            sum += array[i];
        }
        System.out.println("sum = " + sum);


    }
}
