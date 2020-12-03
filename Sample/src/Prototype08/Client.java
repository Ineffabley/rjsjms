package Prototype08;

/**
 * @author ywq
 * @date 2020/11/21 20:02
 */
public class Client {
    public static void main(String[] args) {
        Email email,copyEmail;
        email=new Email();
        copyEmail=(Email)email.clone();

        System.out.println(email==copyEmail);  //false,clone出来的两个变量不同

        System.out.println(email.getAttatchment()==copyEmail.getAttatchment());   //true,引用的值相同

    }
}
