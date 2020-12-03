package Bridge11;

/**
 * @author ywq
 * @date 2020/11/21 22:11
 */
public class BigPen extends Pen {

    @Override
    public void draw(String name) {
        System.out.println("大号毛笔绘制");
        String penTYpe = "";
        this.color.bepaint(penTYpe,name);
    }
}
