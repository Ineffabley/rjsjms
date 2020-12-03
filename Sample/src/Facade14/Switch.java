package Facade14;

/**
 * @author ywq
 * @date 2020/11/22 22:25
 */
//总开关类 外观类
public class Switch {
    private  Light ligths[]=new Light[4];
    private  Fan fan;
    private  Air air;

    public Switch() {
        ligths[0]=new Light("左前");
        ligths[1]=new Light("右前");
        ligths[2]=new Light("左后");
        ligths[3]=new Light("右后");
        fan=new Fan();
        air=new Air();

    }

    public  void on()
    {
        ligths[0].on();
        ligths[1].on();
        ligths[2].on();
        ligths[3].on();
        fan.on();
        air.on();

    }

    public void off()
    {
        ligths[0].off();
        ligths[1].off();
        ligths[2].off();
        ligths[3].off();
        fan.off();
        air.off();
    }
}
