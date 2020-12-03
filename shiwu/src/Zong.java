/**
 * @author ywq
 * @date 2020/11/5 16:27
 */
public class Zong extends Leader{

    public Zong(String name) {
        super(name);
    }

    public Zong(String name, Leader successor) {
        super(name, successor);
    }

    @Override
    public void Cai(Caigou cg) {
        if(cg.getMoney()<=200000)
        {
            System.out.println(name+"同意审批这个"+cg.getMoney()+"元的采购单");
        }
        else
        {
            System.out.println(name+"不能审批二十万元以上的采购单");
            System.out.println("需要召开职工大会");        }
    }
}
