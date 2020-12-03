import java.util.HashMap;
import java.util.Map;

/**
 * @author ywq
 * @date 2020/11/19 18:50
 */
public class Room extends Abchatroom {
    Map<String,Member> table=new HashMap<>();

    @Override
    public void register(Member m) {
        table.put(m.getName(),m);
        m.setRoom(this);
    }

    @Override
    public void sendText(String from, String to, String mess) {
        if(mess.length()>=100)
        {
            System.out.println("超过100个字符,发送失败");
        }
        else
        {
            Member member=table.get(to);
            if(member!=null)
            {
                member.receivetext(from,mess);
            }
        }

    }

    @Override
    public void sendImage(String from, String to, String image) {
        if(image.length()>20)
        {
            System.out.println("图片超过20M,发送失败");
        }
        else
        {
            Member member=table.get(to);
            if(member!=null)
            {
                member.receiveimage(from,image);
            }
        }
    }
}
