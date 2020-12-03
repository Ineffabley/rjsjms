/**
 * @author ywq
 * @date 2020/12/3 16:15
 */
public class Apple implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationA()
    {
        return "购买苹果";
    }
}
