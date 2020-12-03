package Composite12;

/**
 * @author ywq
 * @date 2020/11/22 13:11
 */
public class Client {
    public static void main(String[] args) {
        MyElement obj1,obj2,obj3;
        Plate p1,p2,p3;
        obj1=new Apple();
        obj2=new Apple();
        p1=new Plate();
        p1.add(obj1);
        p1.add(obj2);

        obj3=new Banana();
        p2=new Plate();
        p2.add(obj3);

        p3=new Plate();
        p3.add(p1);
        p3.add(p2);
        p3.eat();




    }
}
