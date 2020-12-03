package FactoryMethod05;

/**
 * @author ywq
 * @date 2020/11/18 20:00
 */
public class HaierTVFactory implements TVFactory {

    @Override
    public TV produceTV() {
        System.out.println("海尔生产");
        return new  HaierTV();
    }
}
