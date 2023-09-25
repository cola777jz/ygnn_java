package ygnn.cola.study.day13;

/**
 * @author Cola0817
 * @name Cat
 * @date 2023/9/25 22:55
 * @since 1.0.0
 */
public class Cat extends Animal {
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(Integer age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("A cat " + " is eating " + " which age`s " + super.getAge() + " name`s " + this.name);
    }

    @Override
    public String toString() {
        return "Cat{" +
            "name='" + name + '\'' +
            '}';
    }
}
