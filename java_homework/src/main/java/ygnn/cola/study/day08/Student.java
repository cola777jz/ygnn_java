package ygnn.cola.study.day08;

/**
 * @author Cola0817
 * @name Student
 * @date 2023/9/25 22:35
 * @since 1.0.0
 */
public class Student {
    private String name;
    private Integer age;
    private String school;

    public Student() {
    }

    public Student(String name, Integer age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", school='" + school + '\'' +
            '}';
    }
}
