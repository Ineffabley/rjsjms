package Facade14;

/**
 * @author ywq
 * @date 2020/11/22 20:04
 */
//子系统类
public class Light {
    private String place;

    public Light(String place) {
        this.place = place;
    }

    public void on()
    {
        System.out.println(this.place+"=======>打开灯");
    }

    public void off()
    {
        System.out.println(this.place+"=======>关灯");
    }


}
