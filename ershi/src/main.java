/**
 * @author ywq
 * @date 2020/11/19 19:11
 */
public class main {
    public static void main(String args[]) {
        User user = new User();
        Ctake c = new Ctake();
        user.setAccount("123456");
        user.setPassword("123466");
        user.setTelNo("001");
        System.out.println("这是第一个");
        user.show();
        c.addMemento(user.saveMemento());
        System.out.println("-----");
        user.setPassword("1234");
        user.setTelNo("002");
        System.out.println("这是第二个");
        user.show();
        c.addMemento(user.saveMemento());
        System.out.println("-----");
        user.setPassword("123");
        user.setTelNo("003");
        System.out.println("这是第三个");
        user.show();
        System.out.println("-----");
        user.restoreMemento(c.preMemento());
        System.out.println("回到第二次");
        user.show();
        System.out.println("-----");
        user.restoreMemento(c.preMemento());
        System.out.println("回到第一次");
        user.show();
        System.out.println("-----");
    }
}