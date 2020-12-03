/**
 * @author ywq
 * @date 2020/11/26 14:58
 */
public class main {
    public static void main(String[] args) {
        Person p1=new Person("张三");
        p1.setfang(new Feiji());
        Person p2=new Person("李四");
        p2.setfang(new Huoche());
        p1.travel();
        p2.travel();
    }
}