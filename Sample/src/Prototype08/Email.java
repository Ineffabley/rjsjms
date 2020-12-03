package Prototype08;



/**
 * @author ywq
 * @date 2020/11/21 19:55
 */
public class Email implements Cloneable {
    private  Attatchment attatchment=null;

    public Email() {
    }
    public Object clone()
    {
        Email clone=null;
        try {
            clone=(Email)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public Attatchment getAttatchment() {
        return attatchment;
    }
    public void display()
    {
        System.out.println("查看附件");
    }
}