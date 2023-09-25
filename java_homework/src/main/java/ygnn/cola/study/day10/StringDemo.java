package ygnn.cola.study.day10;

import java.util.Arrays;

/**
 * @author Cola0817
 * @name StringDemo
 * @date 2023/9/25 22:37
 * @since 1.0.0
 */
public class StringDemo {
    public static void main(String[] args) {
        String name = "Cola777";
        System.out.println("name.length() = " + name.length());
        System.out.println("name.charAt(0) = " + name.charAt(0));
        String school = "JinZhong Collage";
        System.out.println("name.equals(school) = " + name.equals(school));
        System.out.println("school.trim() = " + school.trim());
        String[] split = school.split(" ");
        Arrays.stream(split).forEach(System.out::println);

    }
}
