package ygnn.cola.study.day15;

/**
 * @author Cola0817
 * @name Computer
 * @date 2023/9/25 23:11
 * @since 1.0.0
 */
public class Computer implements StartAble, EndAble {
    @Override
    public void end() {
        System.out.println("computer is end");
    }

    @Override
    public void start() {
        System.out.println("computer is start");
    }
}
