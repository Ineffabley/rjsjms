package Decorator13;

/**
 * @author ywq
 * @date 2020/11/22 13:24
 */

/*具体装饰类*/
public class Airplane  extends Change{

    public Airplane(Transform t) {
        super(t);
        System.out.println("变成飞机");

    }

    public void fly() {
        System.out.println("飞啊飞");
    }
}
