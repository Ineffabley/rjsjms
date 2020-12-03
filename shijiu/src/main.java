/**
 * @author ywq
 * @date 2020/11/19 18:48
 */
public class main {
    public static void main(String[] args) {
        Abchatroom room=new Room();
        Member m1,m2,m3;
        m1=new Xin("新会员");
        m2=new Zuan("钻石会员");
        m3=new Pu("普通会员");
        room.register(m1);
        room.register(m2);
        room.register(m3);
        m1.sendText("普通会员","你好");
        m2.sendText("新会员","hello");
        m3.sendText("新会员","嘻嘻嘻");

        m3.sendImage("新会员","：1.jpg-----------------------------------------");
        m3.sendImage("普通会员","：2.jpg");
    }
}
