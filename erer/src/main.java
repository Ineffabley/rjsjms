/**
 * @author ywq
 * @date 2020/11/26 14:50
 */
public class main {
    public static void main(String args[]){
        Account acc=new Account("账户",100);
        acc.deposit(20000);
        acc.withdraw(50000);
        acc.withdraw(30000);
    }
}
