package Adapter10;

/**
 * @author ywq
 * @date 2020/11/21 22:03
 */
public class Client {
    public static void main(String[] args) {
        Robot r=new DogAdapter();
        r.cry();
        r.move();
    }
}
