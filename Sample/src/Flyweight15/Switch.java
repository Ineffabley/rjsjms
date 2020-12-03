package Flyweight15;

/**
 * @author ywq
 * @date 2020/11/22 22:36
 */
public class Switch implements NetworkDevice {
    private  String type;

    public Switch(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("连接交换机=====类型是==="+this.type);
    }
}
