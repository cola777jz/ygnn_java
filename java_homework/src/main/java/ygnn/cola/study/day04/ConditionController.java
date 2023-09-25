package ygnn.cola.study.day04;

/**
 * @author Cola0817
 * @name ConditionController
 * @date 2023/9/25 22:27
 * @since 1.0.0
 */
public class ConditionController {
    public static void main(String[] args) {
        int num_0 = 0;
        int num_1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                num_0 += i;
            }
            if (i % 2 == 1){
                num_1 += i;
            }
        }
        System.out.println("1 - 100 偶数 = " + num_0);
        System.out.println("1 - 100 奇数 = " + num_1);
    }
}
