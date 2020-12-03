package Flyweight15;

/**
 * @author ywq
 * @date 2020/11/22 22:37
 */
public class Hub implements NetworkDevice {
    public  String type;

    @Override
    public String getType() {
        return this.type;
    }

    public Hub(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("连接集线器===="+this.type);
    }
}
