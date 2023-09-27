package ygnn.cola.study.day26to30;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Cola0817
 * @name ClassMapDemo
 * @date 2023/9/27 17:18
 * @since 1.0.0
 */
public class ClassMapDemo {

    private static final File FILE = new File("./classMap.csv");

    public static void main(String[] args) {
        int[] counts = {48, 53, 62};
        Map<String, List<Student>> map = randomClass(counts);

/*        System.out.println("写入到 csv");
        writeInfo2CSV(map);*/

        System.out.println("从 CSV 中读取");
        List<Student> students = readFromCSV();

        Map<Integer, List<Student>> listMap = students.stream().collect(Collectors.groupingBy(Student::getMonth));

        printMapInfo(listMap);
    }

    public static Map<String, List<Student>> randomClass(int[] counts) {
        String classNamePrefix = "class_";
        int classIndex = 1;
        Map<String, List<Student>> classMap = new HashMap<>();
        Random random = new Random();

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

    public static void printMapInfo(Map<?, List<Student>> map) {
        map.forEach((o, students) -> {
            System.out.println(o);
            students.forEach(System.out::println);
        });
    }

    public static void writeInfo2CSV(Map<String, List<Student>> map) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE))) {
            for (String key : map.keySet()) {
                for (Student student : map.get(key)) {
                    writer.write(student.toString() + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Student> readFromCSV(){
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))){
            String line;
            while ((line = reader.readLine()) != null){
                Pattern pattern = Pattern.compile("Student\\{name='(.+)', age=(\\d+), month=(\\d+)\\}");
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()){
                    String name = matcher.group(1);
                    int age = Integer.parseInt(matcher.group(2));
                    int month = Integer.parseInt(matcher.group(3));

                    // 创建Student对象并添加到List中
                    Student student = new Student(name, age, month);
                    students.add(student);
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        return students;
    }

}
