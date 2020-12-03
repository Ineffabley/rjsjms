package Decorator13;

/**
 * @author ywq
 * @date 2020/11/22 13:22
 */
//具体装饰类
public class Robot  extends Change{

    public Robot(Transform t) {
        super(t);
        System.out.println("=====变成机器人====");  //扩展原有对象的功能
    }

    public void say()
    {
        System.out.println("说话!!");
    }
}
