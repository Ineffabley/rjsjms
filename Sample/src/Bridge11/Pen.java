package Bridge11;

/**
 * @author ywq
 * @date 2020/11/21 22:09
 */
public abstract class Pen {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }
    public abstract void draw(String name);
}
