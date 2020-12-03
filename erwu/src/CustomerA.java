/**
 * @author ywq
 * @date 2020/12/3 16:16
 */
public class CustomerA implements Visitor {
    @Override
    public void visit(Apple element) {
        System.out.println("顾客A====="+element.operationA());
    }

    @Override
    public void visit(Books element) {
        System.out.println("顾客A====="+element.operationB());
    }
}
