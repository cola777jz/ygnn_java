package ygnn.cola.study.day11;

/**
 * @author Cola0817
 * @name Student
 * @date 2023/9/25 22:42
 * @since 1.0.0
 */
public class Student {
    private Integer age;
    private Boolean isBoy;

    public Student() {
    }

    public Student(Integer age, Boolean isBoy) {
        this.age = age;
        this.isBoy = isBoy;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoy() {
        return isBoy;
    }

    public void setBoy(Boolean boy) {
        isBoy = boy;
    }

    @Override
    public String toString() {
        return "Student{" +
            "age=" + age +
            ", isBoy=" + isBoy +
            '}';
    }
}
