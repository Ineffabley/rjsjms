package Bridge11;

/**
 * @author ywq
 * @date 2020/11/21 22:13
 */
public class SmallPen extends Pen {
    @Override
    public void draw(String name) {
        System.out.println("小号绘制");
        String penType = "";
        this.color.bepaint(penType,name);
    }
}
