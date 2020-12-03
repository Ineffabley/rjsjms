import java.util.Hashtable;

/**
 * @author ywq
 * @date 2020/11/19 18:41
 */
public class Group extends Abchatroom {
    //用于记录群成员
    private Hashtable ms=new Hashtable();
    @Override
    public void register(Member m) {
        if(!ms.contains(m))
        {
            ms.put(m.getName(),m);
            m.setRoom(this);
        }
    }

    @Override
    public void sendText(String name, String receiver, String mess) {
        Member m=(Member)ms.get(receiver);
        String send=mess.replace("日","*");
        m.receivetext(name,send);


    }

    @Override
    public void sendImage(String name, String receiver, String image) {
        Member m= (Member) ms.get(receiver);
        if(image.length()>5)
        {
            System.out.println("图片过大,无法发送");
        }
        else
        {
            m.receiveimage(name,image);
        }
    }
}
