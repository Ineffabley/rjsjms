package AbstractFactory06;

/**
 * @author ywq
 * @date 2020/11/18 20:18
 */
public class TCLFactory implements EFactory {
    @Override
    public TV produceTV() {
        return new TCLTV();
    }

    @Override
    public AirConditioner prodeceAC() {
        return new HaierAirConditioner();
    }
}
