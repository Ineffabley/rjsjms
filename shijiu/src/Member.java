/**
 * @author ywq
 * @date 2020/11/19 18:29
 */
public abstract class Member {
    protected Abchatroom room;
    protected String name;

    public Member(String name) {
        this.name = name;
    }

    public Abchatroom getRoom() {
        return room;
    }

    public void setRoom(Abchatroom room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*发送文字消息*/
    public abstract void sendText(String a,String mess);
    /*发送图片消息*/
    public abstract void sendImage(String a,String image);

    public void receivetext(String a,String mess){
        System.out.println(a+"发送的给"+name+"内容是"+mess);
    }
    public void receiveimage(String a,String image){
        System.out.println(a+"发送的给"+name+"内容是"+image);
    }

}
