/**
 * @author ywq
 * @date 2020/11/5 16:33
 */
public class Zhuren extends Leader{
    public Zhuren(String name) {
        super(name);
    }

    public Zhuren(String name, Leader successor) {
        super(name, successor);
    }

    @Override
    public void Cai(Caigou cg) {
        if(cg.getMoney()<=10000){
            System.out.println(name+"同意审批这个"+cg.getMoney()+"元的采购单");
        }else {
            System.out.println(name+"不能审批一万元以上的采购单");
            this.successor.Cai(cg);
        }
    }
}
