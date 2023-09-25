package ygnn.cola.study.day13;

/**
 * @author Cola0817
 * @name Animal
 * @date 2023/9/25 22:53
 * @since 1.0.0
 */
public class Animal {
    private Integer age;

    public void eat(){
        System.out.println("Animal is eating. ");
    }

    public Animal() {
    }

    public Animal(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
