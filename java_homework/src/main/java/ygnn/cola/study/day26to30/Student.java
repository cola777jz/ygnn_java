package ygnn.cola.study.day26to30;

/**
 * @author Cola0817
 * @name Student
 * @date 2023/9/27 16:56
 * @since 1.0.0
 */
public class Student {
    private String name;
    private Integer age;
    private Integer month;

    public Student() {
    }

    public Student(String name, Integer age, Integer month) {
        this.name = name;
        this.age = age;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", month=" + month +
            '}';
    }
}
