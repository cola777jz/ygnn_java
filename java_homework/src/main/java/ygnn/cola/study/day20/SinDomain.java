package ygnn.cola.study.day20;

/**
 * @author Cola0817
 * @name SinDomain
 * @date 2023/9/25 23:34
 * @since 1.0.0
 */
public class SinDomain {
    public static void main(String[] args) {
        double sum = 0.0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000_0000; i++) {
            sum += Math.sin(i);
        }
        System.out.println("sum = " + sum);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + " ms");
    }
}
