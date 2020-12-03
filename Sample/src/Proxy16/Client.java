package Proxy16;

/**
 * @author ywq
 * @date 2020/11/22 23:00
 */
public class Client {
    public static void main(String[] args) {
        AbstractPermission p=new PermissionProxy();
        p.modifyNote();
        p.modifyUserInfo();
        p.viewNote();
        p.publishNote();
        System.out.println("===========================================");
        p.setLevel(1);
        p.modifyNote();
        p.modifyUserInfo();
        p.viewNote();
        p.publishNote();
    }
}
