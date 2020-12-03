/**
 * @author ywq
 * @date 2020/11/26 14:49
 */
public abstract class Astate {
    protected Account ac;
    protected double yue;
    public Astate(Account a,double b){
        super();
        ac=a;
        yue=b;
    }
    public abstract void deposit(double a);
    public abstract void check();
    public abstract void withdraw(double a);
}