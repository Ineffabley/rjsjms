package Proxy16;

/**
 * @author ywq
 * @date 2020/11/22 22:57
 */
public class PermissionProxy implements AbstractPermission{
    private RealPermission p=new RealPermission();
    private int level=0;

    @Override
    public void modifyUserInfo() {
       if(0==level)
       {
           System.out.println("你没有该权限");
       }
       else if(1==level)
       {
           p.modifyUserInfo();
       }
    }

    @Override
    public void viewNote() {
        System.out.println("查看帖子");
    }

    @Override
    public void publishNote() {
        if(0==level)
        {
            System.out.println("你没有该权限");
        }
        else if(1==level)
        {
            p.publishNote();
        }
    }

    @Override
    public void modifyNote() {
        if(0==level)
        {
            System.out.println("你没有该权限");
        }
        else if(1==level)
        {
            p.modifyNote();
        }
    }

    @Override
    public void setLevel(int level) {
              this.level=level;
    }
}
