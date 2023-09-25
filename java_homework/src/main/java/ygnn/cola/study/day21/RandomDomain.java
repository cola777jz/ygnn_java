package ygnn.cola.study.day21;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Cola0817
 * @name RandomDomain
 * @date 2023/9/25 23:31
 * @since 1.0.0
 */
public class RandomDomain {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] ids = new Integer[10];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = random.nextInt(1, 101);
        }
        Arrays.stream(ids).sorted((o1, o2) -> o2 - o1).forEach(System.out::println);
    }
}
