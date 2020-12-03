package Proxy16;

/**
 * @author ywq
 * @date 2020/11/22 22:55
 */
public class RealPermission implements AbstractPermission {
    @Override
    public void modifyUserInfo() {
        System.out.println("修改用户信息");
    }

    @Override
    public void viewNote() {

    }

    @Override
    public void publishNote() {
        System.out.println("发布新帖");
    }

    @Override
    public void modifyNote() {
        System.out.println("修改发帖内容");
    }

    @Override
    public void setLevel(int level) {

    }
}
