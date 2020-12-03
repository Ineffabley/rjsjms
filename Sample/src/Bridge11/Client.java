package Bridge11;

/**
 * @author ywq
 * @date 2020/11/21 22:19
 */
public class Client {
    public static void main(String[] args) {
        Color color;
        Pen pen;
        color=new Red();
        pen=new BigPen();
        pen.setColor(color);
        pen.draw("鲜花");
    }
}
