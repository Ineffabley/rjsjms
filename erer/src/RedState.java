/**
 * @author ywq
 * @date 2020/11/26 14:49
 */
public class RedState extends Astate{

    public RedState(Account ac, double yue) {
        super(ac, yue);
    }
    public void deposit(double amount) {
        yue += amount;
        System.out.println("存入成功！");
        System.out.println("当前余额："+yue);
    }
    public void check() {
        if(yue >= -1000 && yue < 0){
            ac.setsta(new YellowState(ac, yue));
        }else if(yue >= 0){
            ac.setsta(new GreenState(ac,yue));
        }
    }
    public void withdraw(double amount) {
        if(yue - amount > -1000){
            System.out.println("取钱成功！");
            yue -= amount;
            System.out.println("当前余额："+yue);
        }else{
            System.out.println("余额不足！");
            System.out.println("当前余额："+yue);
        }
    }
}
