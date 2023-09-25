package ygnn.cola.study.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * @author Cola0817
 * @name ArrayListDemo
 * @date 2023/9/25 22:42
 * @since 1.0.0
 */
public class ArrayListDemo {
    public static final int COUNTS = 100;
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < COUNTS; i++) {
            Student student = new Student(
                random.nextInt(16, 100),
                random.nextBoolean()
            );
            students.add(student);
        }

        System.out.println("过滤前: ");
        students.forEach(System.out::println);

        List<Student> list = students
            .stream().filter(Objects::nonNull)
            .filter(student -> !student.getBoy())
            .filter(student -> 18 <= student.getAge())
            .filter(student -> student.getAge() <= 22)
            .toList();

        System.out.println("过滤后：");
        list.forEach(System.out::println);

    }
}
