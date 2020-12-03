/**
 * @author ywq
 * @date 2020/11/26 14:49
 */
public class GreenState extends Astate{
    public GreenState(Account a,double b){
        super(a,b);
    }
    public void deposit(double a){
        yue+=a;
        System.out.println("存款成功");
        System.out.println("余额为"+yue);
    }
    public void check(){
        if(yue<-1000){
            ac.setsta(new RedState(ac,yue));
        }else if(yue>=-1000&&yue<0){
            ac.setsta(new YellowState(ac,yue));
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
