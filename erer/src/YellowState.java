/**
 * @author ywq
 * @date 2020/11/26 14:50
 */
public class YellowState extends Astate {
    public YellowState(Account ac, double yue) {
        super(ac, yue);
    }
    public void deposit(double amount) {
        System.out.println("存入成功！");
        yue += amount;
        System.out.println("当前余额："+yue);
    }
    public void check() {
        if(yue >=0 ){
            ac.setsta(new GreenState(ac,yue));
        }else if(yue < -1000){
            ac.setsta(new RedState(ac,yue));
        }
    }
    public void withdraw(double amount) {
        if(yue - amount > -1000){
            System.out.println("取钱成功");
            yue -= amount;
            System.out.println("当前余额："+yue);
        }else{
            System.err.println("余额不足！");
            System.out.println("当前余额："+yue);
        }
    }
}
