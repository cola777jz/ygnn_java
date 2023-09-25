package ygnn.cola.study.day15;

/**
 * @author Cola0817
 * @name TVDomain
 * @date 2023/9/25 23:14
 * @since 1.0.0
 */
public class TVDomain {
    public static void main(String[] args) {

        TV tv = new TV(new MovieAble() {
            @Override
            public void movie() {
                System.out.println("tv is moving");
            }
        });

        tv.movie();

    }
}
