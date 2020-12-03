/**
 * @author ywq
 * @date 2020/11/19 19:11
 */
public class User {
    private String account;
    private String password;
    private String telNo;
    public String getAccount()
    {
        return account;
    }
    public void setAccount(String account)
    {
        this.account=account;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getTelNo()
    {
        return telNo;
    }
    public void setTelNo(String telNo)
    {
        this.telNo=telNo;
    }
    public Memento saveMemento()
    {
        return new Memento(account,password,telNo);
    }
    public void restoreMemento(Memento memento)
    {
        this.account=memento.getAccount();
        this.password=memento.getPassword();
        this.telNo=memento.getTelNo();
    }
    public void show()
    {
        System.out.println("账号是" + this.account);
        System.out.println("密码是" + this.password);
        System.out.println("电话是" + this.telNo);
    }
}
