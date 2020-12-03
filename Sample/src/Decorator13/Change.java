package Decorator13;

/**
 * @author ywq
 * @date 2020/11/22 13:21
 */
//抽象装饰类
public class Change implements Transform {
    private Transform t;

    @Override
    public void move() {
        t.move();
    }

    public Change(Transform t) {
        this.t = t;
    }
}
