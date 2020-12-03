package Proxy16;

/**
 * @author ywq
 * @date 2020/11/22 22:53
 */

//抽象权限类
public interface AbstractPermission {
    public void modifyUserInfo();
    public void viewNote();
    public void publishNote();
    public void modifyNote();
    public void setLevel(int level);

}
