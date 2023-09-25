package ygnn.cola.study.day15;

/**
 * @author Cola0817
 * @name TV
 * @date 2023/9/25 23:13
 * @since 1.0.0
 */
public class TV implements MovieAble{
    private MovieAble target;

    public TV() {
    }

    public TV(MovieAble target) {
        this.target = target;
    }

    @Override
    public void movie() {
        if (target != null){
            target.movie();
        }
    }
}
