package Decorator13;

/**
 * @author ywq
 * @date 2020/11/22 13:19
 */
//具体构件类
public  final class Car implements Transform {
    @Override
    public void move() {
        System.out.println("在陆地上移动==========");
    }

    public Car() {
        System.out.println("擎天柱变身成一辆车");
    }
}
