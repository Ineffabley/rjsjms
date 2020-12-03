/**
 * @author ywq
 * @date 2020/12/3 16:15
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure os=new ObjectStructure();
        os.add(new Apple());
        os.add(new Books());
        Visitor visitor=new CustomerA();
        os.accept(visitor);
        System.out.println();
        visitor=new CustomerB();
        os.accept(visitor);
    }
}
