package SampleFactory04;

/**
 * @author ywq
 * @date 2020/11/18 19:52
 */
public class main {
    public static void main(String[] args) throws Exception {
        String brand="Haier";
        TV tv=TVFactory.prodecrTV(brand);
        tv.play();
    }
}
