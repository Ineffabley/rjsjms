package SampleFactory04;

/**
 * @author ywq
 * @date 2020/11/18 19:45
 */
/*
* 具体产品类*/
public class HaierTV implements TV {

    @Override
    public void play() {
        System.out.println("海尔电视");
    }
}
