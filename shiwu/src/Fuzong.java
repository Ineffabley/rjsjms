/**
 * @author ywq
 * @date 2020/11/5 16:22
 */
public class Fuzong  extends Leader{
    public Fuzong(String name) {
        super(name);
    }


    public Fuzong(String name, Leader successor) {
        super(name, successor);
    }

    @Override
    public void Cai(Caigou cg) {
        if(cg.getMoney()<=100000)
        {
            System.out.println(name+"同意审批这个"+cg.getMoney()+"元的采购单");
        }
        else
        {
            System.out.println(name+"不能审批十万元以上的采购单");
            this.successor.Cai(cg);
        }
    }
}
