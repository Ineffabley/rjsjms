package AbstractFactory06;

/**
 * @author ywq
 * @date 2020/11/18 20:13
 */
public class HaierAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("海尔");
    }
}
