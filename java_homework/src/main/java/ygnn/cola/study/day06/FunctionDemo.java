package ygnn.cola.study.day06;

/**
 * @author Cola0817
 * @name FunctionDemo
 * @date 2023/9/25 22:33
 * @since 1.0.0
 */
public class FunctionDemo {
    public static void main(String[] args) {
        System.out.println("sum = " + getSum());
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
