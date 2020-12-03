package Bridge11;

/**
 * @author ywq
 * @date 2020/11/21 22:08
 */
public class Green  implements Color{
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType+"绿色的"+name+"==========");

    }
}
