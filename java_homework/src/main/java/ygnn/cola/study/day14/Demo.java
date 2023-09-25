package ygnn.cola.study.day14;

/**
 * @author Cola0817
 * @name Demo
 * @date 2023/9/25 23:06
 * @since 1.0.0
 */
public class Demo {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(),new Animal()};
        welcome(animals);
    }

    public static void welcome(Animal[] animal){
        for (Animal item : animal) {
            item.sayHello();
        }
    }
}
