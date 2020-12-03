/**
 * @author ywq
 * @date 2020/11/19 18:37
 */
public class Xin extends Member{
    public Xin(String a){
        super(a);
    }
    public void sendText(String a,String mess){
        System.out.println("新会员发送消息");
        room.sendText(name,a,mess);
    }
    public void sendImage(String a,String image){
        System.out.println("新会员不能发送图片");
        room.sendImage(name,a,image);
    }
}
