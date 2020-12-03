package FactoryMethod05;

/**
 * @author ywq
 * @date 2020/11/18 19:58
 */
public class HaierTV implements  TV {

    @Override
    public void play() {
        System.out.println("海尔");
    }
}
