package AbstractFactory06;

/**
 * @author ywq
 * @date 2020/11/18 20:15
 */
public class HaierFactory implements EFactory {
    @Override
    public TV produceTV() {
        return new HaierTV();
    }

    @Override
    public AirConditioner prodeceAC() {
        return new HaierAirConditioner();
    }
}
