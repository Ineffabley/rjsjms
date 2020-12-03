/**
 * @author ywq
 * @date 2020/12/3 16:15
 */
public class Books implements Element {
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
    public String operationB()
    {
        return "购买图书";
    }
}
