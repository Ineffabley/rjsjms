/**
 * @author ywq
 * @date 2020/11/26 14:49
 */
public class Account {
    private Astate state;
    private String ren;
    public Account(String a,double b){
        ren=a;
        state=new YellowState(this,b);
        state.check();
    }
    public void setsta(Astate a){
        state=a;
    }
    public void deposit(double a){
        System.out.println(ren+"存入了"+a);
        state.deposit(a);
        state.check();
        System.out.println();
    }
    public void withdraw(double a){
        System.out.println(ren+"取走了"+a);
        state.withdraw(a);
        state.check();
        System.out.println();
    }
}