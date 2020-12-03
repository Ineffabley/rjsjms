package AbstractFactory06;

/**
 * @author ywq
 * @date 2020/11/18 20:12
 */
public class TCLAirconditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("TCL");
    }
}
