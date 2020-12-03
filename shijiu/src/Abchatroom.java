/**
 * @author ywq
 * @date 2020/11/19 18:30
 */
public  abstract class Abchatroom {
    public abstract void register(Member m);
    public abstract void sendText(String name, String a, String mess);

    public abstract void sendImage(String name, String a, String image) ;
}
