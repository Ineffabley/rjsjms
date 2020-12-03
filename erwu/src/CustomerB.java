/**
 * @author ywq
 * @date 2020/12/3 16:16
 */
public class CustomerB implements  Visitor{
    @Override
    public void visit(Apple element) {
        System.out.println("顾客B====="+element.operationA());
    }

    @Override
    public void visit(Books element) {
        System.out.println("顾客B====="+element.operationB());
    }
}
