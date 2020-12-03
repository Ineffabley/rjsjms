/**
 * @author ywq
 * @date 2020/11/19 18:28
 */
public class Zuan extends Member{

    public Zuan(String name) {
        super(name);
    }

    @Override
    public void sendText(String a, String mess) {
        System.out.println("钻石会员发送消息");
        room.sendText(name,a,mess);
    }

    @Override
    public void sendImage(String a, String image) {
        System.out.println("钻石会员发送图片");
        room.sendImage(name,a,image);
    }
}
