package ygnn.cola.study.day22to25;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Cola0817
 * @name ClassMapDemo
 * @date 2023/9/27 16:58
 * @since 1.0.0
 */
public class ClassMapDemo {
    public static void main(String[] args) {
        /**
         * 随机生成 3 个班 每个班 42，53，62 人
         * age 18 - 20
         * month 1 - 12
         */
        int[] counts = {48, 53, 62};

        Map<String, List<Student>> map = randomClass(counts);
        System.out.println("生成的班级信息：");
        printMap(map);

        Map<Integer, List<Student>> countedByMonth = countByMonth(map);

        System.out.println("统计每个月的学生：");
        printMap(countedByMonth);



    }

    /**
     * 根据传入的 counts 生成对应的班级
     *
     * @param counts counts
     * @return 生成的班级
     */
    public static Map<String, List<Student>> randomClass(int[] counts) {
        String classNamePrefix = "class_";
        int classIndex = 1;
        Random random = new Random();
        Map<String, List<Student>> classMap = new HashMap<>();

        for (int count : counts) {
            List<Student> students = new ArrayList<>();
            String className = classNamePrefix + classIndex;
            while (count != 0) {
                Student student = new Student(
                    "student_" + count + "_" + classIndex,
                    random.nextInt(18, 21),
                    random.nextInt(1, 13)
                );
                students.add(student);
                count--;
            }
            classMap.put(className, students);
            classIndex++;
        }
        return classMap;
    }

    /**
     * 将 classMap 中的学生按照 month 重新分组
     * @param classMap classMap
     * @return 分组后的学生 map
     */
    public static Map<Integer, List<Student>> countByMonth(Map<String, List<Student>> classMap) {
        Map<Integer, List<Student>> mapByMonth = new HashMap<>();

        mapByMonth =
            classMap
                .values()
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Student::getMonth));

        return mapByMonth;
    }

    /**
     * 打印输出 map
     * @param map map
     */
    public static void printMap(Map<?,List<Student>> map){
        for (Object key : map.keySet()) {
            System.out.println("key = " + key);
            map.get(key).forEach(System.out::println);
        }
    }
}
