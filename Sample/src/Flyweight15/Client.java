package Flyweight15;

/**
 * @author ywq
 * @date 2020/11/22 22:47
 */
public class Client {
    public static void main(String[] args) {
        NetworkDevice n1,n2,n3,n4;
        DeviceFactory df=new DeviceFactory();

        n1=df.getNetworkDevice("cisco");
        n1.use();

        n2=df.getNetworkDevice("cisco");
        n2.use();
        n3=df.getNetworkDevice("tp");
        n3.use();

        n4=df.getNetworkDevice("tp");
        n4.use();

        System.out.println("Total Device"+df.getTotalDevice());
        System.out.println("Terminal"+df.getTotal());

    }
}
