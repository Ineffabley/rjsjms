package Bridge11;

/**
 * @author ywq
 * @date 2020/11/21 22:06
 */
/*具体实现类*/
public class Red implements Color {

    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType+"红色的"+name+"==========");
    }
}
