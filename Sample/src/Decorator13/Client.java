package Decorator13;

/**
 * @author ywq
 * @date 2020/11/22 13:27
 */
public class Client {
    public static void main(String[] args) {
        Transform t;
        t=new Car();
        t.move();
        Robot r=new Robot(t);
        r.say();
        r.move();
    }
}
