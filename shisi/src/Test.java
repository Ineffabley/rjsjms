/**
 * @author ywq
 * @date 2020/11/5 16:06
 */
public class Test {
    public static void main(String[] args) {
        Proxy p=new Proxy();
        Real r=new Real();
        r.setAge(10);
        p.setr(r);
        System.out.print("15岁,");
        p.deng();
        r.setAge(20);
        p.setr(r);
        System.out.print("30岁,");
        p.deng();
    }
}
