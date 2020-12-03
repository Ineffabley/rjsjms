/**
 * @author ywq
 * @date 2020/10/8 14:22
 */
public class SizePen implements AbstrationPen {
     private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override

    public void view() {
        System.out.println(this.size);
    }
}
